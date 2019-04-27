package com.gaoyuanquan.mapper;

import java.util.List;

import com.gaoyuanquan.bean.None;

public interface NoneMapper {

	List getList(String name);

	List<None> selById(Integer id);

}
