package com.entity.view;

import com.entity.ShenfenyanzhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 身份验证
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-15 17:45:41
 */
@TableName("shenfenyanzheng")
public class ShenfenyanzhengView  extends ShenfenyanzhengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenfenyanzhengView(){
	}
 
 	public ShenfenyanzhengView(ShenfenyanzhengEntity shenfenyanzhengEntity){
 	try {
			BeanUtils.copyProperties(this, shenfenyanzhengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
