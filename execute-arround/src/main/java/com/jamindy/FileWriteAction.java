package com.jamindy;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by admin on 15-6-4.
 */
public interface FileWriteAction {

    void writeFile(FileWriter writer) throws IOException;


}
