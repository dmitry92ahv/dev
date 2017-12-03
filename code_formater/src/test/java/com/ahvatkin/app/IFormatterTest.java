package com.ahvatkin.app;

public class IFormatterTest {
    public static void main(String[] args) throws FormatterException {
        IReader reader = new StringReader("asd");
        IWriter writer = new StringWriter();
        IFormatter format = new Formatter();

        format.Format(reader,writer);
    }

}
