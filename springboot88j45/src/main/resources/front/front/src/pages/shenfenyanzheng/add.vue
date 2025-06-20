<template>
<div :style='{"border":"2px solid #dbd9f4","padding":"20px","margin":"10px auto","borderRadius":"8px","background":"#fff","width":"1200px","position":"relative"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' label="用户账号" prop="yonghuzhanghao">
            <el-input v-model="ruleForm.yonghuzhanghao" 
                placeholder="用户账号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' label="用户姓名" prop="yonghuxingming">
            <el-input v-model="ruleForm.yonghuxingming" 
                placeholder="用户姓名" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' label="用户手机" prop="yonghushouji">
            <el-input v-model="ruleForm.yonghushouji" 
                placeholder="用户手机" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' label="土地使用证" v-if="type!='cross' || (type=='cross' && !ro.tudishiyongzheng)" prop="tudishiyongzheng">
            <file-upload
            tip="点击上传土地使用证"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.tudishiyongzheng?ruleForm.tudishiyongzheng:''"
            @change="tudishiyongzhengUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' class="upload" v-else label="土地使用证" prop="tudishiyongzheng">
                <img v-if="ruleForm.tudishiyongzheng.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.tudishiyongzheng.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.tudishiyongzheng.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' label="建设用地规划许可证" v-if="type!='cross' || (type=='cross' && !ro.jiansheyongdiguihuaxukezheng)" prop="jiansheyongdiguihuaxukezheng">
            <file-upload
            tip="点击上传建设用地规划许可证"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.jiansheyongdiguihuaxukezheng?ruleForm.jiansheyongdiguihuaxukezheng:''"
            @change="jiansheyongdiguihuaxukezhengUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' class="upload" v-else label="建设用地规划许可证" prop="jiansheyongdiguihuaxukezheng">
                <img v-if="ruleForm.jiansheyongdiguihuaxukezheng.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.jiansheyongdiguihuaxukezheng.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.jiansheyongdiguihuaxukezheng.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' label="建设工程规划许可" v-if="type!='cross' || (type=='cross' && !ro.jianshegongchengguihuaxuke)" prop="jianshegongchengguihuaxuke">
            <file-upload
            tip="点击上传建设工程规划许可"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.jianshegongchengguihuaxuke?ruleForm.jianshegongchengguihuaxuke:''"
            @change="jianshegongchengguihuaxukeUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' class="upload" v-else label="建设工程规划许可" prop="jianshegongchengguihuaxuke">
                <img v-if="ruleForm.jianshegongchengguihuaxuke.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.jianshegongchengguihuaxuke.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.jianshegongchengguihuaxuke.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' label="建筑工程施工许可证" v-if="type!='cross' || (type=='cross' && !ro.jianzhugongchengshigongxukezheng)" prop="jianzhugongchengshigongxukezheng">
            <file-upload
            tip="点击上传建筑工程施工许可证"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.jianzhugongchengshigongxukezheng?ruleForm.jianzhugongchengshigongxukezheng:''"
            @change="jianzhugongchengshigongxukezhengUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' class="upload" v-else label="建筑工程施工许可证" prop="jianzhugongchengshigongxukezheng">
                <img v-if="ruleForm.jianzhugongchengshigongxukezheng.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.jianzhugongchengshigongxukezheng.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.jianzhugongchengshigongxukezheng.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' label="商品房预售许可证" v-if="type!='cross' || (type=='cross' && !ro.shangpinfangyushouxukezheng)" prop="shangpinfangyushouxukezheng">
            <file-upload
            tip="点击上传商品房预售许可证"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.shangpinfangyushouxukezheng?ruleForm.shangpinfangyushouxukezheng:''"
            @change="shangpinfangyushouxukezhengUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' class="upload" v-else label="商品房预售许可证" prop="shangpinfangyushouxukezheng">
                <img v-if="ruleForm.shangpinfangyushouxukezheng.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.shangpinfangyushouxukezheng.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.shangpinfangyushouxukezheng.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' label="上传时间" prop="shangchuanshijian" >
              <el-date-picker
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.shangchuanshijian" 
                  type="datetime"
                  placeholder="上传时间">
              </el-date-picker>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"0"}' label="备注" prop="beizhu">
            <el-input
              type="textarea"
              :rows="8"
              placeholder="备注"
              v-model="ruleForm.beizhu">
            </el-input>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 25%","outline":"none","color":"#666","borderRadius":"10px","background":"linear-gradient(90deg, rgba(255,233,100,1) 0%, rgba(194,248,126,1) 29%, rgba(181,233,252,1) 61%, rgba(246,172,218,1) 100%)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"2px solid rgba(213, 203, 235, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#000","borderRadius":"4px","background":"rgba(255, 255, 255, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        baseUrl: '',
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
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
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
        },
      };
    },
    computed: {



    },
    created() {
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.shangchuanshijian = this.getCurDateTime()
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
              this.ruleForm.tudishiyongzheng = obj[o].split(",")[0];
              this.ro.tudishiyongzheng = true;
              continue;
            }
            if(o=='jiansheyongdiguihuaxukezheng'){
              this.ruleForm.jiansheyongdiguihuaxukezheng = obj[o].split(",")[0];
              this.ro.jiansheyongdiguihuaxukezheng = true;
              continue;
            }
            if(o=='jianshegongchengguihuaxuke'){
              this.ruleForm.jianshegongchengguihuaxuke = obj[o].split(",")[0];
              this.ro.jianshegongchengguihuaxuke = true;
              continue;
            }
            if(o=='jianzhugongchengshigongxukezheng'){
              this.ruleForm.jianzhugongchengshigongxukezheng = obj[o].split(",")[0];
              this.ro.jianzhugongchengshigongxukezheng = true;
              continue;
            }
            if(o=='shangpinfangyushouxukezheng'){
              this.ruleForm.shangpinfangyushouxukezheng = obj[o].split(",")[0];
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
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if(json.yonghuzhanghao!=''&&json.yonghuzhanghao){
                this.ruleForm.yonghuzhanghao = json.yonghuzhanghao
            }
            if(json.yonghuxingming!=''&&json.yonghuxingming){
                this.ruleForm.yonghuxingming = json.yonghuxingming
            }
            if(json.yonghushouji!=''&&json.yonghushouji){
                this.ruleForm.yonghushouji = json.yonghushouji
            }
          }
        });
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('shenfenyanzheng/detail/${id}', {emulateJSON: true}).then(res => {
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
                            crossuserid=Number(localStorage.getItem('userid'));
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
                 this.$http.get('shenfenyanzheng/list', {
                  params: params
                 }).then(res => {
                     if(res.data.data.total>=crossoptnum) {
                         this.$message({
                          message: localStorage.getItem('tips'),
                          type: 'success',
                          duration: 1500,
                         });
                          return false;
                     } else {
                         // 跨表计算


                          this.$http.post('shenfenyanzheng/add', this.ruleForm).then(res => {
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


                  this.$http.post('shenfenyanzheng/add', this.ruleForm).then(res => {
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
      tudishiyongzhengUploadChange(fileUrls) {
          this.ruleForm.tudishiyongzheng = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
      jiansheyongdiguihuaxukezhengUploadChange(fileUrls) {
          this.ruleForm.jiansheyongdiguihuaxukezheng = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
      jianshegongchengguihuaxukeUploadChange(fileUrls) {
          this.ruleForm.jianshegongchengguihuaxuke = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
      jianzhugongchengshigongxukezhengUploadChange(fileUrls) {
          this.ruleForm.jianzhugongchengshigongxukezheng = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
      shangpinfangyushouxukezhengUploadChange(fileUrls) {
          this.ruleForm.shangpinfangyushouxukezheng = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 80px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 80px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #cbbae8;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #999;
	  background: 0;
	  width: 400px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid #cbbae8;
	  border-radius: 4px;
	  padding: 0 10px;
	  outline: none;
	  color: #999;
	  background: 0;
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 1px solid #cbbae8;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  outline: none;
	  color: #999;
	  background: 0;
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
	  border: 1px dashed rgba(204, 188, 233, 1);
	  cursor: pointer;
	  border-radius: 6px;
	  color: #cbbae8;
	  width: 200px;
	  font-size: 32px;
	  line-height: 120px;
	  text-align: center;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px dashed rgba(204, 188, 233, 1);
	  cursor: pointer;
	  border-radius: 6px;
	  color: #cbbae8;
	  width: 200px;
	  font-size: 32px;
	  line-height: 120px;
	  text-align: center;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px dashed rgba(204, 188, 233, 1);
	  cursor: pointer;
	  border-radius: 6px;
	  color: #cbbae8;
	  width: 200px;
	  font-size: 32px;
	  line-height: 120px;
	  text-align: center;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #cbbae8;
	  border-radius: 4px;
	  padding: 12px;
	  outline: none;
	  color: #999;
	  background: 0;
	  width: 400px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
