package com.ahvatkin.app;

import java.io.*;

import static java.lang.System.out;

public class StringWriter implements IWriter {




    @Override
    public void write(char symbol) throws WriterException {
        System.out.print(symbol);
    }


}
