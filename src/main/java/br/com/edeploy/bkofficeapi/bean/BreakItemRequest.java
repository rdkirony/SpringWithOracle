package br.com.edeploy.bkofficeapi.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Break_Item_Request")
public class BreakItemRequest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String skuId;
	@OneToMany(cascade = {CascadeType.ALL})
	private List<PessoasRequest> pessoas = new ArrayList<PessoasRequest>();
	
	public BreakItemRequest() {
		
	}
	
	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public List<PessoasRequest> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<PessoasRequest> pessoas) {
		this.pessoas = pessoas;
	}

}
