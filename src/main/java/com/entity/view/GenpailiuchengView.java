package com.entity.view;

import com.entity.GenpailiuchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 跟拍流程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-24 11:54:57
 */
@TableName("genpailiucheng")
public class GenpailiuchengView  extends GenpailiuchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GenpailiuchengView(){
	}
 
 	public GenpailiuchengView(GenpailiuchengEntity genpailiuchengEntity){
 	try {
			BeanUtils.copyProperties(this, genpailiuchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
