package com.openbootcam.exams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;


public class CopyFile {
    public static void copyFile(String fileIn, String fileOut) {
        try (InputStream in = new FileInputStream(fileIn);
             PrintStream out = new PrintStream(new FileOutputStream(fileOut))) {
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

