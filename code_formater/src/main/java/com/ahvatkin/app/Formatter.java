package com.ahvatkin.app;

public class Formatter implements IFormatter{
    @Override
    public void Format(IReader reader, IWriter writer) throws FormatterException {

        int level = 0;
        String s1;
        String tab = "    ";

        try {
            while (reader.hacChars()){
                char s = reader.read();

                if (s == ' ' || s == '\n'){
                    continue;
                }
                else if (s == ';') {
                    s1 = "";

                    writer.write(';');
                    writer.write('\n');
                    for (int i = 0; i < level; i++) {

                        writer.write(' ');
                        writer.write(' ');
                        writer.write(' ');
                        writer.write(' ');
                    }

                }
                else if (s == '{') {
                    s1 = "";
                    level++;

                    writer.write('{');
                    writer.write('\n');
                    for (int i = 0; i < level; i++) {
                        writer.write(' ');
                        writer.write(' ');
                        writer.write(' ');
                        writer.write(' ');
                    }
                }
                else if (s == '}') {
                    s1 = "";
                    level--;

                    writer.write('}');
                    writer.write('\n');
                    for (int i = 0; i < level; i++) {

                    writer.write(' ');
                    writer.write(' ');
                    writer.write(' ');
                    writer.write(' ');
                    }
                }
                else {


                    writer.write(s);
                }








            }
        } catch (ReaderException e) {
            throw new FormatterException("Reading error", e);
        } catch (WriterException e) {
            throw new FormatterException("Writing error", e);
        }
    }
}
