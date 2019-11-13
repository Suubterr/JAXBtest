import bundle.ProObject;
import bundle.ProSAPInfoFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;


public class Main {
    static int k = 0;

    public static void main(String[] args) {
        try {
            xmlToPOJO();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static void getFiles(String f) {
        File file = new File(f);

        File[] files = file.listFiles();

        for(File s : files) {
            if(s.isDirectory()) {
                getFiles(s.getAbsolutePath());
            } else {
                System.out.println("yup");
            }
        }
    }

    private static void xmlToPOJO() throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(ProSAPInfoFile.class);

        Unmarshaller unm = jc.createUnmarshaller();
        File xml = new File("D:\\INNEOxmls\\example-extracted_files_with_xmls riess\\XML\\00\\00\\00000000.xml");
        ProSAPInfoFile psif = (ProSAPInfoFile) unm.unmarshal(xml);
        System.out.println(psif.toString());
    }
}