package com.cy.aop.cglib;

/**
 * 实现类
 * @author 成圆
 *
 */
public class BookDaoImpl {
	
	public void save() {
		System.out.println("保存图书。。。");
	}
	
	public void update() {
		System.out.println("修改图书。。。");
	}
}
