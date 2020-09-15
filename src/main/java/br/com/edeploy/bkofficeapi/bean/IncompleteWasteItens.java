package br.com.edeploy.bkofficeapi.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Incomplete_Waste_Itens")
public class IncompleteWasteItens {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
