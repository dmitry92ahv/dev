package com.ahvatkin.app;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
import java.io.*;


public class IReaderTest {
    File file = new File("test.txt");
    OutputStream fileStream = new FileOutputStream(file);

    public IReaderTest() throws FileNotFoundException {
        PrintStream printStream = new PrintStream(fileStream);
        printStream.println("t \n");
        printStream.flush();
        printStream.close();
    }

    @Test
    public void test1() throws ReaderException {

        IReader reader = new FiletoReader("test.txt");
        char s;
        s = reader.read();
        file.delete();
        assertEquals('t', s);
    }



}
