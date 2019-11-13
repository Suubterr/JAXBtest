package bundle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SAP_STORAGECATEGORY")
@XmlAccessorType(XmlAccessType.FIELD)
public class Storagecategory {
    @XmlAttribute(name = "value")
    protected String value;

    public Storagecategory() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Storagecategory{" +
                "value='" + value + '\'' +
                '}';
    }
}
