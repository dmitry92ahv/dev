package com.ahvatkin.app;

public interface IReader {
    boolean hacChars() throws ReaderException;
    char read() throws ReaderException;
}
