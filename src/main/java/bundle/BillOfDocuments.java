package bundle;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BillOfDocuments")
public class BillOfDocuments {
    @XmlElementRef
    protected Position position = new Position();
}

