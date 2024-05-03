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


import com.dao.GenpailiuchengDao;
import com.entity.GenpailiuchengEntity;
import com.service.GenpailiuchengService;
import com.entity.vo.GenpailiuchengVO;
import com.entity.view.GenpailiuchengView;

@Service("genpailiuchengService")
public class GenpailiuchengServiceImpl extends ServiceImpl<GenpailiuchengDao, GenpailiuchengEntity> implements GenpailiuchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GenpailiuchengEntity> page = this.selectPage(
                new Query<GenpailiuchengEntity>(params).getPage(),
                new EntityWrapper<GenpailiuchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GenpailiuchengEntity> wrapper) {
		  Page<GenpailiuchengView> page =new Query<GenpailiuchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GenpailiuchengVO> selectListVO(Wrapper<GenpailiuchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GenpailiuchengVO selectVO(Wrapper<GenpailiuchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GenpailiuchengView> selectListView(Wrapper<GenpailiuchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GenpailiuchengView selectView(Wrapper<GenpailiuchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
