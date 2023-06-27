import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipSingleFile {
    public static void main(String[] args) throws IOException {
        String SourceFile = " website.txt ";
        FileOutputStream FoS = new FileOutputStream(" web.zip ");
        ZipOutputStream zipOut = new ZipOutputStream(FoS);
        File fileToZip = new File(SourceFile);
        FileInputStream FiS = new FileInputStream(fileToZip);
        ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
        zipOut.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while ((length = FiS.read(bytes)) >= 0) {
            zipOut.write(bytes, 0, length);
        }
        zipOut.close();
        FiS.close();
        FoS.close();
    }
}
