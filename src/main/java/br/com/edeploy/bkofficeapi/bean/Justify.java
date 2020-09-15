package br.com.edeploy.bkofficeapi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Justify")
public class Justify {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	private String sos;
	private String usuario;
	public String getSos() {
		return sos;
	}
	public void setSos(String sos) {
		this.sos = sos;
	}
	public String getUser() {
		return usuario;
	}
	public void setUser(String usuario) {
		this.usuario = usuario;
	}
	
}
