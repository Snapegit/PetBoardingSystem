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
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="诊疗项目" prop="zhenliaoxiangmu">
            <el-input v-model="ruleForm.zhenliaoxiangmu" 
                placeholder="诊疗项目" clearable :disabled=" false  ||ro.zhenliaoxiangmu"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="项目图片" v-if="type!='cross' || (type=='cross' && !ro.xiangmutupian)" prop="xiangmutupian">
            <file-upload
            tip="点击上传项目图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.xiangmutupian?ruleForm.xiangmutupian:''"
            @change="xiangmutupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' class="upload" v-else label="项目图片" prop="xiangmutupian">
                <img v-if="ruleForm.xiangmutupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.xiangmutupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.xiangmutupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="医院名称" prop="yiyuanmingcheng">
            <el-input v-model="ruleForm.yiyuanmingcheng" 
                placeholder="医院名称" clearable :disabled=" false  ||ro.yiyuanmingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="医院地址" prop="yiyuandizhi">
            <el-input v-model="ruleForm.yiyuandizhi" 
                placeholder="医院地址" clearable :disabled=" false  ||ro.yiyuandizhi"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="联系电话" prop="lianxidianhua">
            <el-input v-model="ruleForm.lianxidianhua" 
                placeholder="联系电话" clearable :disabled=" false  ||ro.lianxidianhua"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="医院简介" prop="yiyuanjianjie">
            <el-input
              type="textarea"
              :rows="8"
              placeholder="医院简介"
              v-model="ruleForm.yiyuanjianjie">
            </el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="医生信息" prop="yishengxinxi">
            <el-input
              type="textarea"
              :rows="8"
              placeholder="医生信息"
              v-model="ruleForm.yishengxinxi">
            </el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="项目介绍" prop="xiangmujieshao">
            <el-input
              type="textarea"
              :rows="8"
              placeholder="项目介绍"
              v-model="ruleForm.xiangmujieshao">
            </el-input>
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
				zhenliaoxiangmu : false,
				xiangmutupian : false,
				yiyuanmingcheng : false,
				yiyuandizhi : false,
				lianxidianhua : false,
				yiyuanjianjie : false,
				yishengxinxi : false,
				xiangmujieshao : false,
				storeupnum : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          zhenliaoxiangmu: '',
          xiangmutupian: '',
          yiyuanmingcheng: '',
          yiyuandizhi: '',
          lianxidianhua: '',
          yiyuanjianjie: '',
          yishengxinxi: '',
          xiangmujieshao: '',
          storeupnum: '',
        },


        rules: {
          zhenliaoxiangmu: [
            { required: true, message: '诊疗项目不能为空', trigger: 'blur' },
          ],
          xiangmutupian: [
          ],
          yiyuanmingcheng: [
            { required: true, message: '医院名称不能为空', trigger: 'blur' },
          ],
          yiyuandizhi: [
            { required: true, message: '医院地址不能为空', trigger: 'blur' },
          ],
          lianxidianhua: [
            { validator: this.$validate.isMobile, trigger: 'blur' },
          ],
          yiyuanjianjie: [
            { required: true, message: '医院简介不能为空', trigger: 'blur' },
          ],
          yishengxinxi: [
            { required: true, message: '医生信息不能为空', trigger: 'blur' },
          ],
          xiangmujieshao: [
            { required: true, message: '项目介绍不能为空', trigger: 'blur' },
          ],
          storeupnum: [
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
            if(o=='zhenliaoxiangmu'){
              this.ruleForm.zhenliaoxiangmu = obj[o];
              this.ro.zhenliaoxiangmu = true;
              continue;
            }
            if(o=='xiangmutupian'){
              this.ruleForm.xiangmutupian = obj[o].split(",")[0];
              this.ro.xiangmutupian = true;
              continue;
            }
            if(o=='yiyuanmingcheng'){
              this.ruleForm.yiyuanmingcheng = obj[o];
              this.ro.yiyuanmingcheng = true;
              continue;
            }
            if(o=='yiyuandizhi'){
              this.ruleForm.yiyuandizhi = obj[o];
              this.ro.yiyuandizhi = true;
              continue;
            }
            if(o=='lianxidianhua'){
              this.ruleForm.lianxidianhua = obj[o];
              this.ro.lianxidianhua = true;
              continue;
            }
            if(o=='yiyuanjianjie'){
              this.ruleForm.yiyuanjianjie = obj[o];
              this.ro.yiyuanjianjie = true;
              continue;
            }
            if(o=='yishengxinxi'){
              this.ruleForm.yishengxinxi = obj[o];
              this.ro.yishengxinxi = true;
              continue;
            }
            if(o=='xiangmujieshao'){
              this.ruleForm.xiangmujieshao = obj[o];
              this.ro.xiangmujieshao = true;
              continue;
            }
            if(o=='storeupnum'){
              this.ruleForm.storeupnum = obj[o];
              this.ro.storeupnum = true;
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
        this.$http.get(`chongwuyiliao/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
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
						this.$http.get('chongwuyiliao/list', {
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


								this.$http.post(`chongwuyiliao/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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


						this.$http.post(`chongwuyiliao/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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
      xiangmutupianUploadChange(fileUrls) {
          this.ruleForm.xiangmutupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
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
