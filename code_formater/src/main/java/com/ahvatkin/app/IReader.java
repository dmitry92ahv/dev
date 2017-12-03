package com.ahvatkin.app;

public interface IReader {

    boolean readNext() throws ReaderException;

    char getChar() throws ReaderException;
}
