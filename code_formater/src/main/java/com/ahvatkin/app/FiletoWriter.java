package com.ahvatkin.app;

import java.io.*;

import static java.lang.System.out;

public class FiletoWriter implements IWriter {


    @Override
    public void write(String text) {
        System.out.print(text);
    }


//FileWriter writer = new FileWriter("out.java");
//
//    public FiletoWriter(String text) throws IOException {
//    }
//
//    @Override
//    public void write() throws WriteException {
//        try {
//            writer.write("sfdg");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void close() throws WriteException, IOException {
//        writer.close();
//    }

}
