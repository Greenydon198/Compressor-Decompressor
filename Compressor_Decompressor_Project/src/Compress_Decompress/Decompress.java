package Compress_Decompress;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Decompress {
    public static void convert(File file) throws IOException {

        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzip = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(file.getParent()+"/decom.jpg");

        byte buff[] = new byte[1024];
        int len ;

        while((len = gzip.read(buff))!=-1){
            fos.write(buff,0,len);
        }
    }
}
