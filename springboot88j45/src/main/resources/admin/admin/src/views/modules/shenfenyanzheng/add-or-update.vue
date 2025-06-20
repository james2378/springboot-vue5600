<template>
	<div class="addEdit-block" style="width: 100%;">
		<el-form
			:style='{"padding":"30px","boxShadow":"0 0px 0px rgba(64, 158, 255, .3)","borderRadius":"6px","flexWrap":"wrap","background":"#fff","display":"flex","width":"100%"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="100px"
		>
			<template >
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="用户账号" prop="yonghuzhanghao">
					<el-input v-model="ruleForm.yonghuzhanghao" placeholder="用户账号" clearable  :readonly="ro.yonghuzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' v-else class="input" label="用户账号" prop="yonghuzhanghao">
					<el-input v-model="ruleForm.yonghuzhanghao" placeholder="用户账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="用户姓名" prop="yonghuxingming">
					<el-input v-model="ruleForm.yonghuxingming" placeholder="用户姓名" clearable  :readonly="ro.yonghuxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' v-else class="input" label="用户姓名" prop="yonghuxingming">
					<el-input v-model="ruleForm.yonghuxingming" placeholder="用户姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="用户手机" prop="yonghushouji">
					<el-input v-model="ruleForm.yonghushouji" placeholder="用户手机" clearable  :readonly="ro.yonghushouji"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' v-else class="input" label="用户手机" prop="yonghushouji">
					<el-input v-model="ruleForm.yonghushouji" placeholder="用户手机" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="upload" v-if="type!='info' && !ro.tudishiyongzheng" label="土地使用证" prop="tudishiyongzheng">
					<file-upload
						tip="点击上传土地使用证"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.tudishiyongzheng?ruleForm.tudishiyongzheng:''"
						@change="tudishiyongzhengUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="upload" v-else-if="ruleForm.tudishiyongzheng" label="土地使用证" prop="tudishiyongzheng">
					<img v-if="ruleForm.tudishiyongzheng.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.tudishiyongzheng.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.tudishiyongzheng.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="upload" v-if="type!='info' && !ro.jiansheyongdiguihuaxukezheng" label="建设用地规划许可证" prop="jiansheyongdiguihuaxukezheng">
					<file-upload
						tip="点击上传建设用地规划许可证"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.jiansheyongdiguihuaxukezheng?ruleForm.jiansheyongdiguihuaxukezheng:''"
						@change="jiansheyongdiguihuaxukezhengUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="upload" v-else-if="ruleForm.jiansheyongdiguihuaxukezheng" label="建设用地规划许可证" prop="jiansheyongdiguihuaxukezheng">
					<img v-if="ruleForm.jiansheyongdiguihuaxukezheng.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.jiansheyongdiguihuaxukezheng.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.jiansheyongdiguihuaxukezheng.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="upload" v-if="type!='info' && !ro.jianshegongchengguihuaxuke" label="建设工程规划许可" prop="jianshegongchengguihuaxuke">
					<file-upload
						tip="点击上传建设工程规划许可"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.jianshegongchengguihuaxuke?ruleForm.jianshegongchengguihuaxuke:''"
						@change="jianshegongchengguihuaxukeUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="upload" v-else-if="ruleForm.jianshegongchengguihuaxuke" label="建设工程规划许可" prop="jianshegongchengguihuaxuke">
					<img v-if="ruleForm.jianshegongchengguihuaxuke.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.jianshegongchengguihuaxuke.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.jianshegongchengguihuaxuke.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="upload" v-if="type!='info' && !ro.jianzhugongchengshigongxukezheng" label="建筑工程施工许可证" prop="jianzhugongchengshigongxukezheng">
					<file-upload
						tip="点击上传建筑工程施工许可证"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.jianzhugongchengshigongxukezheng?ruleForm.jianzhugongchengshigongxukezheng:''"
						@change="jianzhugongchengshigongxukezhengUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="upload" v-else-if="ruleForm.jianzhugongchengshigongxukezheng" label="建筑工程施工许可证" prop="jianzhugongchengshigongxukezheng">
					<img v-if="ruleForm.jianzhugongchengshigongxukezheng.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.jianzhugongchengshigongxukezheng.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.jianzhugongchengshigongxukezheng.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="upload" v-if="type!='info' && !ro.shangpinfangyushouxukezheng" label="商品房预售许可证" prop="shangpinfangyushouxukezheng">
					<file-upload
						tip="点击上传商品房预售许可证"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.shangpinfangyushouxukezheng?ruleForm.shangpinfangyushouxukezheng:''"
						@change="shangpinfangyushouxukezhengUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="upload" v-else-if="ruleForm.shangpinfangyushouxukezheng" label="商品房预售许可证" prop="shangpinfangyushouxukezheng">
					<img v-if="ruleForm.shangpinfangyushouxukezheng.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.shangpinfangyushouxukezheng.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.shangpinfangyushouxukezheng.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="date" v-if="type!='info'" label="上传时间" prop="shangchuanshijian">
					<el-date-picker
						value-format="yyyy-MM-dd HH:mm:ss"
						v-model="ruleForm.shangchuanshijian" 
						type="datetime"
						:readonly="ro.shangchuanshijian"
						placeholder="上传时间"
					></el-date-picker>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="input" v-else-if="ruleForm.shangchuanshijian" label="上传时间" prop="shangchuanshijian">
					<el-input v-model="ruleForm.shangchuanshijian" placeholder="上传时间" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' class="textarea" v-if="type!='info'" label="备注" prop="beizhu">
					<el-input
					  style="min-width: 200px; max-width: 600px;"
					  type="textarea"
					  :rows="8"
					  placeholder="备注"
					  v-model="ruleForm.beizhu" >
					</el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' v-else-if="ruleForm.beizhu" label="备注" prop="beizhu">
					<span :style='{"fontSize":"14px","lineHeight":"40px","color":"#000","fontWeight":"500","display":"inline-block"}'>{{ruleForm.beizhu}}</span>
				</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0"}' class="btn">
				<el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"30px","background":"#93C7B3","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
				<el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#fff","borderRadius":"30px","background":"#93C7B3","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
				<el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#fff","borderRadius":"30px","background":"#93C7B3","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
	data() {
		let self = this
		var validateIdCard = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!checkIdCard(value)) {
				callback(new Error("请输入正确的身份证号码"));
			} else {
				callback();
			}
		};
		var validateUrl = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isURL(value)) {
				callback(new Error("请输入正确的URL地址"));
			} else {
				callback();
			}
		};
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validatePhone = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isPhone(value)) {
				callback(new Error("请输入正确的电话号码"));
			} else {
				callback();
			}
		};
		var validateEmail = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isEmail(value)) {
				callback(new Error("请输入正确的邮箱地址"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				yonghuzhanghao : false,
				yonghuxingming : false,
				yonghushouji : false,
				tudishiyongzheng : false,
				jiansheyongdiguihuaxukezheng : false,
				jianshegongchengguihuaxuke : false,
				jianzhugongchengshigongxukezheng : false,
				shangpinfangyushouxukezheng : false,
				beizhu : false,
				shangchuanshijian : false,
				sfsh : false,
				shhf : false,
			},
			
			
			ruleForm: {
				yonghuzhanghao: '',
				yonghuxingming: '',
				yonghushouji: '',
				tudishiyongzheng: '',
				jiansheyongdiguihuaxukezheng: '',
				jianshegongchengguihuaxuke: '',
				jianzhugongchengshigongxukezheng: '',
				shangpinfangyushouxukezheng: '',
				beizhu: '',
				shangchuanshijian: '',
				shhf: '',
			},
		
			
			rules: {
				yonghuzhanghao: [
				],
				yonghuxingming: [
				],
				yonghushouji: [
				],
				tudishiyongzheng: [
					{ required: true, message: '土地使用证不能为空', trigger: 'blur' },
				],
				jiansheyongdiguihuaxukezheng: [
					{ required: true, message: '建设用地规划许可证不能为空', trigger: 'blur' },
				],
				jianshegongchengguihuaxuke: [
					{ required: true, message: '建设工程规划许可不能为空', trigger: 'blur' },
				],
				jianzhugongchengshigongxukezheng: [
					{ required: true, message: '建筑工程施工许可证不能为空', trigger: 'blur' },
				],
				shangpinfangyushouxukezheng: [
					{ required: true, message: '商品房预售许可证不能为空', trigger: 'blur' },
				],
				beizhu: [
				],
				shangchuanshijian: [
				],
				sfsh: [
				],
				shhf: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
	created() {
		this.ruleForm.shangchuanshijian = this.getCurDateTime()
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='yonghuzhanghao'){
							this.ruleForm.yonghuzhanghao = obj[o];
							this.ro.yonghuzhanghao = true;
							continue;
						}
						if(o=='yonghuxingming'){
							this.ruleForm.yonghuxingming = obj[o];
							this.ro.yonghuxingming = true;
							continue;
						}
						if(o=='yonghushouji'){
							this.ruleForm.yonghushouji = obj[o];
							this.ro.yonghushouji = true;
							continue;
						}
						if(o=='tudishiyongzheng'){
							this.ruleForm.tudishiyongzheng = obj[o];
							this.ro.tudishiyongzheng = true;
							continue;
						}
						if(o=='jiansheyongdiguihuaxukezheng'){
							this.ruleForm.jiansheyongdiguihuaxukezheng = obj[o];
							this.ro.jiansheyongdiguihuaxukezheng = true;
							continue;
						}
						if(o=='jianshegongchengguihuaxuke'){
							this.ruleForm.jianshegongchengguihuaxuke = obj[o];
							this.ro.jianshegongchengguihuaxuke = true;
							continue;
						}
						if(o=='jianzhugongchengshigongxukezheng'){
							this.ruleForm.jianzhugongchengshigongxukezheng = obj[o];
							this.ro.jianzhugongchengshigongxukezheng = true;
							continue;
						}
						if(o=='shangpinfangyushouxukezheng'){
							this.ruleForm.shangpinfangyushouxukezheng = obj[o];
							this.ro.shangpinfangyushouxukezheng = true;
							continue;
						}
						if(o=='beizhu'){
							this.ruleForm.beizhu = obj[o];
							this.ro.beizhu = true;
							continue;
						}
						if(o=='shangchuanshijian'){
							this.ruleForm.shangchuanshijian = obj[o];
							this.ro.shangchuanshijian = true;
							continue;
						}
				}
				












			}
			
			
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					
					var json = data.data;
					if(json.yonghuzhanghao!=''&&json.yonghuzhanghao && this.$storage.get("role")!="管理员"){
						this.ruleForm.yonghuzhanghao = json.yonghuzhanghao
						this.ro.yonghuzhanghao = true;
					}
					if(json.yonghuxingming!=''&&json.yonghuxingming && this.$storage.get("role")!="管理员"){
						this.ruleForm.yonghuxingming = json.yonghuxingming
						this.ro.yonghuxingming = true;
					}
					if(json.yonghushouji!=''&&json.yonghushouji && this.$storage.get("role")!="管理员"){
						this.ruleForm.yonghushouji = json.yonghushouji
						this.ro.yonghushouji = true;
					}
				} else {
					this.$message.error(data.msg);
				}
			});
			
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `shenfenyanzheng/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {








	if(this.ruleForm.tudishiyongzheng!=null) {
		this.ruleForm.tudishiyongzheng = this.ruleForm.tudishiyongzheng.replace(new RegExp(this.$base.url,"g"),"");
	}


	if(this.ruleForm.jiansheyongdiguihuaxukezheng!=null) {
		this.ruleForm.jiansheyongdiguihuaxukezheng = this.ruleForm.jiansheyongdiguihuaxukezheng.replace(new RegExp(this.$base.url,"g"),"");
	}


	if(this.ruleForm.jianshegongchengguihuaxuke!=null) {
		this.ruleForm.jianshegongchengguihuaxuke = this.ruleForm.jianshegongchengguihuaxuke.replace(new RegExp(this.$base.url,"g"),"");
	}


	if(this.ruleForm.jianzhugongchengshigongxukezheng!=null) {
		this.ruleForm.jianzhugongchengshigongxukezheng = this.ruleForm.jianzhugongchengshigongxukezheng.replace(new RegExp(this.$base.url,"g"),"");
	}


	if(this.ruleForm.shangpinfangyushouxukezheng!=null) {
		this.ruleForm.shangpinfangyushouxukezheng = this.ruleForm.shangpinfangyushouxukezheng.replace(new RegExp(this.$base.url,"g"),"");
	}









var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "shenfenyanzheng/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `shenfenyanzheng/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.shenfenyanzhengCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `shenfenyanzheng/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.shenfenyanzhengCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
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
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.shenfenyanzhengCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    tudishiyongzhengUploadChange(fileUrls) {
	    this.ruleForm.tudishiyongzheng = fileUrls;
    },
    jiansheyongdiguihuaxukezhengUploadChange(fileUrls) {
	    this.ruleForm.jiansheyongdiguihuaxukezheng = fileUrls;
    },
    jianshegongchengguihuaxukeUploadChange(fileUrls) {
	    this.ruleForm.jianshegongchengguihuaxuke = fileUrls;
    },
    jianzhugongchengshigongxukezhengUploadChange(fileUrls) {
	    this.ruleForm.jianzhugongchengshigongxukezheng = fileUrls;
    },
    shangpinfangyushouxukezhengUploadChange(fileUrls) {
	    this.ruleForm.shangpinfangyushouxukezheng = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: #666;
	  	  font-weight: 500;
	  	  width: 100px;
	  	  font-size: 14px;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 100px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 0;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 0;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: 200px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 0;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: 200px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 1px dashed #797979;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #797979;
	  	  width: 90px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 1px dashed #797979;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #797979;
	  	  width: 90px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 1px dashed #797979;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #797979;
	  	  width: 90px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 0;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: 120px;
	  	}
</style>
