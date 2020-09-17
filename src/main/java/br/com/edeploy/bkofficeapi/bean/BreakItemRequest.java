package br.com.edeploy.bkofficeapi.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "Break_Item_Request")
public class BreakItemRequest {

	@GenericGenerator(name = "userSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "userSequence"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })

	@Id
	@GeneratedValue(generator = "userSequenceGenerator")
	private Long id;

	private String skuId;
	@OneToMany(cascade = { CascadeType.ALL })
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
