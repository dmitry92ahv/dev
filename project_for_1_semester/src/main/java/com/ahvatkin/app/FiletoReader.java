package main.java.com.ahvatkin.app;

import java.io.*;
import java.lang.*;

import static java.lang.System.in;

public class FiletoReader {


    public static char read(String filename)
            throws IOException{



        try {
            FileInputStream in = new FileInputStream("filename");


            int c;
            c = in.read();
            return (char) c;
//            while ((c = in.read()) != -1){
//               return (char) c;
//            }
        }
        finally {
            if (in != null){
                in.close();
            }

        }

//        return '0';
    }
}
