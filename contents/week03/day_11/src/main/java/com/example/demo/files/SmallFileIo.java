package com.example.demo.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SmallFileIo {

    public static byte[] readAllFromFile(Path filePath) throws IOException {
        byte[] fileArray = Files.readAllBytes(filePath);
        return fileArray;
    }

    public static void main(String[] args) throws Exception {
        byte[] result = readAllFromFile(Path.of("/Users/jjw/Jun/CodeSquad/CodeSquad_Cocoa/contents/week03/day_11/src/main/java/com/example/demo/files/FilesCopyA.java"));
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
        System.out.println("======================");
        System.out.println(result.length);

    }
}
