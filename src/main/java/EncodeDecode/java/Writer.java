package EncodeDecode.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer {
    public void write(byte[] data ,String path){
        File file=new File(path);
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            fileOutputStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
