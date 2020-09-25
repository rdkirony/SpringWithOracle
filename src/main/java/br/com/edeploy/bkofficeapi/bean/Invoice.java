package br.com.edeploy.bkofficeapi.bean;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlElement;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
public class Invoice {
	
	@GenericGenerator(name = "userSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "userSequence"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })

	@Id
	@GeneratedValue(generator = "userSequenceGenerator")
	private Long id;
	
	private String idGuid;
	private Date emissionDate;
	@OneToOne(cascade = {CascadeType.ALL})
	private Restaurant restaurant;
	@OneToMany(cascade = {CascadeType.ALL})
	private List<Justify> justify;
	@OneToMany(cascade = {CascadeType.ALL})
	private List<InvoiceIngredientResult> ingredients;
	private String accessCode;
	@OneToOne(cascade = {CascadeType.ALL})
	private Restaurant restaurantOrigin;
	private String userLogin;
	@OneToOne(cascade = {CascadeType.ALL})
	private Provider provider;
	private String invoiceNumber;
	private String invoiceSerie;
	private String invoiceStatus;
	private String invoiceStatusScore;
	private Double total = 0d;
	private Date receiptDate;
	private String conductEquip;
	private String statusMessage;
	private boolean recusa;
	private String qualityPackage;
	private String temperature;
	private String timeDelivery;
	private String typeReturn;
	private String validityTime;
	private String type;
	private String deliveryControl;
	private Double productTotal = 0d;
	private Double shipTotal = 0d;
	private Double discountTotal = 0d;
	private String leadTime;
	
	
	public boolean isRecusa() {
		return recusa;
	}

	public void setRecusa(boolean recusa) {
		this.recusa = recusa;
	}

	public String getLeadTime() {
		return leadTime;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public void setLeadTime(String leadTime) {
		this.leadTime = leadTime;
	}

	public Invoice() {
	}

	public Double getProductTotal() {
		return productTotal;
	}

	public void setProductTotal(Double productTotal) {
		this.productTotal = productTotal;
	}

	public Double getShipTotal() {
		return shipTotal;
	}

	public void setShipTotal(Double shipTotal) {
		this.shipTotal = shipTotal;
	}

	public Double getDiscountTotal() {
		return discountTotal;
	}

	public void setDiscountTotal(Double discountTotal) {
		this.discountTotal = discountTotal;
	}

	public Invoice(String accessCode, Restaurant restaurant) {
		this.accessCode = accessCode;
		this.restaurant = restaurant;
	}

	public Invoice(String accessCode) {
		this.accessCode = accessCode;
	}

	public String getAccessCode() {
		return accessCode;
	}

	@XmlElement
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	public String getTypeReturn() {
		return typeReturn;
	}

	@XmlElement
	public void setTypeReturn(String typeReturn) {
		this.typeReturn = typeReturn;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	@XmlElement
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Restaurant getRestaurantOrigin() {
		return restaurantOrigin;
	}

	@XmlElement
	public void setRestaurantOrigin(Restaurant restaurantOrigin) {
		this.restaurantOrigin = restaurantOrigin;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public Provider getProvider() {
		return provider;
	}

	@XmlElement
	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	@XmlElement
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getInvoiceSerie() {
		return invoiceSerie;
	}

	@XmlElement
	public void setInvoiceSerie(String invoiceSerie) {
		this.invoiceSerie = invoiceSerie;
	}

	public String getInvoiceStatus() {
		return invoiceStatus;
	}

	@XmlElement
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getInvoiceStatusScore() {
		return invoiceStatusScore;
	}

	@XmlElement
	public void setInvoiceStatusScore(String invoiceStatusScore) {
		this.invoiceStatusScore = invoiceStatusScore;
	}

	public Date getEmissionDate() {
		return emissionDate;
	}

	@XmlElement
	public void setEmissionDate(Date emissionDate) {
		this.emissionDate = emissionDate;
	}

	public Double getTotal() {
		return total;
	}

	@XmlElement
	public void setTotal(Double total) {
		this.total = total;
	}

	public Date getReceiptDate() {
		return receiptDate;
	}

	@XmlElement
	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	public String getConductEquip() {
		return conductEquip;
	}

	@XmlElement
	public void setConductEquip(String conductEquip) {
		this.conductEquip = conductEquip;
	}

	public List<Justify> getJustify() {
		return justify;
	}

	public void setJustify(List<Justify> justify) {
		this.justify = justify;
	}

	public String getQualityPackage() {
		return qualityPackage;
	}

	@XmlElement
	public void setQualityPackage(String qualityPackage) {
		this.qualityPackage = qualityPackage;
	}

	public String getTemperature() {
		return temperature;
	}

	@XmlElement
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getTimeDelivery() {
		return timeDelivery;
	}

	@XmlElement
	public void setTimeDelivery(String timeDelivery) {
		this.timeDelivery = timeDelivery;
	}

	public String getValidityTime() {
		return validityTime;
	}

	@XmlElement
	public void setValidityTime(String validityTime) {
		this.validityTime = validityTime;
	}

	public List<InvoiceIngredientResult> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<InvoiceIngredientResult> ingredients) {
		this.ingredients = ingredients;
	}

	public String getType() {
		return type;
	}

	@XmlElement
	public void setType(String type) {
		this.type = type;
	}

	public String getDeliveryControl() {
		return deliveryControl;
	}

	public void setDeliveryControl(String deliveryControl) {
		this.deliveryControl = deliveryControl;
	}

	public String getIdGuid() {
		return idGuid;
	}

	public void setIdGuid(String id) {
		this.idGuid = id;
	}

}
