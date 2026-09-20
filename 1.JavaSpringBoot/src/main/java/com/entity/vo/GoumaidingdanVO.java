package com.entity.vo;

import com.entity.GoumaidingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 购买订单
 * @author 
 * @email 
 * @date 2024-04-07 21:40:10
 */
public class GoumaidingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 饲料名称
	 */
	
	private String siliaomingcheng;
		
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
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 订单金额
	 */
	
	private Double dingdanjine;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机号
	 */
	
	private String shoujihao;
		
	/**
	 * 下单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiadanshijian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：饲料名称
	 */
	 
	public void setSiliaomingcheng(String siliaomingcheng) {
		this.siliaomingcheng = siliaomingcheng;
	}
	
	/**
	 * 获取：饲料名称
	 */
	public String getSiliaomingcheng() {
		return siliaomingcheng;
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
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：订单金额
	 */
	 
	public void setDingdanjine(Double dingdanjine) {
		this.dingdanjine = dingdanjine;
	}
	
	/**
	 * 获取：订单金额
	 */
	public Double getDingdanjine() {
		return dingdanjine;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机号
	 */
	 
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
				
	
	/**
	 * 设置：下单时间
	 */
	 
	public void setXiadanshijian(Date xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	
	/**
	 * 获取：下单时间
	 */
	public Date getXiadanshijian() {
		return xiadanshijian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
