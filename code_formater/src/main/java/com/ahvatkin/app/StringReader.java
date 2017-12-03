package com.ahvatkin.app;

public class StringReader implements IReader{

    Boolean nehtChar = true;
    int i = 0;
    String s = "asfd;{dgfjh;}  \n dhjhgsf{gfdhgfjhg;}";

    @Override
    public boolean hacChars() throws ReaderException {
        if (i == s.length() -1)
        return false;
        else return true;
    }

    @Override
    public char read() throws ReaderException {
        i++;

        return s.charAt(i);

    }

}
