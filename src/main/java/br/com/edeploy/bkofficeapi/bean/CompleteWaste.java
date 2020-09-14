/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edeploy.bkofficeapi.bean;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class CompleteWaste{
	
	@Id
	private String id;
	
    private Date dcDate;
    private String shiftId;
    private String restaurantId;
    private String status;
    

    public CompleteWaste() {
    }

    public CompleteWaste(String id, Date dcDate, String shiftId, String restaurantId, String status) {
        this.id = id;
        this.dcDate = dcDate;
        this.shiftId = shiftId;
        this.restaurantId = restaurantId;
        this.status = status;

      
    }

    public CompleteWaste(String id, Date dcDate, String restaurantId) {
        this.id = id;
        this.dcDate = dcDate;
        this.restaurantId = restaurantId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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




}
