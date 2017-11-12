package com.ahvatkin.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ReaderException, IOException {

IReader reader = new FiletoReader("in.java");
IWriter writer = new FiletoWriter();
IFormatter formatter = new Formatter();

formatter.Formatter(reader,writer);


    }
}
