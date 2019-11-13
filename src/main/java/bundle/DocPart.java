package bundle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SAP_DOC_PART")
@XmlAccessorType(XmlAccessType.FIELD)
public class DocPart {
    @XmlAttribute(name = "value")
    protected String value;

    public DocPart() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DocPart{" +
                "value='" + value + '\'' +
                '}';
    }
}
