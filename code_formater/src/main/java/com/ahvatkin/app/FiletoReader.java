package com.ahvatkin.app;


import java.io.*;
import java.lang.*;

public class FiletoReader implements IReader, IClosable {

    private final  BufferedReader bufferedReader;
    private int symbol;

    public FiletoReader(String filename) throws ReaderException {
        try{
            bufferedReader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e){
            throw new ReaderException(e);
        }
    }

    @Override
    public boolean hacChars() throws ReaderException {
        try {
            symbol = bufferedReader.read();
            return (symbol >= 0);
        } catch (IOException e) {
            throw new ReaderException(e);
        }
    }

    @Override
    public char read() throws ReaderException {
        return (char) symbol;
    }

    @Override
    public void close() throws CloseException {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            throw new CloseException(e);
        }
    }
}
