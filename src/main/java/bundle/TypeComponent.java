package bundle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SAP_TYPE_COMPONENT")
@XmlAccessorType(XmlAccessType.FIELD)
public class TypeComponent {
    @XmlAttribute(name = "value")
    protected String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TypeComponent() {
    }

    @Override
    public String toString() {
        return "TypeComponent{" +
                "value='" + value + '\'' +
                '}';
    }
}
