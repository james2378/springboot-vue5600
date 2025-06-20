package com.entity.view;

import com.entity.JiaoyihetongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 交易合同
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-15 17:45:40
 */
@TableName("jiaoyihetong")
public class JiaoyihetongView  extends JiaoyihetongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoyihetongView(){
	}
 
 	public JiaoyihetongView(JiaoyihetongEntity jiaoyihetongEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoyihetongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
