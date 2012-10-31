package com.solida.dao.model;


import java.io.Serializable;
import java.util.Date;
 
public class User implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private Long codUser;
	private String desUser;
	private String desPassword;
	private Date fecCreacion;
	private Date fecUltimoAcceso;
	private boolean flgActive;
	private Role role;
	
	
	public Long getCodUser() {
		return codUser;
	}
	public void setCodUser(Long codUser) {
		this.codUser = codUser;
	}
	public String getDesUser() {
		return desUser;
	}
	public void setDesUser(String desUser) {
		this.desUser = desUser;
	}
	public String getDesPassword() {
		return desPassword;
	}
	public void setDesPassword(String desPassword) {
		this.desPassword = desPassword;
	}
	public Date getFecCreacion() {
		return fecCreacion;
	}
	public void setFecCreacion(Date fecCreacion) {
		this.fecCreacion = fecCreacion;
	}
	public Date getFecUltimoAcceso() {
		return fecUltimoAcceso;
	}
	public void setFecUltimoAcceso(Date fecUltimoAcceso) {
		this.fecUltimoAcceso = fecUltimoAcceso;
	}
	public boolean isFlgActive() {
		return flgActive;
	}
	public void setFlgActive(boolean flgActive) {
		this.flgActive = flgActive;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
 
	
}