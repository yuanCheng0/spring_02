package com.cy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cy.demo1.UserService;
import com.cy.demo1.UserServiceImpl;

public class Demo1Test {

	/**
	 * 原来的方式
	 */
	@Test
	public void run1() {
		UserService us = new UserServiceImpl();
		us.sayHello();
	}
	
	/**
	 * 注解的方式
	 */
	@Test
	public void run2() {
		//获取工厂，加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		UserService us = (UserService) ac.getBean("userService");
		us.sayHello();
	}
}
