package com.jamindy;

import java.io.FileWriter;
import java.io.IOException;

/**
 * The Execute Around idiom specifies some code to be executed before and after
 * a method. Typically the idiom is used when the API has methods to be executed in
 * pairs, such as resource allocation/deallocation or lock acquisition/release.
 *
 * In this example, we have SimpleFileWriter class that opens and closes the file
 * for the user. The user specifies only what to do with the file by providing the
 * FileWriterAction implementation.
 */

public class Client
{
    public static void main( String[] args ) throws IOException
    {
        SimpleFileWriter fileWriter = new SimpleFileWriter();
        fileWriter.write("testfile.txt", new FileWriteAction() {
            @Override
            public void writeFile(FileWriter writer) throws IOException {
                 writer.write("hello\n");
                 writer.write("hello\n");
                 writer.write("hello\n");
                 writer.write("hello\n");
            }
        });
    }
}
