<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="" prop="memberId">
      <el-input v-model="dataForm.memberId" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="productId">
      <el-input v-model="dataForm.productId" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="memberPhone">
      <el-input v-model="dataForm.memberPhone" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="productName">
      <el-input v-model="dataForm.productName" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="会员订阅时间" prop="subscribeTime">
      <el-input v-model="dataForm.subscribeTime" placeholder="会员订阅时间"></el-input>
    </el-form-item>
    <el-form-item label="" prop="sendTime">
      <el-input v-model="dataForm.sendTime" placeholder=""></el-input>
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
          memberId: '',
          productId: '',
          memberPhone: '',
          productName: '',
          subscribeTime: '',
          sendTime: ''
        },
        dataRule: {
          memberId: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          productId: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          memberPhone: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          productName: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          subscribeTime: [
            { required: true, message: '会员订阅时间不能为空', trigger: 'blur' }
          ],
          sendTime: [
            { required: true, message: '不能为空', trigger: 'blur' }
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
              url: this.$http.adornUrl(`/coupon/flashpromotionlog/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.memberId = data.flashPromotionLog.memberId
                this.dataForm.productId = data.flashPromotionLog.productId
                this.dataForm.memberPhone = data.flashPromotionLog.memberPhone
                this.dataForm.productName = data.flashPromotionLog.productName
                this.dataForm.subscribeTime = data.flashPromotionLog.subscribeTime
                this.dataForm.sendTime = data.flashPromotionLog.sendTime
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
              url: this.$http.adornUrl(`/coupon/flashpromotionlog/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'memberId': this.dataForm.memberId,
                'productId': this.dataForm.productId,
                'memberPhone': this.dataForm.memberPhone,
                'productName': this.dataForm.productName,
                'subscribeTime': this.dataForm.subscribeTime,
                'sendTime': this.dataForm.sendTime
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
