package br.com.edeploy.bkofficeapi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class TransactionStatus {
	
	@GenericGenerator(name = "userSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "userSequence"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })

	@Id
	@GeneratedValue(generator = "userSequenceGenerator")
	private Long id;
	
	private boolean permission = Constant.TRUE;
    private boolean sessions = Constant.TRUE;
    private boolean status = Constant.FALSE;
    private String description = "";

    public boolean isSession() {
        return sessions;
    }

    public void setSession(boolean session) {
        this.sessions = session;
    }

    public boolean isPermission() {
        return permission;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }

    public TransactionStatus(boolean status, String description) {
        this.description = description;
        this.status = status;
    }

    public TransactionStatus(boolean status, boolean permission, String description) {
        this.description = description;
        this.status = status;
        this.permission = permission;
    }

    public TransactionStatus() {
    }

    public TransactionStatus(boolean status) {
        this.status = status;
    }

    public TransactionStatus(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
