package bundle;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BillOfDocuments")
public class BillOfDocuments {
    @XmlElementRef
    protected Position position = new Position();

    @Override
    public String toString() {
        return "BillOfDocuments{" +
                "position=" + position +
                '}';
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public BillOfDocuments() {
    }
}

