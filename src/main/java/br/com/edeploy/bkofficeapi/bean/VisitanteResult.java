package br.com.edeploy.bkofficeapi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Visitante_Result")
public class VisitanteResult {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String visitanteId;
	private String visitante;
	private String motivo;

	public String getVisitanteId() {
		return visitanteId;
	}

	public void setVisitanteId(String visitanteId) {
		this.visitanteId = visitanteId;
	}

	public String getVisitante() {
		return visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
}
