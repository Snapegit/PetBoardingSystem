import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import chongwuzhongleiList from '../pages/chongwuzhonglei/list'
import chongwuzhongleiDetail from '../pages/chongwuzhonglei/detail'
import chongwuzhongleiAdd from '../pages/chongwuzhonglei/add'
import chongwuxinxiList from '../pages/chongwuxinxi/list'
import chongwuxinxiDetail from '../pages/chongwuxinxi/detail'
import chongwuxinxiAdd from '../pages/chongwuxinxi/add'
import jiyangfuwuList from '../pages/jiyangfuwu/list'
import jiyangfuwuDetail from '../pages/jiyangfuwu/detail'
import jiyangfuwuAdd from '../pages/jiyangfuwu/add'
import yuyuejiyangList from '../pages/yuyuejiyang/list'
import yuyuejiyangDetail from '../pages/yuyuejiyang/detail'
import yuyuejiyangAdd from '../pages/yuyuejiyang/add'
import jiyangrizhiList from '../pages/jiyangrizhi/list'
import jiyangrizhiDetail from '../pages/jiyangrizhi/detail'
import jiyangrizhiAdd from '../pages/jiyangrizhi/add'
import siliaozhongleiList from '../pages/siliaozhonglei/list'
import siliaozhongleiDetail from '../pages/siliaozhonglei/detail'
import siliaozhongleiAdd from '../pages/siliaozhonglei/add'
import chongwusiliaoList from '../pages/chongwusiliao/list'
import chongwusiliaoDetail from '../pages/chongwusiliao/detail'
import chongwusiliaoAdd from '../pages/chongwusiliao/add'
import goumaidingdanList from '../pages/goumaidingdan/list'
import goumaidingdanDetail from '../pages/goumaidingdan/detail'
import goumaidingdanAdd from '../pages/goumaidingdan/add'
import chongwuhuodongList from '../pages/chongwuhuodong/list'
import chongwuhuodongDetail from '../pages/chongwuhuodong/detail'
import chongwuhuodongAdd from '../pages/chongwuhuodong/add'
import chongwuyiliaoList from '../pages/chongwuyiliao/list'
import chongwuyiliaoDetail from '../pages/chongwuyiliao/detail'
import chongwuyiliaoAdd from '../pages/chongwuyiliao/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'

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
					path: 'pay',
					component: payList,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
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
					path: 'chongwuzhonglei',
					component: chongwuzhongleiList
				},
				{
					path: 'chongwuzhongleiDetail',
					component: chongwuzhongleiDetail
				},
				{
					path: 'chongwuzhongleiAdd',
					component: chongwuzhongleiAdd
				},
				{
					path: 'chongwuxinxi',
					component: chongwuxinxiList
				},
				{
					path: 'chongwuxinxiDetail',
					component: chongwuxinxiDetail
				},
				{
					path: 'chongwuxinxiAdd',
					component: chongwuxinxiAdd
				},
				{
					path: 'jiyangfuwu',
					component: jiyangfuwuList
				},
				{
					path: 'jiyangfuwuDetail',
					component: jiyangfuwuDetail
				},
				{
					path: 'jiyangfuwuAdd',
					component: jiyangfuwuAdd
				},
				{
					path: 'yuyuejiyang',
					component: yuyuejiyangList
				},
				{
					path: 'yuyuejiyangDetail',
					component: yuyuejiyangDetail
				},
				{
					path: 'yuyuejiyangAdd',
					component: yuyuejiyangAdd
				},
				{
					path: 'jiyangrizhi',
					component: jiyangrizhiList
				},
				{
					path: 'jiyangrizhiDetail',
					component: jiyangrizhiDetail
				},
				{
					path: 'jiyangrizhiAdd',
					component: jiyangrizhiAdd
				},
				{
					path: 'siliaozhonglei',
					component: siliaozhongleiList
				},
				{
					path: 'siliaozhongleiDetail',
					component: siliaozhongleiDetail
				},
				{
					path: 'siliaozhongleiAdd',
					component: siliaozhongleiAdd
				},
				{
					path: 'chongwusiliao',
					component: chongwusiliaoList
				},
				{
					path: 'chongwusiliaoDetail',
					component: chongwusiliaoDetail
				},
				{
					path: 'chongwusiliaoAdd',
					component: chongwusiliaoAdd
				},
				{
					path: 'goumaidingdan',
					component: goumaidingdanList
				},
				{
					path: 'goumaidingdanDetail',
					component: goumaidingdanDetail
				},
				{
					path: 'goumaidingdanAdd',
					component: goumaidingdanAdd
				},
				{
					path: 'chongwuhuodong',
					component: chongwuhuodongList
				},
				{
					path: 'chongwuhuodongDetail',
					component: chongwuhuodongDetail
				},
				{
					path: 'chongwuhuodongAdd',
					component: chongwuhuodongAdd
				},
				{
					path: 'chongwuyiliao',
					component: chongwuyiliaoList
				},
				{
					path: 'chongwuyiliaoDetail',
					component: chongwuyiliaoDetail
				},
				{
					path: 'chongwuyiliaoAdd',
					component: chongwuyiliaoAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
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
