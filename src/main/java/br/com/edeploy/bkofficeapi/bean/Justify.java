package br.com.edeploy.bkofficeapi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="Justify")
public class Justify {
	
	@GenericGenerator(name = "userSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "userSequence"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })

	@Id
	@GeneratedValue(generator = "userSequenceGenerator")
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
