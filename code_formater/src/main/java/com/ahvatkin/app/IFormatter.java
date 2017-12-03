package com.ahvatkin.app;

public interface IFormatter {
 void Format(final IReader reader, final IWriter writer) throws FormatterException;
}
