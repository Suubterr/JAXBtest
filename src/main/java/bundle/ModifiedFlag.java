package bundle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SAP_MODIFIED_FLAG")
@XmlAccessorType(XmlAccessType.FIELD)
public class ModifiedFlag {
    @XmlAttribute(name = "value")
    protected String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ModifiedFlag() {
    }

    @Override
    public String toString() {
        return "ModifiedFlag{" +
                "value='" + value + '\'' +
                '}';
    }
}
