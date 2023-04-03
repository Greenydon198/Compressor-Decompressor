package Compress_Decompress;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Compress {

    public static void convert(File file) throws IOException {

        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file.getParent()+"/Compressed.gz");
        GZIPOutputStream gzip = new GZIPOutputStream(fos);

        byte buff[] = new byte[1024];
        int len ;

        while((len = fis.read(buff))!=-1){
            gzip.write(buff,0,len);

        }

        gzip.close();
        fis.close();
        fos.close();
    }
}
