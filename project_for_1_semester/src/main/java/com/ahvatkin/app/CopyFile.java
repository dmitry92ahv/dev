package main.java.com.ahvatkin.app;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args)
            throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("in.java");
            out = new FileOutputStream("out.java");

            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
        }
        finally {
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }


    }
}
