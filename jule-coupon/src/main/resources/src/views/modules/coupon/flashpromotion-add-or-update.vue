<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="" prop="title">
      <el-input v-model="dataForm.title" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="开始日期" prop="startDate">
      <el-input v-model="dataForm.startDate" placeholder="开始日期"></el-input>
    </el-form-item>
    <el-form-item label="结束日期" prop="endDate">
      <el-input v-model="dataForm.endDate" placeholder="结束日期"></el-input>
    </el-form-item>
    <el-form-item label="上下线状态" prop="status">
      <el-input v-model="dataForm.status" placeholder="上下线状态"></el-input>
    </el-form-item>
    <el-form-item label="秒杀时间段名称" prop="createTime">
      <el-input v-model="dataForm.createTime" placeholder="秒杀时间段名称"></el-input>
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
          title: '',
          startDate: '',
          endDate: '',
          status: '',
          createTime: ''
        },
        dataRule: {
          title: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          startDate: [
            { required: true, message: '开始日期不能为空', trigger: 'blur' }
          ],
          endDate: [
            { required: true, message: '结束日期不能为空', trigger: 'blur' }
          ],
          status: [
            { required: true, message: '上下线状态不能为空', trigger: 'blur' }
          ],
          createTime: [
            { required: true, message: '秒杀时间段名称不能为空', trigger: 'blur' }
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
              url: this.$http.adornUrl(`/coupon/flashpromotion/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.title = data.flashPromotion.title
                this.dataForm.startDate = data.flashPromotion.startDate
                this.dataForm.endDate = data.flashPromotion.endDate
                this.dataForm.status = data.flashPromotion.status
                this.dataForm.createTime = data.flashPromotion.createTime
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
              url: this.$http.adornUrl(`/coupon/flashpromotion/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'title': this.dataForm.title,
                'startDate': this.dataForm.startDate,
                'endDate': this.dataForm.endDate,
                'status': this.dataForm.status,
                'createTime': this.dataForm.createTime
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
