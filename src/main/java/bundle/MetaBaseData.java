package bundle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MetaBaseData {
    @XmlElementRef(name = "definition")
    protected Definition definition = new Definition();

    public Definition getDefinition() {
        return definition;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    public MetaBaseData() {
    }

    @Override
    public String toString() {
        return "MetaBaseData{" +
                "definition=" + definition +
                '}';
    }
}
