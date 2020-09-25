package br.com.edeploy.bkofficeapi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
public class InvoiceIngredientResult {
	
	@GenericGenerator(name = "userSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "userSequence"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })

	@Id
	@GeneratedValue(generator = "userSequenceGenerator")
	private Long id;
	
	private String ingredientId;
	private String ingredientDescription;
	private String quantityCashier;
	private String quantityReceived;
	private String quantityReturn;
	private String quantityProblem;
	private String unitId;
	private String conversion;
	private Double priceUnit;
	private String accessCode;
	private String record;
	private Double priceTotal;
	private String status;
	private String accessCodeReturn;
	private String statusMessage;

	private String recordUnitId;
	private String materialId;
	private String invoiceIngredientRowId;

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getAccessCodeReturn() {
		return accessCodeReturn;
	}

	public void setAccessCodeReturn(String accessCodeReturn) {
		this.accessCodeReturn = accessCodeReturn;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public String getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	public String getIngredientId() {
		return ingredientId;
	}

	public String getQuantityReturn() {
		return quantityReturn;
	}

	public void setQuantityReturn(String quantityReturn) {
		this.quantityReturn = quantityReturn;
	}

	public String getQuantityProblem() {
		return quantityProblem;
	}

	public void setQuantityProblem(String quantityProblem) {
		this.quantityProblem = quantityProblem;
	}

	public String getConversion() {
		return conversion;
	}

	public void setConversion(String conversion) {
		this.conversion = conversion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public void setIngredientId(String ingredientId) {
		this.ingredientId = ingredientId;
	}

	public String getIngredientDescription() {
		return ingredientDescription;
	}

	public void setIngredientDescription(String ingredientDescription) {
		this.ingredientDescription = ingredientDescription;
	}

	public String getQuantityCashier() {
		return quantityCashier;
	}

	public void setQuantityCashier(String quantityCashier) {
		this.quantityCashier = quantityCashier;
	}

	public String getQuantityReceived() {
		return quantityReceived;
	}

	public void setQuantityReceived(String quantityReceived) {
		this.quantityReceived = quantityReceived;
	}

	public Double getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(Double priceUnit) {
		this.priceUnit = priceUnit;
	}

	public Double getPriceTotal() {
		return priceTotal;
	}

	public void setPriceTotal(Double priceTotal) {
		this.priceTotal = priceTotal;
	}

	public InvoiceIngredientResult(String ingredientId, String ingredientDescription, String quantityCashier,
			String quantityReceived, Double priceUnit, String status, String unitId, String conversion,
			String quantityReturn) {
		super();
		this.ingredientId = ingredientId;
		this.ingredientDescription = ingredientDescription;
		this.quantityCashier = quantityCashier;
		this.quantityReceived = quantityReceived;
		this.priceUnit = priceUnit;
		this.status = status;
		this.quantityReturn = quantityReturn;
		this.unitId = unitId;
		this.conversion = conversion;
	}

	public InvoiceIngredientResult(String ingredientId, String ingredientDescription, String quantityCashier,
			String quantityReceived, Double priceUnit, String quantityReturn) {
		super();
		this.ingredientId = ingredientId;
		this.ingredientDescription = ingredientDescription;
		this.quantityCashier = quantityCashier;
		this.quantityReceived = quantityReceived;
		this.priceUnit = priceUnit;
		this.quantityReturn = quantityReturn;
	}

	public InvoiceIngredientResult() {
	}

	public String getRecordUnitId() {
		return recordUnitId;
	}

	public void setRecordUnitId(String recordUnitId) {
		this.recordUnitId = recordUnitId;
	}

	public String getMaterialId() {
		return materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getInvoiceIngredientRowId() {
		return invoiceIngredientRowId;
	}

	public void setInvoiceIngredientRowId(String invoiceIngredientRowId) {
		this.invoiceIngredientRowId = invoiceIngredientRowId;
	}
}
