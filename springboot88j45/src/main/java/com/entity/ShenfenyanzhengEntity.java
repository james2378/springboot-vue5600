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
 * 身份验证
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-15 17:45:41
 */
@TableName("shenfenyanzheng")
public class ShenfenyanzhengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShenfenyanzhengEntity() {
		
	}
	
	public ShenfenyanzhengEntity(T t) {
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
	 * 土地使用证
	 */
					
	private String tudishiyongzheng;
	
	/**
	 * 建设用地规划许可证
	 */
					
	private String jiansheyongdiguihuaxukezheng;
	
	/**
	 * 建设工程规划许可
	 */
					
	private String jianshegongchengguihuaxuke;
	
	/**
	 * 建筑工程施工许可证
	 */
					
	private String jianzhugongchengshigongxukezheng;
	
	/**
	 * 商品房预售许可证
	 */
					
	private String shangpinfangyushouxukezheng;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 上传时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shangchuanshijian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：土地使用证
	 */
	public void setTudishiyongzheng(String tudishiyongzheng) {
		this.tudishiyongzheng = tudishiyongzheng;
	}
	/**
	 * 获取：土地使用证
	 */
	public String getTudishiyongzheng() {
		return tudishiyongzheng;
	}
	/**
	 * 设置：建设用地规划许可证
	 */
	public void setJiansheyongdiguihuaxukezheng(String jiansheyongdiguihuaxukezheng) {
		this.jiansheyongdiguihuaxukezheng = jiansheyongdiguihuaxukezheng;
	}
	/**
	 * 获取：建设用地规划许可证
	 */
	public String getJiansheyongdiguihuaxukezheng() {
		return jiansheyongdiguihuaxukezheng;
	}
	/**
	 * 设置：建设工程规划许可
	 */
	public void setJianshegongchengguihuaxuke(String jianshegongchengguihuaxuke) {
		this.jianshegongchengguihuaxuke = jianshegongchengguihuaxuke;
	}
	/**
	 * 获取：建设工程规划许可
	 */
	public String getJianshegongchengguihuaxuke() {
		return jianshegongchengguihuaxuke;
	}
	/**
	 * 设置：建筑工程施工许可证
	 */
	public void setJianzhugongchengshigongxukezheng(String jianzhugongchengshigongxukezheng) {
		this.jianzhugongchengshigongxukezheng = jianzhugongchengshigongxukezheng;
	}
	/**
	 * 获取：建筑工程施工许可证
	 */
	public String getJianzhugongchengshigongxukezheng() {
		return jianzhugongchengshigongxukezheng;
	}
	/**
	 * 设置：商品房预售许可证
	 */
	public void setShangpinfangyushouxukezheng(String shangpinfangyushouxukezheng) {
		this.shangpinfangyushouxukezheng = shangpinfangyushouxukezheng;
	}
	/**
	 * 获取：商品房预售许可证
	 */
	public String getShangpinfangyushouxukezheng() {
		return shangpinfangyushouxukezheng;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：上传时间
	 */
	public void setShangchuanshijian(Date shangchuanshijian) {
		this.shangchuanshijian = shangchuanshijian;
	}
	/**
	 * 获取：上传时间
	 */
	public Date getShangchuanshijian() {
		return shangchuanshijian;
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
