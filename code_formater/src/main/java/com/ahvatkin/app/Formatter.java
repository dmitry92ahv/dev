package com.ahvatkin.app;

public class Formatter implements IFormatter{
    @Override
    public void Formatter(IReader reader, IWriter writer) {

        int level = 0;
        Boolean flagKovich = false;
        char pred = ' ';

        try {
            while (reader.hacChars()){
                char s = reader.read();




                if((s == '\'' || s == '\"') && !flagKovich) {
                    flagKovich = true;
                }
                if((s == '\'' || s == '\"') && flagKovich) {
                    flagKovich = false;
                }







                if(s == '\n');
                else if (s == ' '){
                 if(flagKovich) writer.write(" ");
                }

                else if (s == '+' || s == '-' || s == '*' || s == '/' || s == '=') writer.write((" " + s + " "));



                else if(s == ';') {
                    String a = "";
                    a = a + ";\n";
                    for (int i = 0; i < level; i++) {
                        a = a + "    ";
                    }
                    writer.write(a);
                }
                else if(s == '{') {
                    String a = "";
                    a = a + "{\n";
                    for (int i = 0; i < level; i++) {
                        a = a + "    ";
                    }
                    writer.write(a);
                    level++;
                }
                else if(s == '}') {
                    String a = "";
                    if(pred == ';') level--;
                    level--;
                    for (int i = 0; i < level; i++) {
                        a = a + "    ";
                    }
                    a = a + "}\n";
                    writer.write(a);

                }
                else {
                    String s1;
                    s1 = "" + s;
                    writer.write(s1);
                }


                pred = s;
            }
        } catch (ReaderException e) {
            e.printStackTrace();
        }
    }
}
