import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import chongwuxinxi from '@/views/modules/chongwuxinxi/list'
    import jiyangrizhi from '@/views/modules/jiyangrizhi/list'
    import news from '@/views/modules/news/list'
    import goumaidingdan from '@/views/modules/goumaidingdan/list'
    import siliaozhonglei from '@/views/modules/siliaozhonglei/list'
    import chongwuyiliao from '@/views/modules/chongwuyiliao/list'
    import chongwuhuodong from '@/views/modules/chongwuhuodong/list'
    import yuyuejiyang from '@/views/modules/yuyuejiyang/list'
    import chongwuzhonglei from '@/views/modules/chongwuzhonglei/list'
    import forum from '@/views/modules/forum/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chongwusiliao from '@/views/modules/chongwusiliao/list'
    import jiyangfuwu from '@/views/modules/jiyangfuwu/list'
    import config from '@/views/modules/config/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/chongwuxinxi',
        name: '宠物信息',
        component: chongwuxinxi
      }
      ,{
	path: '/jiyangrizhi',
        name: '寄养日志',
        component: jiyangrizhi
      }
      ,{
	path: '/news',
        name: '宠物知识',
        component: news
      }
      ,{
	path: '/goumaidingdan',
        name: '购买订单',
        component: goumaidingdan
      }
      ,{
	path: '/siliaozhonglei',
        name: '饲料种类',
        component: siliaozhonglei
      }
      ,{
	path: '/chongwuyiliao',
        name: '宠物医疗',
        component: chongwuyiliao
      }
      ,{
	path: '/chongwuhuodong',
        name: '宠物活动',
        component: chongwuhuodong
      }
      ,{
	path: '/yuyuejiyang',
        name: '预约寄养',
        component: yuyuejiyang
      }
      ,{
	path: '/chongwuzhonglei',
        name: '宠物种类',
        component: chongwuzhonglei
      }
      ,{
	path: '/forum',
        name: '宠物论坛',
        component: forum
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chongwusiliao',
        name: '宠物饲料',
        component: chongwusiliao
      }
      ,{
	path: '/jiyangfuwu',
        name: '寄养服务',
        component: jiyangfuwu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/newstype',
        name: '宠物知识分类',
        component: newstype
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
