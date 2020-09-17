package br.com.edeploy.bkofficeapi.ws.bean;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.com.edeploy.bkofficeapi.bean.Score;
import br.com.edeploy.bkofficeapi.bean.TransactionStatus;

@Entity
public class ScoreResponse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String idGuid;
	@OneToMany(cascade = {CascadeType.ALL})
	private List<Score> score;
	@OneToOne(cascade = {CascadeType.ALL})
    private Score sc;
	@OneToOne(cascade = {CascadeType.ALL})
    private TransactionStatus transactionStatus;
	
    private Boolean checkDate;

    public ScoreResponse() {
    
    }

    public ScoreResponse(List<Score> score, TransactionStatus transactionStatus) {
        this.score = score;
        this.transactionStatus = transactionStatus;
    }

    public Boolean getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Boolean checkDate) {
        this.checkDate = checkDate;
    }

    public List<Score> getScore() {
        return score;
    }

    public void setScore(List<Score> score) {
        this.score = score;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Score getSc() {
        return sc;
    }

    public void setSc(Score sc) {
        this.sc = sc;
    }

	public String getIdGuid() {
		return idGuid;
	}


}
