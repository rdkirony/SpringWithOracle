package br.com.edeploy.bkofficeapi.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
@Table(name="Complete_Waste_Itens")
public class CompleteWasteItens {
	
	@GenericGenerator(name = "userSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "userSequence"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })

	@Id
	@GeneratedValue(generator = "userSequenceGenerator")
	private Long id;
	
	private String idGuid;
	private int valor;
	private String usuario;
	


	public CompleteWasteItens(String idGuid, int valor, String usuario, String restaurantId) {
		this.idGuid = idGuid;
		this.valor = valor;
		this.usuario = usuario;

	}
	public String getIdGuid() {
		return idGuid;
	}
	public void setIdGuid(String idGuid) {
		this.idGuid = idGuid;
	}
	

	public Number getValue() {
		return valor;
	}

	public void setValue(int valor) {
		this.valor = valor;
	}


	public String getUser() {
		return usuario;
	}

	public void setUser(String usuario) {
		this.usuario = usuario;
	}
}
