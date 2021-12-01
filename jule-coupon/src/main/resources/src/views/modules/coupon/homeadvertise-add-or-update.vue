<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="" prop="name">
      <el-input v-model="dataForm.name" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="轮播位置：0->PC首页轮播；1->app首页轮播" prop="type">
      <el-input v-model="dataForm.type" placeholder="轮播位置：0->PC首页轮播；1->app首页轮播"></el-input>
    </el-form-item>
    <el-form-item label="" prop="pic">
      <el-input v-model="dataForm.pic" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="startTime">
      <el-input v-model="dataForm.startTime" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="endTime">
      <el-input v-model="dataForm.endTime" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="上下线状态：0->下线；1->上线" prop="status">
      <el-input v-model="dataForm.status" placeholder="上下线状态：0->下线；1->上线"></el-input>
    </el-form-item>
    <el-form-item label="点击数" prop="clickCount">
      <el-input v-model="dataForm.clickCount" placeholder="点击数"></el-input>
    </el-form-item>
    <el-form-item label="下单数" prop="orderCount">
      <el-input v-model="dataForm.orderCount" placeholder="下单数"></el-input>
    </el-form-item>
    <el-form-item label="链接地址" prop="url">
      <el-input v-model="dataForm.url" placeholder="链接地址"></el-input>
    </el-form-item>
    <el-form-item label="备注" prop="note">
      <el-input v-model="dataForm.note" placeholder="备注"></el-input>
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
          name: '',
          type: '',
          pic: '',
          startTime: '',
          endTime: '',
          status: '',
          clickCount: '',
          orderCount: '',
          url: '',
          note: '',
          sort: ''
        },
        dataRule: {
          name: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          type: [
            { required: true, message: '轮播位置：0->PC首页轮播；1->app首页轮播不能为空', trigger: 'blur' }
          ],
          pic: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          startTime: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          endTime: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          status: [
            { required: true, message: '上下线状态：0->下线；1->上线不能为空', trigger: 'blur' }
          ],
          clickCount: [
            { required: true, message: '点击数不能为空', trigger: 'blur' }
          ],
          orderCount: [
            { required: true, message: '下单数不能为空', trigger: 'blur' }
          ],
          url: [
            { required: true, message: '链接地址不能为空', trigger: 'blur' }
          ],
          note: [
            { required: true, message: '备注不能为空', trigger: 'blur' }
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
              url: this.$http.adornUrl(`/coupon/homeadvertise/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.name = data.homeAdvertise.name
                this.dataForm.type = data.homeAdvertise.type
                this.dataForm.pic = data.homeAdvertise.pic
                this.dataForm.startTime = data.homeAdvertise.startTime
                this.dataForm.endTime = data.homeAdvertise.endTime
                this.dataForm.status = data.homeAdvertise.status
                this.dataForm.clickCount = data.homeAdvertise.clickCount
                this.dataForm.orderCount = data.homeAdvertise.orderCount
                this.dataForm.url = data.homeAdvertise.url
                this.dataForm.note = data.homeAdvertise.note
                this.dataForm.sort = data.homeAdvertise.sort
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
              url: this.$http.adornUrl(`/coupon/homeadvertise/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'name': this.dataForm.name,
                'type': this.dataForm.type,
                'pic': this.dataForm.pic,
                'startTime': this.dataForm.startTime,
                'endTime': this.dataForm.endTime,
                'status': this.dataForm.status,
                'clickCount': this.dataForm.clickCount,
                'orderCount': this.dataForm.orderCount,
                'url': this.dataForm.url,
                'note': this.dataForm.note,
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
