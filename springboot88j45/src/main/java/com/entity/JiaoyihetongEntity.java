package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 交易合同
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-15 17:45:40
 */
@TableName("jiaoyihetong")
public class JiaoyihetongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoyihetongEntity() {
		
	}
	
	public JiaoyihetongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 房屋名称
	 */
					
	private String fangwumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：房屋名称
	 */
	public void setFangwumingcheng(String fangwumingcheng) {
		this.fangwumingcheng = fangwumingcheng;
	}
	/**
	 * 获取：房屋名称
	 */
	public String getFangwumingcheng() {
		return fangwumingcheng;
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
