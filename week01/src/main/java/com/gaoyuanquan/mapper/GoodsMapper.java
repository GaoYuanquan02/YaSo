package com.gaoyuanquan.mapper;

import java.util.List;

import com.gaoyuanquan.bean.Brand;
import com.gaoyuanquan.bean.Goods;
import com.gaoyuanquan.bean.Goodskind;

public interface GoodsMapper {
	//列表
	List getList(String gname);
	//查询品牌
	List<Brand> getBrand();
	//查询种类
	List<Goodskind> getKind();
	//添加
	void add(Goods goods);
	//通过id查看回显
	Goods selById(Integer gid);
	//修改
	void upd(Goods goods);
	//删除
	void delAll(String ids);

}
