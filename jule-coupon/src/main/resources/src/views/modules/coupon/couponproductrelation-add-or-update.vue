<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="" prop="couponId">
      <el-input v-model="dataForm.couponId" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="productId">
      <el-input v-model="dataForm.productId" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="商品名称" prop="productName">
      <el-input v-model="dataForm.productName" placeholder="商品名称"></el-input>
    </el-form-item>
    <el-form-item label="商品编码" prop="productSn">
      <el-input v-model="dataForm.productSn" placeholder="商品编码"></el-input>
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
          productId: '',
          productName: '',
          productSn: ''
        },
        dataRule: {
          couponId: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          productId: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          productName: [
            { required: true, message: '商品名称不能为空', trigger: 'blur' }
          ],
          productSn: [
            { required: true, message: '商品编码不能为空', trigger: 'blur' }
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
              url: this.$http.adornUrl(`/coupon/couponproductrelation/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.couponId = data.couponProductRelation.couponId
                this.dataForm.productId = data.couponProductRelation.productId
                this.dataForm.productName = data.couponProductRelation.productName
                this.dataForm.productSn = data.couponProductRelation.productSn
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
              url: this.$http.adornUrl(`/coupon/couponproductrelation/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'couponId': this.dataForm.couponId,
                'productId': this.dataForm.productId,
                'productName': this.dataForm.productName,
                'productSn': this.dataForm.productSn
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
