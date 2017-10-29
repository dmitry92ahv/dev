package com.ahvatkin.app;



import java.io.*;
import java.nio.Buffer;

public class IOFile {

    public  static String read(String filename) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null)
            sb.append(s + "\n");
        in.close();
        return sb.toString();
        }


//    static String file = "out.java";
//    public static void entry(String[] args) throws IOException{
//
//        BufferedReader in =  new BufferedReader(new StringReader(BufferedInputStream(args[])));
//        PrintWriter out = new PrintWriter(file);
//        int lineCount = 1;
//        String s;
//        while (s = in.readline()) != null)
//        out.println(lineCount++ + ": " + s);
//        out.close();
//        System.out.println(BufferedInputFile.read(file));
//    }
}