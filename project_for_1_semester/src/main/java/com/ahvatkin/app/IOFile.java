//package main.java.com.ahvatkin.app;
//
//
//import java.io.*;
//import java.nio.Buffer;
//import java.lang.*;
//
//public class IOFile {
//
//    public  static char  read(String filename) throws IOException{
//
//
//
//
//
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
//
//        int symbol = bufferedReader.read();
//        while (symbol != -1) {  // Когда дойдём до конца файла, получим '-1'
//            // Что-то делаем с прочитанным символом
//            // Преобразовать в char:
//            // char c = (char) symbol;
//            //symbol = bufferedReader.read(); // Читаем символ
//            char c = (char) symbol;
//            return c;
//         }
//         return 0;
//
//        }





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
//}