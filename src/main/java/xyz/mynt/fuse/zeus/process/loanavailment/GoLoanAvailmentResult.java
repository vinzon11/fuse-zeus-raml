package xyz.mynt.fuse.zeus.process.loanavailment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "LoanAvailmentResult")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {
        "loan",
        "errorMessage",
})
public class GoLoanAvailmentResult {

    @XmlElement(name = "loan", required = false)
    private Loan loan;
    @XmlElement(name = "errorMessage", required = false)
    private ErrorMessage errorMessage;

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }

}

@XmlRootElement(name = "Loan")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {
        "id",
        "amount"
})

class Loan {

    @XmlElement(name = "id", required = false)
    private String id;
    @XmlElement(name = "amount", required = false)
    private Double amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}

@XmlRootElement(name = "ErrorDetails")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {
        "code",
        "message"
})
class ErrorMessage {

    @XmlElement(name = "code", required = false)
    private String code;
    @XmlElement(name = "message", required = false)
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
