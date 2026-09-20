<template>
<div class="home-preview" :style='{"padding":"0","margin":"0px auto","flexWrap":"wrap","background":"#fff","display":"flex","width":"100%","justifyContent":"space-between"}'>




		
	<!-- 新闻资讯 -->
	<div id="animate_newsnews" class="news animate__animated" :style='{"width":"100%","padding":"0 calc((100% - 1200px)/2)","margin":"20px auto 10px","position":"relative","background":"url(),#fff","order":"5"}'>
		<div v-if="false" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
			<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		</div>
		
		<div class="title" :style='{"padding":"0 0 10px","margin":"0 auto","textAlign":"center","background":"url(http://codegen.caihongy.cn/20240131/2a430ef16f4e4cd097649b7ed3473f46.png) no-repeat center bottom","display":"block","width":"100%","height":"auto"}'>
			<span :style='{"padding":"0 20px","color":"rgba(22,159, 25,1)","background":"none","display":"block","fontSize":"25px","lineHeight":"44px","fontWeight":"500"}'>宠物知识</span>
		</div>
		
			
			
			
			
			
			
			
			<!-- 样式七 -->
		<div v-if="newsList.length" class="list list7 index-pv1" :style='{"padding":"0","margin":"40px 0 0","color":"#aaa","flexWrap":"wrap","background":"#fff","display":"flex","width":"100%","fontSize":"12px","justifyContent":"space-between","height":"auto"}'>
		  <div v-for="(item,index) in newsList" v-if="index<4" :key="index" @click="toDetail('newsDetail', item)" class="new7-list-item animation-box" style="cursor: pointer;" :style='{"cursor":"pointer","padding":"0 0 16px","margin":"0 0 16px","borderColor":"#ccc","background":"#fff","borderWidth":"0 0 1px","width":"49%","position":"relative","borderStyle":"dashed","height":"auto"}'>
		    <img :style='{"width":"130px","margin":"0 10px 0 0","objectFit":"cover","float":"left","height":"110px"}' style="box-sizing: border-box;object-fit: cover;width: 100%;height: 250px;" :src="baseUrl + item.picture">
		    <div :style='{"padding":"0 0 0 70px","overflow":"hidden","whiteSpace":"nowrap","color":"#333","background":"#fff","width":"calc(100% - 140px)","fontSize":"14px","lineHeight":"24px","textOverflow":"ellipsis","float":"right"}' class="new7-list-item-title line1">{{ item.title }}</div>
		    <div :style='{"padding":"0 0px","overflow":"hidden","color":"#5A5A5A","background":"#fff","width":"calc(100% - 140px)","fontSize":"12px","lineHeight":"24px","float":"right","height":"48px"}' class="new7-list-item-descript line1">{{ item.introduction }}</div>
		    <div :style='{"width":"calc(100% - 140px)","padding":"0 0px","lineHeight":"1.5","fontSize":"12px","color":"#aaa","float":"right"}'>
		      <span class="icon iconfont " :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		      <span class="text" :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{item.addtime}}</span>
		    </div>
		    <div :style='{"padding":"0 0px","display":"inline-block"}'>
		      <span class="icon iconfont icon-geren16" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		      <span class="text" :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{item.name}}</span>
		    </div>
		    <div :style='{"padding":"0 0px","display":"inline-block"}'>
		      <span class="icon iconfont icon-zan10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		      <span class="text" :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{item.thumbsupnum}}</span>
		    </div>
		    <div :style='{"padding":"0 0px","display":"inline-block"}'>
		      <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		      <span class="text" :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{item.storeupnum}}</span>
		    </div>
		    <div :style='{"padding":"0 0px","display":"inline-block"}'>
		      <span class="icon iconfont icon-chakan2" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		      <span class="text" :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{item.clicknum}}</span>
		    </div>
			<div :style='{"padding":"0 0px","alignItems":"center","top":"0","left":"140px","display":"inline","width":"auto","position":"absolute","justifyContent":"space-between","height":"auto"}'>
		      <div :style='{"color":"#169f19","fontSize":"14px","lineHeight":"24px"}'>[新闻咨询]</div>
		      <div :style='{"fontSize":"14px","lineHeight":"24px","color":"#999","display":"none"}'></div>
		    </div>
		  </div>
		</div>
			
			
			
		











		<div @click="moreBtn('news')" :style='{"border":"1px solid #1d800150","cursor":"pointer","padding":"0 10px","margin":"20px auto 0","textAlign":"center","background":"none","display":"flex","width":"168px","lineHeight":"44px","justifyContent":"center"}'>
			<span :style='{"color":"#1d8001","fontSize":"15px","order":"2"}'>查看更多</span>
			<i :style='{"color":"#1d8001","margin":"0 5px 0 0","fontSize":"16px"}' class="icon iconfont icon-jiantou18"></i>
		</div>
		
		</div>
	<!-- 新闻资讯 -->


<!-- 商品推荐 -->
<div id="animate_recommendchongwuxinxi" class="recommend animate__animated" :style='{"padding":"0 calc((100% - 1200px)/2)","margin":"20px 0 0","borderColor":"#e9e9e9","background":"#fff","borderWidth":"0px","width":"100%","position":"relative","borderStyle":"solid","order":"1"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"0","top":"105px","left":"calc((100% - 1200px)/2 + 35px)","background":"url(http://codegen.caihongy.cn/20240131/07f0b43b4dae4a399769d3e3e076b783.png) no-repeat center top","width":"231px","position":"absolute","height":"126px"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"margin":"0px 0 40px","borderColor":"#ddd","alignItems":"center","background":"url(http://codegen.caihongy.cn/20240131/2a430ef16f4e4cd097649b7ed3473f46.png) no-repeat center bottom","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"center","height":"78px"}'>
		<span :style='{"padding":"0","borderColor":"#fb3f52","margin":"10px 0 0","color":"rgba(22,159, 25,1)","background":"none","borderWidth":"0 0 0px","display":"inline-block","width":"auto","fontSize":"25px","lineHeight":"1.2","borderStyle":"solid","fontWeight":"600"}'>宠物信息推荐</span>
	</div>
	
	
	
	
	
	
	
	
	
	


	<div v-if="chongwuxinxiRecommend.length" class="list list11 index-pv1" :style='{"padding":"0","margin":"0","background":"none","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
	  <div class="tab" :style='{"border":"0px solid rgba(22, 159, 25)","padding":"0","margin":"0 40px 0 0","flexWrap":"wrap","background":"none","display":"flex","width":"240px","height":"auto"}'>
		<template v-for="(item,index) in recommendList11chongwuxinxi">
	    <div v-if="index < 6" :style='{"cursor":"pointer","padding":"0 10px","margin":"0 0 10px","borderColor":"#eee","alignItems":"center","textAlign":"center","display":"flex","justifyContent":"center","borderWidth":"0 0 1px","background":"#169f19","width":"100%","borderStyle":"solid","height":"auto"}' class="item" @click="recommendIndexClick11(item,'chongwuxinxi')">
	      <span class="icon iconfont icon-jiantou34" :style='{"margin":"0 5px 0 0","lineHeight":"44px","fontSize":"16px","color":"#333","display":"none"}'></span>
	      <img v-if="item.image" :style='{"width":"44px","margin":"0 5px 0 0","objectFit":"cover","display":"none","height":"44px"}' :src="baseUrl + (item.image?item.image.split(',')[0]:'')">
		  <span :style='{"color":"#fff","lineHeight":"44px","fontSize":"14px"}'>{{item[recommendColumn11chongwuxinxi]}}</span>
	    </div>
		</template>
		<div :style='{"cursor":"pointer","padding":"0 20px","margin":"10px 0","borderColor":"#169f1950","alignItems":"center","textAlign":"center","borderWidth":"1px","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"center","height":"auto"}' class="more" @click="moreBtn('chongwuxinxi')">
		  <span class="icon iconfont icon-jiantou18" :style='{"margin":"0 5px 0 0","lineHeight":"40px","fontSize":"16px","color":"#169f19","display":"inline-block"}'></span>
		  <div :style='{"lineHeight":"40px","fontSize":"16px","color":"#169f19","display":"inline-block"}'>查看更多</div>
		</div>
	  </div>
	  <div class="list" :style='{"flexWrap":"wrap","flex":"1","background":"none","justifyContent":"space-between","display":"flex","height":"auto"}'>
	    <div :style='{"cursor":"pointer","width":"31%","margin":"0 0 20px","overflow":"hidden","position":"relative","height":"auto"}' class="item list-item animation-box" v-for="item,index in chongwuxinxiRecommend" :key="index" @click="toDetail('chongwuxinxiDetail', item)">
			<img :name="item.id" :style='{"width":"100%","margin":"0 0 5px","objectFit":"cover","display":"block","height":"200px"}' v-if="preHttp(item.chongwuzhaopian)" :src="item.chongwuzhaopian.split(',')[0]" alt="" />
			<img :name="item.id" :style='{"width":"100%","margin":"0 0 5px","objectFit":"cover","display":"block","height":"200px"}' v-else :src="baseUrl + (item.chongwuzhaopian?item.chongwuzhaopian.split(',')[0]:'')" alt="" />
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","whiteSpace":"nowrap","color":"#333","textAlign":"center","overflow":"hidden","borderWidth":"0 0 0px","background":"#fff","width":"100%","lineHeight":"24px","fontSize":"14px","textOverflow":"ellipsis","borderStyle":"solid"}'>{{item.chongwuzhonglei}}</div>
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","whiteSpace":"nowrap","color":"#333","textAlign":"center","overflow":"hidden","borderWidth":"0 0 0px","background":"#fff","width":"100%","lineHeight":"24px","fontSize":"14px","textOverflow":"ellipsis","borderStyle":"solid"}'>{{item.chongwupinzhong}}</div>
	    </div>
	  </div>
	</div>





	
	<div @click="moreBtn('chongwuxinxi')" :style='{"border":"0px solid #fff","cursor":"pointer","padding":"0 10px","margin":"0px auto","textAlign":"center","display":"none","right":"10px","top":"16px","borderRadius":"20px","background":"none","width":"auto","lineHeight":"20px","position":"absolute"}'>
		<span :style='{"color":"#666","fontSize":"14px"}'>更多>></span>
		<i :style='{"color":"#fff","fontSize":"14px","display":"none"}' class="icon iconfont icon-jiantou09"></i>
	</div>
	
</div>
<!-- 商品推荐 -->

<!-- 商品推荐 -->
<div id="animate_recommendchongwusiliao" class="recommend animate__animated" :style='{"padding":"0 calc((100% - 1200px)/2)","margin":"20px 0 0","borderColor":"#e9e9e9","background":"#fff","borderWidth":"0px","width":"100%","position":"relative","borderStyle":"solid","order":"1"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"0","top":"105px","left":"calc((100% - 1200px)/2 + 35px)","background":"url(http://codegen.caihongy.cn/20240131/07f0b43b4dae4a399769d3e3e076b783.png) no-repeat center top","width":"231px","position":"absolute","height":"126px"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"margin":"0px 0 40px","borderColor":"#ddd","alignItems":"center","background":"url(http://codegen.caihongy.cn/20240131/2a430ef16f4e4cd097649b7ed3473f46.png) no-repeat center bottom","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"center","height":"78px"}'>
		<span :style='{"padding":"0","borderColor":"#fb3f52","margin":"10px 0 0","color":"rgba(22,159, 25,1)","background":"none","borderWidth":"0 0 0px","display":"inline-block","width":"auto","fontSize":"25px","lineHeight":"1.2","borderStyle":"solid","fontWeight":"600"}'>宠物饲料推荐</span>
	</div>
	
	
	
	
	
	
	
	
	
	


	<div v-if="chongwusiliaoRecommend.length" class="list list11 index-pv1" :style='{"padding":"0","margin":"0","background":"none","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
	  <div class="tab" :style='{"border":"0px solid rgba(22, 159, 25)","padding":"0","margin":"0 40px 0 0","flexWrap":"wrap","background":"none","display":"flex","width":"240px","height":"auto"}'>
		<template v-for="(item,index) in recommendList11chongwusiliao">
	    <div v-if="index < 6" :style='{"cursor":"pointer","padding":"0 10px","margin":"0 0 10px","borderColor":"#eee","alignItems":"center","textAlign":"center","display":"flex","justifyContent":"center","borderWidth":"0 0 1px","background":"#169f19","width":"100%","borderStyle":"solid","height":"auto"}' class="item" @click="recommendIndexClick11(item,'chongwusiliao')">
	      <span class="icon iconfont icon-jiantou34" :style='{"margin":"0 5px 0 0","lineHeight":"44px","fontSize":"16px","color":"#333","display":"none"}'></span>
	      <img v-if="item.image" :style='{"width":"44px","margin":"0 5px 0 0","objectFit":"cover","display":"none","height":"44px"}' :src="baseUrl + (item.image?item.image.split(',')[0]:'')">
		  <span :style='{"color":"#fff","lineHeight":"44px","fontSize":"14px"}'>{{item[recommendColumn11chongwusiliao]}}</span>
	    </div>
		</template>
		<div :style='{"cursor":"pointer","padding":"0 20px","margin":"10px 0","borderColor":"#169f1950","alignItems":"center","textAlign":"center","borderWidth":"1px","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"center","height":"auto"}' class="more" @click="moreBtn('chongwusiliao')">
		  <span class="icon iconfont icon-jiantou18" :style='{"margin":"0 5px 0 0","lineHeight":"40px","fontSize":"16px","color":"#169f19","display":"inline-block"}'></span>
		  <div :style='{"lineHeight":"40px","fontSize":"16px","color":"#169f19","display":"inline-block"}'>查看更多</div>
		</div>
	  </div>
	  <div class="list" :style='{"flexWrap":"wrap","flex":"1","background":"none","justifyContent":"space-between","display":"flex","height":"auto"}'>
	    <div :style='{"cursor":"pointer","width":"31%","margin":"0 0 20px","overflow":"hidden","position":"relative","height":"auto"}' class="item list-item animation-box" v-for="item,index in chongwusiliaoRecommend" :key="index" @click="toDetail('chongwusiliaoDetail', item)">
			<img :name="item.id" :style='{"width":"100%","margin":"0 0 5px","objectFit":"cover","display":"block","height":"200px"}' v-if="preHttp(item.siliaotupian)" :src="item.siliaotupian.split(',')[0]" alt="" />
			<img :name="item.id" :style='{"width":"100%","margin":"0 0 5px","objectFit":"cover","display":"block","height":"200px"}' v-else :src="baseUrl + (item.siliaotupian?item.siliaotupian.split(',')[0]:'')" alt="" />
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","whiteSpace":"nowrap","color":"#333","textAlign":"center","overflow":"hidden","borderWidth":"0 0 0px","background":"#fff","width":"100%","lineHeight":"24px","fontSize":"14px","textOverflow":"ellipsis","borderStyle":"solid"}'>{{item.siliaomingcheng}}</div>
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","whiteSpace":"nowrap","color":"#333","textAlign":"center","overflow":"hidden","borderWidth":"0 0 0px","background":"#fff","width":"100%","lineHeight":"24px","fontSize":"14px","textOverflow":"ellipsis","borderStyle":"solid"}'>{{item.siliaozhonglei}}</div>
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","whiteSpace":"nowrap","color":"#333","textAlign":"center","overflow":"hidden","borderWidth":"0 0 0px","background":"#fff","width":"100%","lineHeight":"24px","fontSize":"14px","textOverflow":"ellipsis","borderStyle":"solid"}'>{{item.siliaopinpai}}</div>
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","whiteSpace":"nowrap","color":"#333","textAlign":"center","overflow":"hidden","borderWidth":"0 0 0px","background":"#fff","width":"100%","lineHeight":"24px","fontSize":"14px","textOverflow":"ellipsis","borderStyle":"solid"}'>价格:{{item.jiage}}</div>
	    </div>
	  </div>
	</div>





	
	<div @click="moreBtn('chongwusiliao')" :style='{"border":"0px solid #fff","cursor":"pointer","padding":"0 10px","margin":"0px auto","textAlign":"center","display":"none","right":"10px","top":"16px","borderRadius":"20px","background":"none","width":"auto","lineHeight":"20px","position":"absolute"}'>
		<span :style='{"color":"#666","fontSize":"14px"}'>更多>></span>
		<i :style='{"color":"#fff","fontSize":"14px","display":"none"}' class="icon iconfont icon-jiantou09"></i>
	</div>
	
</div>
<!-- 商品推荐 -->

	
</div>
</template>

<script>
import 'animate.css'
import Swiper from "swiper";

  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        newsList: [],
        chongwuxinxiRecommend: [],
        chongwusiliaoRecommend: [],



		recommendIndex11chongwuxinxi: '',
		recommendList11chongwuxinxi: [],
		recommendColumn11chongwuxinxi: '',
		recommendIndex11chongwusiliao: '',
		recommendList11chongwusiliao: [],
		recommendColumn11chongwusiliao: '',


      }
    },
    created() {
		this.baseUrl = this.$config.baseUrl;
		this.getNewsList();
		this.getList();
		this.chongwuxinxiRecommendCate()
		this.chongwusiliaoRecommendCate()
    },
	mounted() {
		window.addEventListener('scroll', this.handleScroll)
		setTimeout(()=>{
			this.handleScroll()
		},100)
		
		this.swiperChanges()
	},
	beforeDestroy() {
	  window.removeEventListener('scroll', this.handleScroll)
	},
    //方法集合
    methods: {
		swiperChanges() {
			setTimeout(()=>{
			},750)
		},
		chongwuxinxiRecommendCate(){
			this.$http.get('chongwuzhonglei/list',{}).then(res => {
			  if (res.data.code == 0) {
				this.recommendList11chongwuxinxi = res.data.data.list
			  }
			});
			this.recommendColumn11chongwuxinxi = 'chongwuzhonglei'
		},
		chongwusiliaoRecommendCate(){
			this.$http.get('siliaozhonglei/list',{}).then(res => {
			  if (res.data.code == 0) {
				this.recommendList11chongwusiliao = res.data.data.list
			  }
			});
			this.recommendColumn11chongwusiliao = 'siliaozhonglei'
		},
		recommendIndexClick11(index, name) {
			this['recommendIndex11' + name] = index[this['recommendColumn11' + name]]
			this.getList()
		},


		handleScroll() {
			let arr = [
				{id:'search',css:'animate__'},
				{id:'about',css:'animate__'},
				{id:'system',css:'animate__'},
				{id:'animate_recommendchongwuxinxi',css:'animate__'},
				{id:'animate_recommendchongwusiliao',css:'animate__'},
				{id:'animate_newsnews',css:'animate__'},
				{id:'msgs',css:'animate__'},
				{id:'friendly',css:'animate__'}
			]
			
			for (let i in arr) {
				let doc = document.getElementById(arr[i].id)
				if (doc) {
					let top = doc.offsetTop
					let win_top = window.innerHeight + window.pageYOffset
					// console.log(top,win_top)
					if (win_top > top && doc.classList.value.indexOf(arr[i].css) < 0) {
						// console.log(doc)
						doc.classList.add(arr[i].css)
					}
				}
			}
		},
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
		getNewsList() {
			let data = {
				page: 1,
				limit: 6,
                sort: 'addtime',
				order: 'desc'
			}
			this.$http.get('news/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
			let autoSortUrl = "";
			let data = {}
          autoSortUrl = "chongwuxinxi/autoSort";
			data = {
				page: 1,
				limit: 6,
			}
				if(this.recommendIndex11chongwuxinxi){
					data.chongwuzhonglei = this.recommendIndex11chongwuxinxi
				}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.chongwuxinxiRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
          autoSortUrl = "chongwusiliao/autoSort";
			data = {
				page: 1,
				limit: 6,
			}
				if(this.recommendIndex11chongwusiliao){
					data.siliaozhonglei = this.recommendIndex11chongwusiliao
				}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.chongwusiliaoRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {id: item.id}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
		// -------- search --------
		.search .select ::v-deep .el-input__inner {
			border: 1px solid #ddd;
			border-radius: 0px;
			padding: 0 30px 0 10px;
			color: #666;
			width: 180px;
			font-size: 14px;
			height: 40px;
		}
		
		.search .input ::v-deep .el-input__inner {
			border: 1px solid #ddd;
			border-radius: 0px;
			padding: 0 10px;
			box-shadow: 0 0 0px rgba(64, 158, 255, .3);
			outline: none;
			color: #666;
			width: 350px;
			font-size: 14px;
			height: 40px;
		}
		// -------- search --------
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, -10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.02) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
	










	.home-preview .lists .list16 .list-item {
				border: 1px solid #eee;
				cursor: pointer;
				padding: 10px;
				margin: 0 2% 30px 0;
				background: none;
				display: flex;
				width: 31.3%;
				font-size: 0;
				position: relative;
				flex-wrap: wrap;
				height: auto;
			}
	
	.home-preview .lists .list16 .list-item:hover {
				border: 1px solid #16a019;
				background: #fff;
			}
	
	.home-preview .lists .list16 .list-item .title {
				padding: 0 10px;
				overflow: hidden;
				color: #333;
				white-space: nowrap;
				width: 100%;
				font-size: 14px;
				border-color: #ddd;
				border-width: 0 0 0px 0;
				line-height: 24px;
				text-overflow: ellipsis;
				border-style: solid;
				text-align: center ;
			}
	
	.home-preview .lists .list16 .list-item:hover .title {
				color: #333;
			}
	
	.home-preview .lists .list16 .list-item .time .icon {
				margin: 0 2px 0 0;
				color: inherit;
				font-size: 14px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .time .icon {
				color: #666;
			}
	.home-preview .lists .list16 .list-item .time .text {
				color: inherit;
				font-size: 14px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .time .text {
				color: #666;
			}
	
	.home-preview .lists .list16 .list-item .publisher .icon {
				margin: 0 2px 0 0;
				color: inherit;
				font-size: 14px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .publisher .icon {
				color: #666;
			}
	.home-preview .lists .list16 .list-item .publisher .text {
				color: inherit;
				font-size: 14px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .publisher .text {
				color: #666;
			}
	
	.home-preview .lists .list16 .list-item .like .icon {
				margin: 0 2px 0 0;
				color: inherit;
				font-size: 4px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .like .icon {
				color: #666;
			}
	.home-preview .lists .list16 .list-item .like .text {
				color: inherit;
				font-size: 14px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .like .text {
				color: #666;
			}
	
	.home-preview .lists .list16 .list-item .collect .icon {
				margin: 0 2px 0 0;
				color: inherit;
				font-size: 14px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .collect .icon {
				color: #666;
			}
	.home-preview .lists .list16 .list-item .collect .text {
				color: inherit;
				font-size: 14px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .collect .text {
				color: #666;
			}
	
	.home-preview .lists .list16 .list-item .view .icon {
				margin: 0 2px 0 0;
				color: inherit;
				font-size: 14px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .view .icon {
				color: #666;
			}
	.home-preview .lists .list16 .list-item .view .text {
				color: inherit;
				font-size: 14px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .view .text {
				color: #666;
			}
	
	.home-preview .lists .list16 .list-item .desc {
				color: #666;
				flex: 1;
				display: none;
				font-size: 12px;
				line-height: 1.5;
			}
	.home-preview .lists .list16 .list-item:hover .desc {
				color: #fff;
			}
</style>
