package com.entity.vo;

import com.entity.JiaoyihetongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 交易合同
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-15 17:45:40
 */
public class JiaoyihetongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房屋分类
	 */
	
	private String fangwufenlei;
		
	/**
	 * 楼层
	 */
	
	private String louceng;
		
	/**
	 * 房屋号
	 */
	
	private String fangwuhao;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 用户手机
	 */
	
	private String yonghushouji;
		
	/**
	 * 房屋价格
	 */
	
	private Float fangwujiage;
		
	/**
	 * 签订合同
	 */
	
	private String qiandinghetong;
		
	/**
	 * 签订时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qiandingshijian;
				
	
	/**
	 * 设置：房屋分类
	 */
	 
	public void setFangwufenlei(String fangwufenlei) {
		this.fangwufenlei = fangwufenlei;
	}
	
	/**
	 * 获取：房屋分类
	 */
	public String getFangwufenlei() {
		return fangwufenlei;
	}
				
	
	/**
	 * 设置：楼层
	 */
	 
	public void setLouceng(String louceng) {
		this.louceng = louceng;
	}
	
	/**
	 * 获取：楼层
	 */
	public String getLouceng() {
		return louceng;
	}
				
	
	/**
	 * 设置：房屋号
	 */
	 
	public void setFangwuhao(String fangwuhao) {
		this.fangwuhao = fangwuhao;
	}
	
	/**
	 * 获取：房屋号
	 */
	public String getFangwuhao() {
		return fangwuhao;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：用户手机
	 */
	 
	public void setYonghushouji(String yonghushouji) {
		this.yonghushouji = yonghushouji;
	}
	
	/**
	 * 获取：用户手机
	 */
	public String getYonghushouji() {
		return yonghushouji;
	}
				
	
	/**
	 * 设置：房屋价格
	 */
	 
	public void setFangwujiage(Float fangwujiage) {
		this.fangwujiage = fangwujiage;
	}
	
	/**
	 * 获取：房屋价格
	 */
	public Float getFangwujiage() {
		return fangwujiage;
	}
				
	
	/**
	 * 设置：签订合同
	 */
	 
	public void setQiandinghetong(String qiandinghetong) {
		this.qiandinghetong = qiandinghetong;
	}
	
	/**
	 * 获取：签订合同
	 */
	public String getQiandinghetong() {
		return qiandinghetong;
	}
				
	
	/**
	 * 设置：签订时间
	 */
	 
	public void setQiandingshijian(Date qiandingshijian) {
		this.qiandingshijian = qiandingshijian;
	}
	
	/**
	 * 获取：签订时间
	 */
	public Date getQiandingshijian() {
		return qiandingshijian;
	}
			
}
