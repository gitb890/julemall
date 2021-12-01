<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券" prop="type">
      <el-input v-model="dataForm.type" placeholder="优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券"></el-input>
    </el-form-item>
    <el-form-item label="" prop="name">
      <el-input v-model="dataForm.name" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="使用平台：0->全部；1->移动；2->PC" prop="platform">
      <el-input v-model="dataForm.platform" placeholder="使用平台：0->全部；1->移动；2->PC"></el-input>
    </el-form-item>
    <el-form-item label="数量" prop="count">
      <el-input v-model="dataForm.count" placeholder="数量"></el-input>
    </el-form-item>
    <el-form-item label="金额" prop="amount">
      <el-input v-model="dataForm.amount" placeholder="金额"></el-input>
    </el-form-item>
    <el-form-item label="每人限领张数" prop="perLimit">
      <el-input v-model="dataForm.perLimit" placeholder="每人限领张数"></el-input>
    </el-form-item>
    <el-form-item label="使用门槛；0表示无门槛" prop="minPoint">
      <el-input v-model="dataForm.minPoint" placeholder="使用门槛；0表示无门槛"></el-input>
    </el-form-item>
    <el-form-item label="" prop="startTime">
      <el-input v-model="dataForm.startTime" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="endTime">
      <el-input v-model="dataForm.endTime" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="使用类型：0->全场通用；1->指定分类；2->指定商品" prop="useType">
      <el-input v-model="dataForm.useType" placeholder="使用类型：0->全场通用；1->指定分类；2->指定商品"></el-input>
    </el-form-item>
    <el-form-item label="备注" prop="note">
      <el-input v-model="dataForm.note" placeholder="备注"></el-input>
    </el-form-item>
    <el-form-item label="发行数量" prop="publishCount">
      <el-input v-model="dataForm.publishCount" placeholder="发行数量"></el-input>
    </el-form-item>
    <el-form-item label="已使用数量" prop="useCount">
      <el-input v-model="dataForm.useCount" placeholder="已使用数量"></el-input>
    </el-form-item>
    <el-form-item label="领取数量" prop="receiveCount">
      <el-input v-model="dataForm.receiveCount" placeholder="领取数量"></el-input>
    </el-form-item>
    <el-form-item label="可以领取的日期" prop="enableTime">
      <el-input v-model="dataForm.enableTime" placeholder="可以领取的日期"></el-input>
    </el-form-item>
    <el-form-item label="优惠码" prop="code">
      <el-input v-model="dataForm.code" placeholder="优惠码"></el-input>
    </el-form-item>
    <el-form-item label="可领取的会员类型：0->无限时" prop="memberLevel">
      <el-input v-model="dataForm.memberLevel" placeholder="可领取的会员类型：0->无限时"></el-input>
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
          type: '',
          name: '',
          platform: '',
          count: '',
          amount: '',
          perLimit: '',
          minPoint: '',
          startTime: '',
          endTime: '',
          useType: '',
          note: '',
          publishCount: '',
          useCount: '',
          receiveCount: '',
          enableTime: '',
          code: '',
          memberLevel: ''
        },
        dataRule: {
          type: [
            { required: true, message: '优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券不能为空', trigger: 'blur' }
          ],
          name: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          platform: [
            { required: true, message: '使用平台：0->全部；1->移动；2->PC不能为空', trigger: 'blur' }
          ],
          count: [
            { required: true, message: '数量不能为空', trigger: 'blur' }
          ],
          amount: [
            { required: true, message: '金额不能为空', trigger: 'blur' }
          ],
          perLimit: [
            { required: true, message: '每人限领张数不能为空', trigger: 'blur' }
          ],
          minPoint: [
            { required: true, message: '使用门槛；0表示无门槛不能为空', trigger: 'blur' }
          ],
          startTime: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          endTime: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          useType: [
            { required: true, message: '使用类型：0->全场通用；1->指定分类；2->指定商品不能为空', trigger: 'blur' }
          ],
          note: [
            { required: true, message: '备注不能为空', trigger: 'blur' }
          ],
          publishCount: [
            { required: true, message: '发行数量不能为空', trigger: 'blur' }
          ],
          useCount: [
            { required: true, message: '已使用数量不能为空', trigger: 'blur' }
          ],
          receiveCount: [
            { required: true, message: '领取数量不能为空', trigger: 'blur' }
          ],
          enableTime: [
            { required: true, message: '可以领取的日期不能为空', trigger: 'blur' }
          ],
          code: [
            { required: true, message: '优惠码不能为空', trigger: 'blur' }
          ],
          memberLevel: [
            { required: true, message: '可领取的会员类型：0->无限时不能为空', trigger: 'blur' }
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
              url: this.$http.adornUrl(`/coupon/coupon/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.type = data.coupon.type
                this.dataForm.name = data.coupon.name
                this.dataForm.platform = data.coupon.platform
                this.dataForm.count = data.coupon.count
                this.dataForm.amount = data.coupon.amount
                this.dataForm.perLimit = data.coupon.perLimit
                this.dataForm.minPoint = data.coupon.minPoint
                this.dataForm.startTime = data.coupon.startTime
                this.dataForm.endTime = data.coupon.endTime
                this.dataForm.useType = data.coupon.useType
                this.dataForm.note = data.coupon.note
                this.dataForm.publishCount = data.coupon.publishCount
                this.dataForm.useCount = data.coupon.useCount
                this.dataForm.receiveCount = data.coupon.receiveCount
                this.dataForm.enableTime = data.coupon.enableTime
                this.dataForm.code = data.coupon.code
                this.dataForm.memberLevel = data.coupon.memberLevel
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
              url: this.$http.adornUrl(`/coupon/coupon/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'type': this.dataForm.type,
                'name': this.dataForm.name,
                'platform': this.dataForm.platform,
                'count': this.dataForm.count,
                'amount': this.dataForm.amount,
                'perLimit': this.dataForm.perLimit,
                'minPoint': this.dataForm.minPoint,
                'startTime': this.dataForm.startTime,
                'endTime': this.dataForm.endTime,
                'useType': this.dataForm.useType,
                'note': this.dataForm.note,
                'publishCount': this.dataForm.publishCount,
                'useCount': this.dataForm.useCount,
                'receiveCount': this.dataForm.receiveCount,
                'enableTime': this.dataForm.enableTime,
                'code': this.dataForm.code,
                'memberLevel': this.dataForm.memberLevel
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
