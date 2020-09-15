package br.com.edeploy.bkofficeapi.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Complete_Waste_Itens")
public class CompleteWasteItens {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
