package com.entity.vo;

import com.entity.FangwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 房屋信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-15 17:45:40
 */
public class FangwuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房屋分类
	 */
	
	private String fangwufenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 楼层
	 */
	
	private String louceng;
		
	/**
	 * 房屋号
	 */
	
	private String fangwuhao;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 房屋价格
	 */
	
	private Integer fangwujiage;
		
	/**
	 * 房屋设施
	 */
	
	private String fangwusheshi;
		
	/**
	 * 房屋介绍
	 */
	
	private String fangwujieshao;
				
	
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
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
	 * 设置：房屋价格
	 */
	 
	public void setFangwujiage(Integer fangwujiage) {
		this.fangwujiage = fangwujiage;
	}
	
	/**
	 * 获取：房屋价格
	 */
	public Integer getFangwujiage() {
		return fangwujiage;
	}
				
	
	/**
	 * 设置：房屋设施
	 */
	 
	public void setFangwusheshi(String fangwusheshi) {
		this.fangwusheshi = fangwusheshi;
	}
	
	/**
	 * 获取：房屋设施
	 */
	public String getFangwusheshi() {
		return fangwusheshi;
	}
				
	
	/**
	 * 设置：房屋介绍
	 */
	 
	public void setFangwujieshao(String fangwujieshao) {
		this.fangwujieshao = fangwujieshao;
	}
	
	/**
	 * 获取：房屋介绍
	 */
	public String getFangwujieshao() {
		return fangwujieshao;
	}
			
}
