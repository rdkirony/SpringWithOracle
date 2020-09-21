package br.com.edeploy.bkofficeapi.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class TransferStore {
	@GenericGenerator(name = "userSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "userSequence"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })

	@Id
	@GeneratedValue(generator = "userSequenceGenerator")
	private Long id;

	private String senderId;
	private String emissionDate;
	private String idGuid;

	private String senderName;
	private String receiverId;
	private String receiverName;
	private String invoice;
	private String invoiceReference;
	private String serie;
	private String receiveDate;
	private String terminalDate;
	private String creationDate;
	private String status;
	private String realReceiveDate;
	private String justify;
	private String devolutionControl;
	private String username;
	private String receiptUser;
	private String sapMessage;
	private String invoiceAccessCode;
	private String diference;
	private String return_id;
	private String page;
	private boolean permissionApprobation;
	@OneToMany(cascade = {CascadeType.ALL})
	private List<IngredientTransfer> ingredientTransfer;

	public boolean isPermissionApprobation() {
		return permissionApprobation;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public void setPermissionApprobation(boolean permissionApprobation) {
		this.permissionApprobation = permissionApprobation;
	}

	public TransferStore() {
	}

	public String getReturn_id() {
		return return_id;
	}

	public void setReturn_id(String return_id) {
		this.return_id = return_id;
	}

	public String getIdGuid() {
		return idGuid;
	}

	public void setIdGuid(String idGuid) {
		this.idGuid = idGuid;
	}

	public String getSenderId() {
		return senderId;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getInvoiceReference() {
		return invoiceReference;
	}

	public void setInvoiceReference(String invoiceReference) {
		this.invoiceReference = invoiceReference;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(String receiveDate) {
		this.receiveDate = receiveDate;
	}

	public String getEmissionDate() {
		return emissionDate;
	}

	public void setEmissionDate(String emissionDate) {
		this.emissionDate = emissionDate;
	}

	public String getTerminalDate() {
		return terminalDate;
	}

	public void setTerminalDate(String terminalDate) {
		this.terminalDate = terminalDate;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRealReceiveDate() {
		return realReceiveDate;
	}

	public void setRealReceiveDate(String realReceiveDate) {
		this.realReceiveDate = realReceiveDate;
	}

	public String getJustify() {
		return justify;
	}

	public void setJustify(String justify) {
		this.justify = justify;
	}

	public String getDevolutionControl() {
		return devolutionControl;
	}

	public void setDevolutionControl(String devolutionControl) {
		this.devolutionControl = devolutionControl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getReceiptUser() {
		return receiptUser;
	}

	public void setReceiptUser(String receiptuser) {
		this.receiptUser = receiptuser;
	}

	public String getSapMessage() {
		return sapMessage;
	}

	public void setSapMessage(String sapMessage) {
		this.sapMessage = sapMessage;
	}

	public String getInvoiceAccessCode() {
		return invoiceAccessCode;
	}

	public void setInvoiceAccessCode(String invoiceAccessCode) {
		this.invoiceAccessCode = invoiceAccessCode;
	}

	public String getDiference() {
		return diference;
	}

	public void setDiference(String diference) {
		this.diference = diference;
	}

	public List<IngredientTransfer> getIngredientTransfer() {
		return ingredientTransfer;
	}

	public void setIngredientTransfer(List<IngredientTransfer> ingredientTransfer) {
		this.ingredientTransfer = ingredientTransfer;
	}

}
