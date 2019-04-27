package com.gaoyuanquan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaoyuanquan.bean.None;
import com.gaoyuanquan.mapper.NoneMapper;

@Service
public class NoneServiceImpl implements NoneService {
	@Autowired
	private NoneMapper mapper;

	@Override
	public List getList(String name) {
		return mapper.getList(name);
	}

	@Override
	public List<None> selById(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selById(id);
	}
	
	
}
