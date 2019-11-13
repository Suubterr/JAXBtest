package bundle;

import bundle.*;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "bundle.ProObject")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProObject {

    @XmlAttribute(name = "name")
    protected String name;

    @XmlAttribute(name = "path")
    protected String path;

    @XmlElementRef(name = "SAP_DOC_NUMBER")
    protected DocNumber SAP_DOC_NUMBER = new DocNumber();

    @XmlElementRef(name = "SAP_DOC_TYPE")
    protected DocType SAP_DOC_TYPE = new DocType();

    @XmlElementRef(name = "SAP_DOC_PART")
    protected DocPart SAP_DOC_PART = new DocPart();

    @XmlElementRef(name = "SAP_DOC_VERSION")
    protected DocVersion SAP_DOC_VERSION = new DocVersion();

    @XmlElementRef(name = "SAP_DOC_STATUS")
    protected DocStatus SAP_DOC_STATUS = new DocStatus();

    @XmlElementRef(name = "SAP_TYPE_COMPONENT")
    protected TypeComponent SAP_TYPE_COMPONENT = new TypeComponent();

    @XmlElementRef(name = "SAP_IS_INSTANCE")
    protected IsInstance SAP_IS_INSTANCE = new IsInstance();

    @XmlElementRef(name = "SAP_IS_GENERIC")
    protected IsGeneric SAP_IS_GENERIC = new IsGeneric();

    @XmlElementRef(name = "SAP_NORM")
    protected Norm SAP_NORM = new Norm();

    @XmlElementRef(name = "SAP_MODIFIED_FLAG")
    protected ModifiedFlag SAP_MODIFIED_FLAG = new ModifiedFlag();

    @XmlElementRef(name = "SAP_POOL_MODEL")
    protected PoolModel SAP_POOL_MODEL = new PoolModel();

    @XmlElementRef(name = "SAP_EXCHANGED_ASSEMBLY")
    protected ExchangedAssembly SAP_EXCHANGED_ASSEMBLY = new ExchangedAssembly();

    @XmlElementRef(name = "SAP_CAD_DATE")
    protected CadDate SAP_CAD_DATE = new CadDate();

    @XmlElementRef(name = "SAP_WSAPPLICATION")
    protected Wsapplication SAP_WSAPPLICATION = new Wsapplication();

    @XmlElementRef(name = "ECTR_DTYPE")
    protected EctrDtype ECTR_DTYPE = new EctrDtype();

    @XmlElementRef(name = "SAP_STORAGECATEGORY")
    protected Storagecategory SAP_STORAGECATEGORY = new Storagecategory();

    @XmlElementRef(name = "BillOfDocuments")
    protected BillOfDocuments BillOfDocuments = new BillOfDocuments();

    @XmlElementRef(name = "MetaBaseData")
    protected MetaBaseData MetaBaseData = new MetaBaseData();

    public ProObject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "ProObject{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", SAP_DOC_NUMBER=" + SAP_DOC_NUMBER +
                ", SAP_DOC_TYPE=" + SAP_DOC_TYPE +
                ", SAP_DOC_PART=" + SAP_DOC_PART +
                ", SAP_DOC_VERSION=" + SAP_DOC_VERSION +
                ", SAP_DOC_STATUS=" + SAP_DOC_STATUS +
                ", SAP_TYPE_COMPONENT=" + SAP_TYPE_COMPONENT +
                ", SAP_IS_INSTANCE=" + SAP_IS_INSTANCE +
                ", SAP_IS_GENERIC=" + SAP_IS_GENERIC +
                ", SAP_NORM=" + SAP_NORM +
                ", SAP_MODIFIED_FLAG=" + SAP_MODIFIED_FLAG +
                ", SAP_POOL_MODEL=" + SAP_POOL_MODEL +
                ", SAP_EXCHANGED_ASSEMBLY=" + SAP_EXCHANGED_ASSEMBLY +
                ", SAP_CAD_DATE=" + SAP_CAD_DATE +
                ", SAP_WSAPPLICATION=" + SAP_WSAPPLICATION +
                ", ECTR_DTYPE=" + ECTR_DTYPE +
                ", SAP_STORAGECATEGORY=" + SAP_STORAGECATEGORY +
                ", BillOfDocuments=" + BillOfDocuments +
                ", MetaBaseData=" + MetaBaseData +
                '}';
    }
}
