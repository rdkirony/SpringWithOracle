package br.com.edeploy.bkofficeapi.bean;


import java.util.ArrayList;
import java.util.Date;
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
@Table(name="Incomplete_Waste")
public class IncompleteWaste {
	@GenericGenerator(name = "userSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "userSequence"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })

	@Id
	@GeneratedValue(generator = "userSequenceGenerator")
	private Long id;
	
	private String idGuid;
	private Date dicDate;
	private String shiftId;
	private String restaurantId;
	private String status;
	@OneToMany(cascade = {CascadeType.ALL})
	private List<Justify> justify = new ArrayList<Justify>();
	@OneToMany(cascade = {CascadeType.ALL})
	private List<IncompleteWasteItens> itens = new ArrayList<IncompleteWasteItens>();



	public Date getDicDate() {
		return dicDate;
	}

	public void setDicDate(Date dicDate) {
		this.dicDate = dicDate;
	}


	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Justify> getJustify() {
		return justify;
	}
	public void setJustify(List<Justify> justify) {
		this.justify = justify;
	}


	public String getShiftId() {
		return shiftId;
	}

	public void setShiftId(String shiftId) {
		this.shiftId = shiftId;
	}

	public List<IncompleteWasteItens> getIncompleteWaste() {
		return itens;
	}

	public void setIncompleteWaste(List<IncompleteWasteItens> incompleteWaste) {
		this.itens = incompleteWaste;
	}



	public String getIdGuid() {
		return idGuid;
	}

}
