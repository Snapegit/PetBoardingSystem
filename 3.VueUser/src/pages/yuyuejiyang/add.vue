<template>
<div :style='{"width":"100%","padding":"30px calc((100% - 1200px)/2) 40px","margin":"0px auto","position":"relative","background":"#fff"}'>
    <el-form
	  :style='{"border":"1px solid rgb(123, 123, 123)","padding":"20px 0 30px","margin":"0px 0","borderRadius":"10px","background":"#fff","width":"100%","position":"relative"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="180px"
    >
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="寄养编号" prop="jiyangbianhao">
              <el-input v-model="ruleForm.jiyangbianhao" placeholder="寄养编号" disabled></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="服务名称" prop="fuwumingcheng">
            <el-input v-model="ruleForm.fuwumingcheng" 
                placeholder="服务名称" clearable :disabled=" false  ||ro.fuwumingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="图片" v-if="type!='cross' || (type=='cross' && !ro.tupian)" prop="tupian">
            <file-upload
            tip="点击上传图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.tupian?ruleForm.tupian:''"
            @change="tupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' class="upload" v-else label="图片" prop="tupian">
                <img v-if="ruleForm.tupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.tupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.tupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="服务价格/天" prop="fuwujiage">
            <el-input v-model.number="ruleForm.fuwujiage" 
                placeholder="服务价格/天" clearable :disabled="true  ||ro.fuwujiage"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="寄养日期" prop="jiyangriqi">
              <el-date-picker
				  :disabled=" false  ||ro.jiyangriqi"
                  format="yyyy 年 MM 月 dd 日"
                  value-format="yyyy-MM-dd"
                  v-model="ruleForm.jiyangriqi" 
                  type="date"
                  :picker-options="jiyangriqiPickerOptions"
                  placeholder="寄养日期">
              </el-date-picker> 
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="寄养天数" prop="jiyangtianshu">
            <el-input v-model.number="ruleForm.jiyangtianshu" 
                placeholder="寄养天数" clearable :disabled=" false  ||ro.jiyangtianshu"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="总费用" prop="zongfeiyong">
              <el-input v-model="zongfeiyong" placeholder="总费用" disabled></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="账号" prop="zhanghao">
            <el-input v-model="ruleForm.zhanghao" 
                placeholder="账号" clearable :disabled=" false  ||ro.zhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="姓名" prop="xingming">
            <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" clearable :disabled=" false  ||ro.xingming"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="手机号" prop="shoujihao">
            <el-input v-model="ruleForm.shoujihao" 
                placeholder="手机号" clearable :disabled=" false  ||ro.shoujihao"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="登记时间" prop="dengjishijian">
              <el-date-picker
				  :disabled=" false  ||ro.dengjishijian"
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.dengjishijian" 
                  type="datetime"
                  placeholder="登记时间">
              </el-date-picker>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="宠物信息" prop="chongwuxinxi">
            <editor 
                :style='{"minHeight":"250px","padding":"0","margin":"0","borderColor":"#ddd","backgroundColor":"none","borderRadius":"0","borderWidth":"1px","width":"80%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.chongwuxinxi" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"#333","borderRadius":"0px","background":"#b4ebcc","width":"100px","lineHeight":"36px","fontSize":"14px","height":"36px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #eee","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#333","borderRadius":"0px","background":"none","width":"100px","lineHeight":"36px","fontSize":"14px","height":"36px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
	  let self = this
      return {
        id: '',
        baseUrl: '',
        ro:{
				jiyangbianhao : false,
				fuwumingcheng : false,
				tupian : false,
				fuwujiage : false,
				jiyangriqi : false,
				jiyangtianshu : false,
				zongfeiyong : false,
				zhanghao : false,
				xingming : false,
				shoujihao : false,
				chongwuxinxi : false,
				dengjishijian : false,
				sfsh : false,
				shhf : false,
				ispay : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          jiyangbianhao: this.getUUID(),
          fuwumingcheng: '',
          tupian: '',
          fuwujiage: '',
          jiyangriqi: '',
          jiyangtianshu: '',
          zongfeiyong: '',
          zhanghao: '',
          xingming: '',
          shoujihao: '',
          chongwuxinxi: '',
          dengjishijian: '',
          ispay: '',
        },

			// 只能选择今天和之后日期
            jiyangriqiPickerOptions: {
                disabledDate(time) {
                    return time.getTime() < Date.now() - 8.64e7;
                }
            },

        rules: {
          jiyangbianhao: [
          ],
          fuwumingcheng: [
          ],
          tupian: [
          ],
          fuwujiage: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          jiyangriqi: [
            { required: true, message: '寄养日期不能为空', trigger: 'blur' },
          ],
          jiyangtianshu: [
            { required: true, message: '寄养天数不能为空', trigger: 'blur' },
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          zongfeiyong: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          zhanghao: [
          ],
          xingming: [
          ],
          shoujihao: [
          ],
          chongwuxinxi: [
            { required: true, message: '宠物信息不能为空', trigger: 'blur' },
          ],
          dengjishijian: [
          ],
          sfsh: [
          ],
          shhf: [
          ],
          ispay: [
          ],
        },
		centerType: false,
      };
    },
    computed: {


        zongfeiyong:{
            get: function () {
                return 1*this.ruleForm.fuwujiage*this.ruleForm.jiyangtianshu
            }
        },

    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.dengjishijian = this.getCurDateTime()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='jiyangbianhao'){
              this.ruleForm.jiyangbianhao = obj[o];
              this.ro.jiyangbianhao = true;
              continue;
            }
            if(o=='fuwumingcheng'){
              this.ruleForm.fuwumingcheng = obj[o];
              this.ro.fuwumingcheng = true;
              continue;
            }
            if(o=='tupian'){
              this.ruleForm.tupian = obj[o].split(",")[0];
              this.ro.tupian = true;
              continue;
            }
            if(o=='fuwujiage'){
              this.ruleForm.fuwujiage = obj[o];
              this.ro.fuwujiage = true;
              continue;
            }
            if(o=='jiyangriqi'){
              this.ruleForm.jiyangriqi = obj[o];
              this.ro.jiyangriqi = true;
              continue;
            }
            if(o=='jiyangtianshu'){
              this.ruleForm.jiyangtianshu = obj[o];
              this.ro.jiyangtianshu = true;
              continue;
            }
            if(o=='zongfeiyong'){
              this.ruleForm.zongfeiyong = obj[o];
              this.ro.zongfeiyong = true;
              continue;
            }
            if(o=='zhanghao'){
              this.ruleForm.zhanghao = obj[o];
              this.ro.zhanghao = true;
              continue;
            }
            if(o=='xingming'){
              this.ruleForm.xingming = obj[o];
              this.ro.xingming = true;
              continue;
            }
            if(o=='shoujihao'){
              this.ruleForm.shoujihao = obj[o];
              this.ro.shoujihao = true;
              continue;
            }
            if(o=='chongwuxinxi'){
              this.ruleForm.chongwuxinxi = obj[o];
              this.ro.chongwuxinxi = true;
              continue;
            }
            if(o=='dengjishijian'){
              this.ruleForm.dengjishijian = obj[o];
              this.ro.dengjishijian = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.zhanghao!=''&&json.zhanghao) || json.zhanghao==0){
                this.ruleForm.zhanghao = json.zhanghao;
				this.ro.zhanghao = true;
            }
            if((json.xingming!=''&&json.xingming) || json.xingming==0){
                this.ruleForm.xingming = json.xingming;
				this.ro.xingming = true;
            }
            if((json.shoujihao!=''&&json.shoujihao) || json.shoujihao==0){
                this.ruleForm.shoujihao = json.shoujihao;
				this.ro.shoujihao = true;
            }
          }
        });

		if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
			localStorage.removeItem('raffleType')
			setTimeout(() => {
				this.onSubmit()
			}, 300)
		}
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`yuyuejiyang/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {
		this.ruleForm.ispay = '未支付'
			if(this.ruleForm.jiyangbianhao){
				this.ruleForm.jiyangbianhao = String(this.ruleForm.jiyangbianhao)
			}
			this.ruleForm.zongfeiyong = this.zongfeiyong
			//更新跨表属性
			var crossuserid;
			var crossrefid;
			var crossoptnum;
			this.$refs["ruleForm"].validate(valid => {
				if(valid) {
					if(this.type=='cross'){
						var statusColumnName = localStorage.getItem('statusColumnName');
						var statusColumnValue = localStorage.getItem('statusColumnValue');
						if(statusColumnName && statusColumnName!='') {
							var obj = JSON.parse(localStorage.getItem('crossObj'));
							if(!statusColumnName.startsWith("[")) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = localStorage.getItem('crossTable');
								this.$http.post(table+'/update', obj).then(res => {});
							} else {
								crossuserid=Number(localStorage.getItem('frontUserid'));
								crossrefid=obj['id'];
								crossoptnum=localStorage.getItem('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
							}
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						var params = {
							page: 1,
							limit: 10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						this.$http.get('yuyuejiyang/list', {
							params: params
						}).then(res => {
							if(res.data.data.total>=crossoptnum) {
								this.$message({
									message: localStorage.getItem('tips'),
									type: 'error',
									duration: 1500,
								});
								return false;
							} else {
								// 跨表计算


								this.$http.post(`yuyuejiyang/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
										this.$message({
											message: '操作成功',
											type: 'success',
											duration: 1500,
											onClose: () => {
												this.$router.go(-1);
											}
										});
									} else {
										this.$message({
											message: res.data.msg,
											type: 'error',
											duration: 1500
										});
									}
								});
							}
						});
					} else {


						this.$http.post(`yuyuejiyang/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
							}
						});
					}
				}
			});
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		// 返回
		back() {
			this.$router.go(-1);
		},
      tupianUploadChange(fileUrls) {
          this.ruleForm.tupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item ::v-deep .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 180px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item ::v-deep .el-form-item__content {
	  margin-left: 180px;
	}
	
	.add-update-preview .el-input ::v-deep .el-input__inner {
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #ddd;
	  border-radius: 0px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  background: none;
	  width: auto;
	  border-width: 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	.add-update-preview .el-input-number ::v-deep .el-input__inner {
		text-align: left;
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #ddd;
	  border-radius: 0px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  background: none;
	  width: auto;
	  border-width: 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	.add-update-preview .el-input-number ::v-deep .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number ::v-deep .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select ::v-deep .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px;
	  color: #666;
	  background: none;
	  width: auto;
	  font-size: 14px;
	  border-color: #ddd;
	  border-width: 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor ::v-deep .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px 0 30px;
	  color: #666;
	  background: none;
	  width: auto;
	  font-size: 14px;
	  border-color: #ddd;
	  border-width: 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview ::v-deep .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview ::v-deep .upload .upload-img {
	  cursor: pointer;
	  border-radius: 2px;
	  color: #999;
	  background: none;
	  width: 100px;
	  font-size: 24px;
	  border-color: #ddd;
	  border-width: 1px;
	  line-height: 60px;
	  border-style: solid;
	  text-align: center;
	  height: 60px;
	}
	
	.add-update-preview ::v-deep .el-upload-list .el-upload-list__item {
	  cursor: pointer;
	  border-radius: 2px;
	  color: #999;
	  background: none;
	  width: 100px;
	  font-size: 24px;
	  border-color: #ddd;
	  border-width: 1px;
	  line-height: 60px;
	  border-style: solid;
	  text-align: center;
	  height: 60px;
	}
	
	.add-update-preview ::v-deep .el-upload .el-icon-plus {
	  cursor: pointer;
	  border-radius: 2px;
	  color: #999;
	  background: none;
	  width: 100px;
	  font-size: 24px;
	  border-color: #ddd;
	  border-width: 1px;
	  line-height: 60px;
	  border-style: solid;
	  text-align: center;
	  height: 60px;
	}
	
	.add-update-preview .el-textarea ::v-deep .el-textarea__inner {
	  border: 1px solid #ddd;
	  border-radius: 0px;
	  padding: 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  background: none;
	  width: 600px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
