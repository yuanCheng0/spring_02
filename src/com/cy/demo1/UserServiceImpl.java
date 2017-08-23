package com.cy.demo1;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 组件注解，标记类
 * 相当于<bean id="userService" class="com.cy.demo1.UserServiceImpl">
 * @author 成圆
 *
 */
@Component(value="userService")
//@Scope(value="prototype")//多例
public class UserServiceImpl implements UserService {

	//给name属性注入美美的字符串，setName方法还可以省略不写
	@Value(value="美美")
	private String name;
	
	/*public void setName(String name) {
		this.name = name;
	}*/

	//@Autowired 按类型自动装配
	@Autowired
	@Qualifier(value="ud") //按名称注入
	//private UserDao userDao;
	
	@Resource(name="ud") //是java的注解，spring框架支持该注解
	private UserDao userDao;
	
	@Override
	public void sayHello() {
		System.out.println("hello spring。。。");
		userDao.save();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("初始化");
	}
}
