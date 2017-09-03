package com.cy.aop;

import org.junit.Test;

public class Demo1 {
	
	@Test
	public void run1() {
		//目标对象
		UserDao dao = new UserDaoImpl();
		dao.save();
		dao.update();
		System.out.println("======================");
		//使用工具类，获取代理对象
		UserDao proxy = MyProxyUtils.getProxy(dao);
		proxy.save();
		proxy.update();
	}
}
