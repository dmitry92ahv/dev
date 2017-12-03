package com.ahvatkin.app;



    public class StringReader implements IReader {

        private String value;
        private int index;

        public StringReader(final String value) {

            this.value = value;
        }

        @Override
        public boolean readNext() throws ReaderException {
            return index < value.length();
        }

        @Override
        public char getChar() throws ReaderException {

            try {
                return value.charAt(index++);
            } catch (StringIndexOutOfBoundsException e) {
                throw new ReaderException("Attempting to read outside of the string", e);
            }
        }
    }