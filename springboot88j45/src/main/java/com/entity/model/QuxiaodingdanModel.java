package com.entity.model;

import com.entity.QuxiaodingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 取消订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-15 17:45:40
 */
public class QuxiaodingdanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 楼层
	 */
	
	private String louceng;
		
	/**
	 * 房屋分类
	 */
	
	private String fangwufenlei;
		
	/**
	 * 房屋号
	 */
	
	private String fangwuhao;
		
	/**
	 * 房屋价格
	 */
	
	private String fangwujiage;
		
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
	 * 取消时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date quxiaoshijian;
		
	/**
	 * 取消事由
	 */
	
	private String quxiaoshiyou;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：房屋价格
	 */
	 
	public void setFangwujiage(String fangwujiage) {
		this.fangwujiage = fangwujiage;
	}
	
	/**
	 * 获取：房屋价格
	 */
	public String getFangwujiage() {
		return fangwujiage;
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
	 * 设置：取消时间
	 */
	 
	public void setQuxiaoshijian(Date quxiaoshijian) {
		this.quxiaoshijian = quxiaoshijian;
	}
	
	/**
	 * 获取：取消时间
	 */
	public Date getQuxiaoshijian() {
		return quxiaoshijian;
	}
				
	
	/**
	 * 设置：取消事由
	 */
	 
	public void setQuxiaoshiyou(String quxiaoshiyou) {
		this.quxiaoshiyou = quxiaoshiyou;
	}
	
	/**
	 * 获取：取消事由
	 */
	public String getQuxiaoshiyou() {
		return quxiaoshiyou;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
