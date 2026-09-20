package com.entity.model;

import com.entity.ChongwuyiliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 宠物医疗
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-07 21:40:10
 */
public class ChongwuyiliaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目图片
	 */
	
	private String xiangmutupian;
		
	/**
	 * 医院名称
	 */
	
	private String yiyuanmingcheng;
		
	/**
	 * 医院地址
	 */
	
	private String yiyuandizhi;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 医院简介
	 */
	
	private String yiyuanjianjie;
		
	/**
	 * 医生信息
	 */
	
	private String yishengxinxi;
		
	/**
	 * 项目介绍
	 */
	
	private String xiangmujieshao;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：项目图片
	 */
	 
	public void setXiangmutupian(String xiangmutupian) {
		this.xiangmutupian = xiangmutupian;
	}
	
	/**
	 * 获取：项目图片
	 */
	public String getXiangmutupian() {
		return xiangmutupian;
	}
				
	
	/**
	 * 设置：医院名称
	 */
	 
	public void setYiyuanmingcheng(String yiyuanmingcheng) {
		this.yiyuanmingcheng = yiyuanmingcheng;
	}
	
	/**
	 * 获取：医院名称
	 */
	public String getYiyuanmingcheng() {
		return yiyuanmingcheng;
	}
				
	
	/**
	 * 设置：医院地址
	 */
	 
	public void setYiyuandizhi(String yiyuandizhi) {
		this.yiyuandizhi = yiyuandizhi;
	}
	
	/**
	 * 获取：医院地址
	 */
	public String getYiyuandizhi() {
		return yiyuandizhi;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：医院简介
	 */
	 
	public void setYiyuanjianjie(String yiyuanjianjie) {
		this.yiyuanjianjie = yiyuanjianjie;
	}
	
	/**
	 * 获取：医院简介
	 */
	public String getYiyuanjianjie() {
		return yiyuanjianjie;
	}
				
	
	/**
	 * 设置：医生信息
	 */
	 
	public void setYishengxinxi(String yishengxinxi) {
		this.yishengxinxi = yishengxinxi;
	}
	
	/**
	 * 获取：医生信息
	 */
	public String getYishengxinxi() {
		return yishengxinxi;
	}
				
	
	/**
	 * 设置：项目介绍
	 */
	 
	public void setXiangmujieshao(String xiangmujieshao) {
		this.xiangmujieshao = xiangmujieshao;
	}
	
	/**
	 * 获取：项目介绍
	 */
	public String getXiangmujieshao() {
		return xiangmujieshao;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
