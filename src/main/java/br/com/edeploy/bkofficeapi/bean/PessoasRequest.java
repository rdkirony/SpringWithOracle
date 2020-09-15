package br.com.edeploy.bkofficeapi.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Pessoas_Request")
public class PessoasRequest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
    private String pessoaId;
    @OneToOne(cascade = {CascadeType.ALL})
    private VisitanteResult visitantes;



    public String getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(String pessoaId) {
        this.pessoaId = pessoaId;
    }



    public VisitanteResult getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(VisitanteResult visitantes) {
        this.visitantes = visitantes;
    }

}
