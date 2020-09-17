/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Table(name="Complete_Waste")
public class CompleteWaste {

	@GenericGenerator(name = "userSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "userSequence"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })

	@Id
	@GeneratedValue(generator = "userSequenceGenerator")
	private Long id;
	

	private String idGuid;
    private Date dcDate;
    private String shiftId;
    private String restaurantId;
    private String status;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Justify> justify = new ArrayList<Justify>();
    @OneToMany(cascade = {CascadeType.ALL})
    private List<CompleteWasteItens> itens = new ArrayList<CompleteWasteItens>();


    public CompleteWaste() {
    }

    public CompleteWaste(String idGuid, Date dcDate, String shiftId, String restaurantId, String status, List<Justify> justify) {
        this.idGuid = idGuid;
        this.dcDate = dcDate;
        this.shiftId = shiftId;
        this.restaurantId = restaurantId;
        this.status = status;
        this.justify = justify;
    }


    public String getIdGuid() {
		return idGuid;
	}
    
    public void setIdGuid(String idGuid) {
		this.idGuid = idGuid;
	}
    public Date getDcDate() {
        return dcDate;
    }

    public void setDcDate(Date dcDate) {
        this.dcDate = dcDate;
    }

	public String getShiftId() {
		return shiftId;
	}
	public void setShiftId(String shiftId) {
		this.shiftId = shiftId;
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
    
    public List<CompleteWasteItens> getItens() {
        return itens;
    }

    public void setItens(List<CompleteWasteItens> itens) {
        this.itens = itens;
    }






	


}
