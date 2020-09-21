package br.com.edeploy.bkofficeapi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Restaurant {
	@GenericGenerator(name = "userSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "userSequence"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })

	@Id
	@GeneratedValue(generator = "userSequenceGenerator")
	private Long id;
	
	private String restaurantId;
	private String restaurantOrigin;
	
	public String getRestaurantId() {
		return restaurantId;
	}

	public String getRestaurantOrigin() {
		return restaurantOrigin;
	}

	public void setRestaurantOrigin(String restaurantOrigin) {
		this.restaurantOrigin = restaurantOrigin;
	}
}
