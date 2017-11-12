package com.ahvatkin.app;

public class Formatter implements IFormatter{
    @Override
    public void Formatter(IReader reader, IWriter writer) {

        int level = 0;

        try {
            while (reader.hacChars()){
                char s = reader.read();
                if(s == ' ' || s == '\n');
                else if(s == ';') writer.write(";\n");
                else if(s == '{') {
                    writer.write("{\n");
                    level++;
                }
                else if(s == '}') {
                    writer.write("}\n");
                    level--;
                }
                else {
                    String s1;
                    s1 = "" + s;
                    writer.write(s1);
                }



            }
        } catch (ReaderException e) {
            e.printStackTrace();
        }
    }
}
