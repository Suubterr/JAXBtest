package bundle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SAP_DOC_STATUS")
@XmlAccessorType(XmlAccessType.FIELD)
public class DocStatus {
    @XmlAttribute(name = "value")
    protected String value;

    public DocStatus() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DocStatus{" +
                "value='" + value + '\'' +
                '}';
    }
}
