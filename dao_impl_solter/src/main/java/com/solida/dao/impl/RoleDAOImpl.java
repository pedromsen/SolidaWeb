package com.solida.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.solida.dao.RoleDAO;
import com.solida.dao.model.impl.RoleImpl;
import com.solida.model.Role;


 
public class RoleDAOImpl extends HibernateDaoSupport implements RoleDAO{
 
	
	public RoleDAOImpl() {
		// TODO Auto-generated constructor stub Prueba
	}
	public void save(Role role){
		getHibernateTemplate().save(role);
	}
	
	public void update(Role role){
		getHibernateTemplate().update(role);
	}
 
	public void delete(Role role){
		getHibernateTemplate().delete(role);
	}
 
	public Role findByDesRole(String desRole){
		List list = getHibernateTemplate().find(
                      "from Role where desRole=?",desRole);
		return (RoleImpl)list.get(0);
	}
 
}

