package com.entity.model;

import com.entity.ChongwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 宠物信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-07 21:40:09
 */
public class ChongwuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宠物种类
	 */
	
	private String chongwuzhonglei;
		
	/**
	 * 宠物品种
	 */
	
	private String chongwupinzhong;
		
	/**
	 * 宠物性别
	 */
	
	private String chongwuxingbie;
		
	/**
	 * 宠物年龄
	 */
	
	private String chongwunianling;
		
	/**
	 * 宠物照片
	 */
	
	private String chongwuzhaopian;
		
	/**
	 * 疫苗信息
	 */
	
	private String yimiaoxinxi;
		
	/**
	 * 健康状况
	 */
	
	private String jiankangzhuangkuang;
		
	/**
	 * 宠物详情
	 */
	
	private String chongwuxiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：宠物种类
	 */
	 
	public void setChongwuzhonglei(String chongwuzhonglei) {
		this.chongwuzhonglei = chongwuzhonglei;
	}
	
	/**
	 * 获取：宠物种类
	 */
	public String getChongwuzhonglei() {
		return chongwuzhonglei;
	}
				
	
	/**
	 * 设置：宠物品种
	 */
	 
	public void setChongwupinzhong(String chongwupinzhong) {
		this.chongwupinzhong = chongwupinzhong;
	}
	
	/**
	 * 获取：宠物品种
	 */
	public String getChongwupinzhong() {
		return chongwupinzhong;
	}
				
	
	/**
	 * 设置：宠物性别
	 */
	 
	public void setChongwuxingbie(String chongwuxingbie) {
		this.chongwuxingbie = chongwuxingbie;
	}
	
	/**
	 * 获取：宠物性别
	 */
	public String getChongwuxingbie() {
		return chongwuxingbie;
	}
				
	
	/**
	 * 设置：宠物年龄
	 */
	 
	public void setChongwunianling(String chongwunianling) {
		this.chongwunianling = chongwunianling;
	}
	
	/**
	 * 获取：宠物年龄
	 */
	public String getChongwunianling() {
		return chongwunianling;
	}
				
	
	/**
	 * 设置：宠物照片
	 */
	 
	public void setChongwuzhaopian(String chongwuzhaopian) {
		this.chongwuzhaopian = chongwuzhaopian;
	}
	
	/**
	 * 获取：宠物照片
	 */
	public String getChongwuzhaopian() {
		return chongwuzhaopian;
	}
				
	
	/**
	 * 设置：疫苗信息
	 */
	 
	public void setYimiaoxinxi(String yimiaoxinxi) {
		this.yimiaoxinxi = yimiaoxinxi;
	}
	
	/**
	 * 获取：疫苗信息
	 */
	public String getYimiaoxinxi() {
		return yimiaoxinxi;
	}
				
	
	/**
	 * 设置：健康状况
	 */
	 
	public void setJiankangzhuangkuang(String jiankangzhuangkuang) {
		this.jiankangzhuangkuang = jiankangzhuangkuang;
	}
	
	/**
	 * 获取：健康状况
	 */
	public String getJiankangzhuangkuang() {
		return jiankangzhuangkuang;
	}
				
	
	/**
	 * 设置：宠物详情
	 */
	 
	public void setChongwuxiangqing(String chongwuxiangqing) {
		this.chongwuxiangqing = chongwuxiangqing;
	}
	
	/**
	 * 获取：宠物详情
	 */
	public String getChongwuxiangqing() {
		return chongwuxiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
