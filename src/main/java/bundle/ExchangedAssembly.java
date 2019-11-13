package bundle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SAP_EXCHANGED_ASSEMBLY")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExchangedAssembly {
    @XmlAttribute(name = "value")
    protected String value;

    public ExchangedAssembly() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ExchangedAssembly{" +
                "value='" + value + '\'' +
                '}';
    }
}
