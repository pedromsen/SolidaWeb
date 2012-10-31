package com.solida.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.solida.dao.UserDAO;
import com.solida.dao.model.User;

 
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{
 
	public void save(User user){
		getHibernateTemplate().save(user);
	}
 
	public void update(User user){
		getHibernateTemplate().update(user);
	}
 
	public void delete(User user){
		getHibernateTemplate().delete(user);
	}
 
	public User findByDesUser(String desUser){
		List list = getHibernateTemplate().find(
                      "from User where desUser=?",desUser);
		return (User)list.get(0);
	}
 
}

