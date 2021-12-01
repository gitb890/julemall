<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="" prop="couponId">
      <el-input v-model="dataForm.couponId" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="productCategoryId">
      <el-input v-model="dataForm.productCategoryId" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="产品分类名称" prop="productCategoryName">
      <el-input v-model="dataForm.productCategoryName" placeholder="产品分类名称"></el-input>
    </el-form-item>
    <el-form-item label="父分类名称" prop="parentCategoryName">
      <el-input v-model="dataForm.parentCategoryName" placeholder="父分类名称"></el-input>
    </el-form-item>
    </el-form>
    <span slot="footer" class="dialog-footer">
      <el-button @click="visible = false">取消</el-button>
      <el-button type="primary" @click="dataFormSubmit()">确定</el-button>
    </span>
  </el-dialog>
</template>

<script>
  export default {
    data () {
      return {
        visible: false,
        dataForm: {
          id: 0,
          couponId: '',
          productCategoryId: '',
          productCategoryName: '',
          parentCategoryName: ''
        },
        dataRule: {
          couponId: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          productCategoryId: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          productCategoryName: [
            { required: true, message: '产品分类名称不能为空', trigger: 'blur' }
          ],
          parentCategoryName: [
            { required: true, message: '父分类名称不能为空', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      init (id) {
        this.dataForm.id = id || 0
        this.visible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].resetFields()
          if (this.dataForm.id) {
            this.$http({
              url: this.$http.adornUrl(`/coupon/couponproductcategoryrelation/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.couponId = data.couponProductCategoryRelation.couponId
                this.dataForm.productCategoryId = data.couponProductCategoryRelation.productCategoryId
                this.dataForm.productCategoryName = data.couponProductCategoryRelation.productCategoryName
                this.dataForm.parentCategoryName = data.couponProductCategoryRelation.parentCategoryName
              }
            })
          }
        })
      },
      // 表单提交
      dataFormSubmit () {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            this.$http({
              url: this.$http.adornUrl(`/coupon/couponproductcategoryrelation/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'couponId': this.dataForm.couponId,
                'productCategoryId': this.dataForm.productCategoryId,
                'productCategoryName': this.dataForm.productCategoryName,
                'parentCategoryName': this.dataForm.parentCategoryName
              })
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.$message({
                  message: '操作成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.visible = false
                    this.$emit('refreshDataList')
                  }
                })
              } else {
                this.$message.error(data.msg)
              }
            })
          }
        })
      }
    }
  }
</script>
