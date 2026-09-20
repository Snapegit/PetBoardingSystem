package com.entity.model;

import com.entity.ChongwusiliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 宠物饲料
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-07 21:40:10
 */
public class ChongwusiliaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 饲料种类
	 */
	
	private String siliaozhonglei;
		
	/**
	 * 饲料图片
	 */
	
	private String siliaotupian;
		
	/**
	 * 饲料品牌
	 */
	
	private String siliaopinpai;
		
	/**
	 * 饲料规格
	 */
	
	private String siliaoguige;
		
	/**
	 * 价格
	 */
	
	private Double jiage;
		
	/**
	 * 出厂公司
	 */
	
	private String chuchanggongsi;
		
	/**
	 * 饲料配料
	 */
	
	private String siliaopeiliao;
		
	/**
	 * 饲料详情
	 */
	
	private String siliaoxiangqing;
		
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
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：饲料种类
	 */
	 
	public void setSiliaozhonglei(String siliaozhonglei) {
		this.siliaozhonglei = siliaozhonglei;
	}
	
	/**
	 * 获取：饲料种类
	 */
	public String getSiliaozhonglei() {
		return siliaozhonglei;
	}
				
	
	/**
	 * 设置：饲料图片
	 */
	 
	public void setSiliaotupian(String siliaotupian) {
		this.siliaotupian = siliaotupian;
	}
	
	/**
	 * 获取：饲料图片
	 */
	public String getSiliaotupian() {
		return siliaotupian;
	}
				
	
	/**
	 * 设置：饲料品牌
	 */
	 
	public void setSiliaopinpai(String siliaopinpai) {
		this.siliaopinpai = siliaopinpai;
	}
	
	/**
	 * 获取：饲料品牌
	 */
	public String getSiliaopinpai() {
		return siliaopinpai;
	}
				
	
	/**
	 * 设置：饲料规格
	 */
	 
	public void setSiliaoguige(String siliaoguige) {
		this.siliaoguige = siliaoguige;
	}
	
	/**
	 * 获取：饲料规格
	 */
	public String getSiliaoguige() {
		return siliaoguige;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Double jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Double getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：出厂公司
	 */
	 
	public void setChuchanggongsi(String chuchanggongsi) {
		this.chuchanggongsi = chuchanggongsi;
	}
	
	/**
	 * 获取：出厂公司
	 */
	public String getChuchanggongsi() {
		return chuchanggongsi;
	}
				
	
	/**
	 * 设置：饲料配料
	 */
	 
	public void setSiliaopeiliao(String siliaopeiliao) {
		this.siliaopeiliao = siliaopeiliao;
	}
	
	/**
	 * 获取：饲料配料
	 */
	public String getSiliaopeiliao() {
		return siliaopeiliao;
	}
				
	
	/**
	 * 设置：饲料详情
	 */
	 
	public void setSiliaoxiangqing(String siliaoxiangqing) {
		this.siliaoxiangqing = siliaoxiangqing;
	}
	
	/**
	 * 获取：饲料详情
	 */
	public String getSiliaoxiangqing() {
		return siliaoxiangqing;
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
