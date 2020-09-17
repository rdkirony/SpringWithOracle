package br.com.edeploy.bkofficeapi.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="Incomplete_Waste_Itens")
public class IncompleteWasteItens {
	
	@GenericGenerator(name = "userSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "userSequence"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })

	@Id
	@GeneratedValue(generator = "userSequenceGenerator")
	private Long id;
	
	private String ingredientId;
	private int value;
	private String motiveId;
	private String restaurantId;
	private String idGuid;
	
	public String getIdGuid() {
		return idGuid;
	}


	public String getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(String ingredientId) {
		this.ingredientId = ingredientId;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getMotiveId() {
		return motiveId;
	}

	public void setMotiveId(String motiveId) {
		this.motiveId = motiveId;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public void getIncompleteWasteId(String string) {
		throw new UnsupportedOperationException("Not supported yet."); 
	}


}
