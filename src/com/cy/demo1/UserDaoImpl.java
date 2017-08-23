package com.cy.demo1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * UserDaoImpl交给IOC的容器
 * @author 成圆
 *
 */
//@Component(value="userDao")
@Repository(value="ud")
public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		System.out.println("保存客户。。。");

	}
}
