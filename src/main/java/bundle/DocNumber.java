package bundle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SAP_DOC_NUMBER")
@XmlAccessorType(XmlAccessType.FIELD)
public class DocNumber {
    @XmlAttribute(name = "value")
    protected String value;

    public DocNumber() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
