package bundle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ECTR_DTYPE")
@XmlAccessorType(XmlAccessType.FIELD)
public class EctrDtype {
    @XmlAttribute(name = "value")
    protected String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public EctrDtype() {
    }

    @Override
    public String toString() {
        return "EctrDtype{" +
                "value='" + value + '\'' +
                '}';
    }
}
