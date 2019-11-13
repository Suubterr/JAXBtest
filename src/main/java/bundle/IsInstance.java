package bundle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SAP_IS_INSTANCE")
@XmlAccessorType(XmlAccessType.FIELD)
public class IsInstance {
    @XmlAttribute(name = "value")
    protected String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public IsInstance() {
    }

    @Override
    public String toString() {
        return "IsInstance{" +
                "value='" + value + '\'' +
                '}';
    }
}
