import java.io.File;
import java.util.List;


public class Main {
    static int k = 0;

    public static void main(String[] args) {
        getFiles("D:\\INNEOxmls\\example-extracted_files_with_xmls riess\\XML");
        System.out.println(k);
    }

    private static void getFiles(String f) {
        File file = new File(f);

        File[] files = file.listFiles();

        for(File s : files) {
            if(s.isDirectory()) {
                getFiles(s.getAbsolutePath());
            } else {
                xmlToPOJO(s);
            }
        }
    }

    private static void xmlToPOJO(File file) {

    }
}