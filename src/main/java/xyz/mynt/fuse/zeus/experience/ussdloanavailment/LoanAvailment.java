package xyz.mynt.fuse.zeus.experience.ussdloanavailment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "LoanAvailment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanAvailment", propOrder = {
        "availmentInfo"
})
public class LoanAvailment {

    private AvailmentInfo availmentInfo;

    public AvailmentInfo getAvailmentInfo() {
        return availmentInfo;
    }

    public void setAvailmentInfo(AvailmentInfo availmentInfo) {
        this.availmentInfo = availmentInfo;
    }
}

@XmlRootElement(name = "AvailmentInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailmentInfo", propOrder = {
        "productCode",
        "amount",
        "disbursementType",
        "initiatorMobtel",
        "initiatorMPin"
})
class AvailmentInfo {

    @XmlElement(name = "productCode", required = true)
    private String productCode;
    @XmlElement(name = "amount", required = true, type = Double.class)
    private Double amount;
    @XmlElement(name = "disbursementType", required = true)
    private String disbursementType;
    @XmlElement(name = "initiatorMobtel", required = true)
    private String initiatorMobtel;
    @XmlElement(name = "initiatorMPin", required = true)
    private String initiatorMPin;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDisbursementType() {
        return disbursementType;
    }

    public void setDisbursementType(String disbursementType) {
        this.disbursementType = disbursementType;
    }

    public String getInitiatorMobtel() {
        return initiatorMobtel;
    }

    public void setInitiatorMobtel(String initiatorMobtel) {
        this.initiatorMobtel = initiatorMobtel;
    }

    public String getInitiatorMPin() {
        return initiatorMPin;
    }

    public void setInitiatorMPin(String initiatorMPin) {
        this.initiatorMPin = initiatorMPin;
    }

}
