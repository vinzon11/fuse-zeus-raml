package xyz.mynt.fuse.zeus.process.loanavailment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "LoanAvailment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanAvailment", propOrder = {
        "client",
        "loan"
})

public class LoanAvailment {

    @XmlElement(name = "client", required = true)
    private ClientAvailmentInfo client;

    @XmlElement(name = "loan", required = true)
    private LoanAvailmentInfo loan;

    public ClientAvailmentInfo getClient() {
        return client;
    }

    public void setClient(ClientAvailmentInfo client) {
        this.client = client;
    }

    public LoanAvailmentInfo getLoan() {
        return loan;
    }

    public void setLoan(LoanAvailmentInfo loan) {
        this.loan = loan;
    }

}

@XmlRootElement(name = "Client")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Client", propOrder = {
        "id",
        "msisdn"
})

class ClientAvailmentInfo {

    @XmlElement(name = "id", required = false)
    private String id;
    @XmlElement(name = "msisdn", required = true)
    private String msisdn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

}

@XmlRootElement(name = "Loan")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Loan", propOrder = {
        "referenceId",
        "disbursementType",
        "amount"
})

class LoanAvailmentInfo {

    @XmlElement(name = "referenceId", required = false)
    private String referenceId;
    @XmlElement(name = "disbursementType", required = true)
    private String disbursementType;
    @XmlElement(name = "amount", required = true)
    private Double amount;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getDisbursementType() {
        return disbursementType;
    }

    public void setDisbursementType(String disbursementType) {
        this.disbursementType = disbursementType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
