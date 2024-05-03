package com.dao;

import com.entity.SheyinggenpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SheyinggenpaiVO;
import com.entity.view.SheyinggenpaiView;


/**
 * 摄影跟拍
 * 
 * @author 
 * @email 
 * @date 2022-02-24 11:54:57
 */
public interface SheyinggenpaiDao extends BaseMapper<SheyinggenpaiEntity> {
	
	List<SheyinggenpaiVO> selectListVO(@Param("ew") Wrapper<SheyinggenpaiEntity> wrapper);
	
	SheyinggenpaiVO selectVO(@Param("ew") Wrapper<SheyinggenpaiEntity> wrapper);
	
	List<SheyinggenpaiView> selectListView(@Param("ew") Wrapper<SheyinggenpaiEntity> wrapper);

	List<SheyinggenpaiView> selectListView(Pagination page,@Param("ew") Wrapper<SheyinggenpaiEntity> wrapper);
	
	SheyinggenpaiView selectView(@Param("ew") Wrapper<SheyinggenpaiEntity> wrapper);
	

}
