import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import fangwuxinxiList from '../pages/fangwuxinxi/list'
import fangwuxinxiDetail from '../pages/fangwuxinxi/detail'
import fangwuxinxiAdd from '../pages/fangwuxinxi/add'
import fangwufenleiList from '../pages/fangwufenlei/list'
import fangwufenleiDetail from '../pages/fangwufenlei/detail'
import fangwufenleiAdd from '../pages/fangwufenlei/add'
import jiaoyidingdanList from '../pages/jiaoyidingdan/list'
import jiaoyidingdanDetail from '../pages/jiaoyidingdan/detail'
import jiaoyidingdanAdd from '../pages/jiaoyidingdan/add'
import jiaoyihetongList from '../pages/jiaoyihetong/list'
import jiaoyihetongDetail from '../pages/jiaoyihetong/detail'
import jiaoyihetongAdd from '../pages/jiaoyihetong/add'
import quxiaodingdanList from '../pages/quxiaodingdan/list'
import quxiaodingdanDetail from '../pages/quxiaodingdan/detail'
import quxiaodingdanAdd from '../pages/quxiaodingdan/add'
import shenfenyanzhengList from '../pages/shenfenyanzheng/list'
import shenfenyanzhengDetail from '../pages/shenfenyanzheng/detail'
import shenfenyanzhengAdd from '../pages/shenfenyanzheng/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'fangwuxinxi',
					component: fangwuxinxiList
				},
				{
					path: 'fangwuxinxiDetail',
					component: fangwuxinxiDetail
				},
				{
					path: 'fangwuxinxiAdd',
					component: fangwuxinxiAdd
				},
				{
					path: 'fangwufenlei',
					component: fangwufenleiList
				},
				{
					path: 'fangwufenleiDetail',
					component: fangwufenleiDetail
				},
				{
					path: 'fangwufenleiAdd',
					component: fangwufenleiAdd
				},
				{
					path: 'jiaoyidingdan',
					component: jiaoyidingdanList
				},
				{
					path: 'jiaoyidingdanDetail',
					component: jiaoyidingdanDetail
				},
				{
					path: 'jiaoyidingdanAdd',
					component: jiaoyidingdanAdd
				},
				{
					path: 'jiaoyihetong',
					component: jiaoyihetongList
				},
				{
					path: 'jiaoyihetongDetail',
					component: jiaoyihetongDetail
				},
				{
					path: 'jiaoyihetongAdd',
					component: jiaoyihetongAdd
				},
				{
					path: 'quxiaodingdan',
					component: quxiaodingdanList
				},
				{
					path: 'quxiaodingdanDetail',
					component: quxiaodingdanDetail
				},
				{
					path: 'quxiaodingdanAdd',
					component: quxiaodingdanAdd
				},
				{
					path: 'shenfenyanzheng',
					component: shenfenyanzhengList
				},
				{
					path: 'shenfenyanzhengDetail',
					component: shenfenyanzhengDetail
				},
				{
					path: 'shenfenyanzhengAdd',
					component: shenfenyanzhengAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
