package br.com.edeploy.bkofficeapi.bean;

public class CompleteWasteItens {

	private String completeWasteId;
	private Number value;
	private String user;

	public CompleteWasteItens() {
	}

	public CompleteWasteItens(String completeWasteId, Number value) {
		this.completeWasteId = completeWasteId;

		this.value = value;

	}

	public CompleteWasteItens(String completeWasteId, Number value, String user, String restaurantId) {
		this.completeWasteId = completeWasteId;

		this.value = value;
		this.user = user;

	}

	public String getCompleteWasteId() {
		return completeWasteId;
	}

	public void setCompleteWasteId(String completeWasteId) {
		this.completeWasteId = completeWasteId;
	}

	public Number getValue() {
		return value;
	}

	public void setValue(Number value) {
		this.value = value;
	}


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}
