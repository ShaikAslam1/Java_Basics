package com.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class WorkAround {
    public static void main(String[] args) throws URISyntaxException {
        // copy same file multiple times
        Path originalPath = Paths.get("C:\\Users\\asshaik\\Desktop\\dummy files\\Dummy PDF File.pdf");

        for (int i=0; i<40; i++) {
            Path copiedPath = Paths.get("C:\\Users\\asshaik\\Desktop\\dummy files\\Dummy PDF File" + i +".pdf");
            try {
                Files.copy(originalPath, copiedPath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
