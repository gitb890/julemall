<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="" prop="flashPromotionId">
      <el-input v-model="dataForm.flashPromotionId" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="编号" prop="flashPromotionSessionId">
      <el-input v-model="dataForm.flashPromotionSessionId" placeholder="编号"></el-input>
    </el-form-item>
    <el-form-item label="" prop="productId">
      <el-input v-model="dataForm.productId" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="限时购价格" prop="flashPromotionPrice">
      <el-input v-model="dataForm.flashPromotionPrice" placeholder="限时购价格"></el-input>
    </el-form-item>
    <el-form-item label="限时购数量" prop="flashPromotionCount">
      <el-input v-model="dataForm.flashPromotionCount" placeholder="限时购数量"></el-input>
    </el-form-item>
    <el-form-item label="每人限购数量" prop="flashPromotionLimit">
      <el-input v-model="dataForm.flashPromotionLimit" placeholder="每人限购数量"></el-input>
    </el-form-item>
    <el-form-item label="排序" prop="sort">
      <el-input v-model="dataForm.sort" placeholder="排序"></el-input>
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
          flashPromotionId: '',
          flashPromotionSessionId: '',
          productId: '',
          flashPromotionPrice: '',
          flashPromotionCount: '',
          flashPromotionLimit: '',
          sort: ''
        },
        dataRule: {
          flashPromotionId: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          flashPromotionSessionId: [
            { required: true, message: '编号不能为空', trigger: 'blur' }
          ],
          productId: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          flashPromotionPrice: [
            { required: true, message: '限时购价格不能为空', trigger: 'blur' }
          ],
          flashPromotionCount: [
            { required: true, message: '限时购数量不能为空', trigger: 'blur' }
          ],
          flashPromotionLimit: [
            { required: true, message: '每人限购数量不能为空', trigger: 'blur' }
          ],
          sort: [
            { required: true, message: '排序不能为空', trigger: 'blur' }
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
              url: this.$http.adornUrl(`/coupon/flashpromotionproductrelation/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.flashPromotionId = data.flashPromotionProductRelation.flashPromotionId
                this.dataForm.flashPromotionSessionId = data.flashPromotionProductRelation.flashPromotionSessionId
                this.dataForm.productId = data.flashPromotionProductRelation.productId
                this.dataForm.flashPromotionPrice = data.flashPromotionProductRelation.flashPromotionPrice
                this.dataForm.flashPromotionCount = data.flashPromotionProductRelation.flashPromotionCount
                this.dataForm.flashPromotionLimit = data.flashPromotionProductRelation.flashPromotionLimit
                this.dataForm.sort = data.flashPromotionProductRelation.sort
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
              url: this.$http.adornUrl(`/coupon/flashpromotionproductrelation/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'flashPromotionId': this.dataForm.flashPromotionId,
                'flashPromotionSessionId': this.dataForm.flashPromotionSessionId,
                'productId': this.dataForm.productId,
                'flashPromotionPrice': this.dataForm.flashPromotionPrice,
                'flashPromotionCount': this.dataForm.flashPromotionCount,
                'flashPromotionLimit': this.dataForm.flashPromotionLimit,
                'sort': this.dataForm.sort
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
