package com.ahvatkin.app;

public interface IClosable extends AutoCloseable{

    @Override
    void close() throws CloseException;
}
