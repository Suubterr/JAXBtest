package bundle;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ProSAPInfoFile")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProSAPInfoFile {
    @XmlAttribute(name = "version")
    protected String version;

    @XmlElementRef(name = "ProObject")
    protected ProObject proObject = new ProObject();

    public ProSAPInfoFile() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ProObject getProObject() {
        return proObject;
    }

    public void setProObject(ProObject proObject) {
        this.proObject = proObject;
    }

    @Override
    public String toString() {
        return "ProSAPInfoFile{" +
                "version='" + version + '\'' +
                ", proObject=" + proObject.toString() +
                '}';
    }
}
