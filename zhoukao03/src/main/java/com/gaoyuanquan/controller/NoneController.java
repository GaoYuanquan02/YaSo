package com.gaoyuanquan.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gaoyuanquan.bean.None;
import com.gaoyuanquan.service.NoneService;
import com.gaoyuanquan.utils.PageUtils;
import com.gaoyuanquan.utils.StringUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Controller
public class NoneController {
	@Autowired
	private NoneService service;
	@RequestMapping("list.do")
	public String getList(HttpServletRequest request,@RequestParam(defaultValue="1")Integer cpage,@RequestParam(defaultValue="")String name){
		PageHelper.startPage(cpage, 3);
		List list = service.getList(name);
		PageInfo info = new PageInfo<>(list);
		PageUtils utils = new PageUtils(cpage, (int)info.getTotal(), 3, "list.do?name="+name+"", request);
		
		request.setAttribute("list", info.getList());
		request.setAttribute("name", name);
		request.setAttribute("cpage", cpage);
		//测试
		StringUtil st = new StringUtil();
		boolean hasText = st.hasText(name);
		if (hasText) {
			System.out.println("字符串不为空或含有空格字符..............");
			
		}else{
			System.out.println("字符串为空或含有空格字符................");
		}
		
		
		
		return "list";
	}
	@RequestMapping("selById.do")
	@ResponseBody
	public Object selById(Integer id,HttpServletRequest request){
		List<None> list = service.selById(id);
		request.setAttribute("list", list);
		return list;
	}
}
