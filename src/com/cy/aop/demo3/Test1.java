package com.cy.aop.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试aop功能
 * @author 成圆
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-aop.xml")
public class Test1 {
	
	@Resource(name="customerDao")
	private CustomerDao customerDao;
	
	@Test
	public void run1() {
		customerDao.save();
		customerDao.update();
		
	}
	
}
