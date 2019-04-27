package com.gaoyuanquan.test;

import java.awt.Component;
import java.util.List;

import javax.swing.Spring;

import org.junit.Test;

import com.gaoyuanquan.service.NoneServiceImpl;

public class Test01 {
	@Test
	public void getList(){
		NoneServiceImpl service = new NoneServiceImpl();
		
		List list = service.getList("李四");
		Spring.width((Component) list);
	}
}