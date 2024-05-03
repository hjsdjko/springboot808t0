package com.dao;

import com.entity.GenpailiuchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GenpailiuchengVO;
import com.entity.view.GenpailiuchengView;


/**
 * 跟拍流程
 * 
 * @author 
 * @email 
 * @date 2022-02-24 11:54:57
 */
public interface GenpailiuchengDao extends BaseMapper<GenpailiuchengEntity> {
	
	List<GenpailiuchengVO> selectListVO(@Param("ew") Wrapper<GenpailiuchengEntity> wrapper);
	
	GenpailiuchengVO selectVO(@Param("ew") Wrapper<GenpailiuchengEntity> wrapper);
	
	List<GenpailiuchengView> selectListView(@Param("ew") Wrapper<GenpailiuchengEntity> wrapper);

	List<GenpailiuchengView> selectListView(Pagination page,@Param("ew") Wrapper<GenpailiuchengEntity> wrapper);
	
	GenpailiuchengView selectView(@Param("ew") Wrapper<GenpailiuchengEntity> wrapper);
	

}
