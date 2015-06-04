package com.jamindy;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by admin on 15-6-4.
 */
public class SimpleFileWriter {

    public void write(String fileName,FileWriteAction fileWriteAction) throws IOException{
        FileWriter fileWriter = new FileWriter(fileName);
        try {
            fileWriteAction.writeFile(fileWriter);
        } finally {
            fileWriter.close();
        }
    }
}
