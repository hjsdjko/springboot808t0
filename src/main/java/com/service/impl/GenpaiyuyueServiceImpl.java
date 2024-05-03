package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GenpaiyuyueDao;
import com.entity.GenpaiyuyueEntity;
import com.service.GenpaiyuyueService;
import com.entity.vo.GenpaiyuyueVO;
import com.entity.view.GenpaiyuyueView;

@Service("genpaiyuyueService")
public class GenpaiyuyueServiceImpl extends ServiceImpl<GenpaiyuyueDao, GenpaiyuyueEntity> implements GenpaiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GenpaiyuyueEntity> page = this.selectPage(
                new Query<GenpaiyuyueEntity>(params).getPage(),
                new EntityWrapper<GenpaiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GenpaiyuyueEntity> wrapper) {
		  Page<GenpaiyuyueView> page =new Query<GenpaiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GenpaiyuyueVO> selectListVO(Wrapper<GenpaiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GenpaiyuyueVO selectVO(Wrapper<GenpaiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GenpaiyuyueView> selectListView(Wrapper<GenpaiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GenpaiyuyueView selectView(Wrapper<GenpaiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
