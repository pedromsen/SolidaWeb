		package com.solida.dao.model.impl;


import com.solida.model.Role;
 
public class RoleImpl implements Role {
 
	private static final long serialVersionUID = 1L;
 
	private Long codRole;
	private String desRole;
	private String desDescripcion;
	
	
	public Long getCodRole() {
		return codRole;
	}
	public void setCodRole(Long codRole) {
		this.codRole = codRole;
	}
	public String getDesRole() {
		return desRole;
	}
	public void setDesRole(String desRole) {
		this.desRole = desRole;
	}
	public String getDesDescripcion() {
		return desDescripcion;
	}
	public void setDesDescripcion(String desDescripcion) {
		this.desDescripcion = desDescripcion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
 
	
}