package xyz.mynt.fuse.zeus.experience.ussdloanavailment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "UssdAck")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {
        "code",
        "message"
})
public class UssdAck {

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
