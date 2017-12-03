package com.ahvatkin.app;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ReaderException, IOException, FormatterException {

//IReader reader = new FiletoReader("in.java");
IReader reader = new StringReader("d;gfdhsgdfedfef{fgdghf}\ngfdsh;");
IWriter writer = new StringWriter();
IFormatter format = new Formatter();

format.Format(reader,writer);


    }
}
