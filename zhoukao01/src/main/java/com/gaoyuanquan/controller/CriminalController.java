package com.gaoyuanquan.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.gaoyuanquan.utils.PageUtils;
import com.gaoyuanquan.bean.Criminal;
import com.gaoyuanquan.service.CriminalService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Controller
public class CriminalController {
	@Autowired
	private CriminalService service;
	//列表展示
	@RequestMapping("list")
	public String getList(HttpServletRequest request,String name,@RequestParam(defaultValue="1")Integer cpage){
		if(name==null){
			name="";
		}
		PageHelper.startPage(cpage, 3);
		List list = service.getList(name);
		PageInfo info = new PageInfo(list);
		PageUtils page = new PageUtils(cpage, (int)info.getTotal(), 3, "list?name="+name, request);
		
		request.setAttribute("list", info.getList());
		request.setAttribute("name", name);
		
		if (name!="") {
			return "list1";
		}else{
			return "list";
		}
	}
	
	//添加
	@RequestMapping("addCriminal")
	@ResponseBody
	public boolean addCriminal(Criminal criminal){
		try {
			service.addCriminal(criminal);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
	//修改
	@RequestMapping("updCriminal")
	@ResponseBody
	public boolean updCriminal(Criminal criminal){
		try {
			service.updCriminal(criminal);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
	//删除
	@RequestMapping("del")
	@ResponseBody
	public boolean del(int id){
		try {
			service.del(id);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
	//回显+查看详情
	@RequestMapping("selById")
	@ResponseBody
	public Object selById(int id){
		Criminal criminal = service.selById(id);
		
		return criminal;
	}
}
