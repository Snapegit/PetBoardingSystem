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
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="宠物编号" prop="chongwubianhao">
            <el-input v-model="ruleForm.chongwubianhao" 
                placeholder="宠物编号" clearable :disabled=" false  ||ro.chongwubianhao"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}'  label="宠物种类" prop="chongwuzhonglei">
            <el-select v-model="ruleForm.chongwuzhonglei" placeholder="请选择宠物种类" :disabled=" false  ||ro.chongwuzhonglei" >
              <el-option
                  v-for="(item,index) in chongwuzhongleiOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="宠物品种" prop="chongwupinzhong">
            <el-input v-model="ruleForm.chongwupinzhong" 
                placeholder="宠物品种" clearable :disabled=" false  ||ro.chongwupinzhong"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}'  label="宠物性别" prop="chongwuxingbie">
            <el-select v-model="ruleForm.chongwuxingbie" placeholder="请选择宠物性别" :disabled=" false  ||ro.chongwuxingbie" >
              <el-option
                  v-for="(item,index) in chongwuxingbieOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="宠物年龄" prop="chongwunianling">
            <el-input v-model="ruleForm.chongwunianling" 
                placeholder="宠物年龄" clearable :disabled=" false  ||ro.chongwunianling"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="宠物照片" v-if="type!='cross' || (type=='cross' && !ro.chongwuzhaopian)" prop="chongwuzhaopian">
            <file-upload
            tip="点击上传宠物照片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.chongwuzhaopian?ruleForm.chongwuzhaopian:''"
            @change="chongwuzhaopianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' class="upload" v-else label="宠物照片" prop="chongwuzhaopian">
                <img v-if="ruleForm.chongwuzhaopian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.chongwuzhaopian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.chongwuzhaopian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="疫苗信息" prop="yimiaoxinxi">
            <el-input v-model="ruleForm.yimiaoxinxi" 
                placeholder="疫苗信息" clearable :disabled=" false  ||ro.yimiaoxinxi"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="健康状况" prop="jiankangzhuangkuang">
            <el-input v-model="ruleForm.jiankangzhuangkuang" 
                placeholder="健康状况" clearable :disabled=" false  ||ro.jiankangzhuangkuang"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="宠物详情" prop="chongwuxiangqing">
            <editor 
                :style='{"minHeight":"250px","padding":"0","margin":"0","borderColor":"#ddd","backgroundColor":"none","borderRadius":"0","borderWidth":"1px","width":"80%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.chongwuxiangqing" 
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
				chongwubianhao : false,
				chongwuzhonglei : false,
				chongwupinzhong : false,
				chongwuxingbie : false,
				chongwunianling : false,
				chongwuzhaopian : false,
				yimiaoxinxi : false,
				jiankangzhuangkuang : false,
				chongwuxiangqing : false,
				clicktime : false,
				clicknum : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          chongwubianhao: '',
          chongwuzhonglei: '',
          chongwupinzhong: '',
          chongwuxingbie: '',
          chongwunianling: '',
          chongwuzhaopian: '',
          yimiaoxinxi: '',
          jiankangzhuangkuang: '',
          chongwuxiangqing: '',
          clicktime: '',
          clicknum: '',
        },
        chongwuzhongleiOptions: [],
        chongwuxingbieOptions: [],


        rules: {
          chongwubianhao: [
            { required: true, message: '宠物编号不能为空', trigger: 'blur' },
          ],
          chongwuzhonglei: [
            { required: true, message: '宠物种类不能为空', trigger: 'blur' },
          ],
          chongwupinzhong: [
            { required: true, message: '宠物品种不能为空', trigger: 'blur' },
          ],
          chongwuxingbie: [
          ],
          chongwunianling: [
          ],
          chongwuzhaopian: [
          ],
          yimiaoxinxi: [
          ],
          jiankangzhuangkuang: [
          ],
          chongwuxiangqing: [
          ],
          clicktime: [
          ],
          clicknum: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
        },
		centerType: false,
      };
    },
    computed: {



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
            if(o=='chongwubianhao'){
              this.ruleForm.chongwubianhao = obj[o];
              this.ro.chongwubianhao = true;
              continue;
            }
            if(o=='chongwuzhonglei'){
              this.ruleForm.chongwuzhonglei = obj[o];
              this.ro.chongwuzhonglei = true;
              continue;
            }
            if(o=='chongwupinzhong'){
              this.ruleForm.chongwupinzhong = obj[o];
              this.ro.chongwupinzhong = true;
              continue;
            }
            if(o=='chongwuxingbie'){
              this.ruleForm.chongwuxingbie = obj[o];
              this.ro.chongwuxingbie = true;
              continue;
            }
            if(o=='chongwunianling'){
              this.ruleForm.chongwunianling = obj[o];
              this.ro.chongwunianling = true;
              continue;
            }
            if(o=='chongwuzhaopian'){
              this.ruleForm.chongwuzhaopian = obj[o].split(",")[0];
              this.ro.chongwuzhaopian = true;
              continue;
            }
            if(o=='yimiaoxinxi'){
              this.ruleForm.yimiaoxinxi = obj[o];
              this.ro.yimiaoxinxi = true;
              continue;
            }
            if(o=='jiankangzhuangkuang'){
              this.ruleForm.jiankangzhuangkuang = obj[o];
              this.ro.jiankangzhuangkuang = true;
              continue;
            }
            if(o=='chongwuxiangqing'){
              this.ruleForm.chongwuxiangqing = obj[o];
              this.ro.chongwuxiangqing = true;
              continue;
            }
            if(o=='clicktime'){
              this.ruleForm.clicktime = obj[o];
              this.ro.clicktime = true;
              continue;
            }
            if(o=='clicknum'){
              this.ruleForm.clicknum = obj[o];
              this.ro.clicknum = true;
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
          }
        });
        this.$http.get('option/chongwuzhonglei/chongwuzhonglei', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.chongwuzhongleiOptions = res.data.data;
          }
        });
        this.chongwuxingbieOptions = "公,母".split(',')

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
        this.$http.get(`chongwuxinxi/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {
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
						this.$http.get('chongwuxinxi/list', {
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


								this.$http.post(`chongwuxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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


						this.$http.post(`chongwuxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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
      chongwuzhaopianUploadChange(fileUrls) {
          this.ruleForm.chongwuzhaopian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
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
