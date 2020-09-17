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
@Table(name="Break_Request")
public class BreakRequest {
	
	@GenericGenerator(name = "userSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "userSequence"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })

	@Id
	@GeneratedValue(generator = "userSequenceGenerator")
	private Long id;
	
	
	private String idGuid;
	private String breakPolicyId;
	private String restaurantId;
	private Date referenceDate;
	private String shiftId;
	@OneToMany(cascade = {CascadeType.ALL})
    private List<Justify> justify = new ArrayList<Justify>();
	@OneToMany(cascade = {CascadeType.ALL})
	private List<BreakItemRequest> breakItens;



	public List<Justify> getJustify() {
		return justify;
	}

	public void setJustify(List<Justify> justify) {
		this.justify = justify;
	}

	public String getBreakPolicyId() {
		return breakPolicyId;
	}

	public void setBreakPolicyId(String breakPolicyId) {
		this.breakPolicyId = breakPolicyId;
	}


	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Date getReferenceDate() {
		return referenceDate;
	}

	public void setReferenceDate(Date referenceDate) {
		this.referenceDate = referenceDate;
	}



	public String getShiftId() {
		return shiftId;
	}

	public void setShiftId(String shiftId) {
		this.shiftId = shiftId;
	}

	public List<BreakItemRequest> getBreakItens() {
		return breakItens;
	}

	public void setBreakItens(List<BreakItemRequest> breakItens) {
		this.breakItens = breakItens;
	}


	public String getIdGuid() {
		return idGuid;
	}

	public void setIdGuid(String id) {
		this.idGuid = id;
	}

}
