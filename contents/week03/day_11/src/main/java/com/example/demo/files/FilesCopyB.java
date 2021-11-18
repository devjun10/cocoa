package com.example.demo.files;

import java.io.*;
import java.nio.file.*;

public class FilesCopyB {
    private static final String SOURCE_PATH = "/Users/jjw/Jun/CodeSquad/CodeSquad_Cocoa/contents/week03/day_11/src/main/java/com/example/demo/concurrent/Counter.java";
    private static final String TARGET_PATH = "/Users/jjw/Jun/CodeSquad/CodeSquad_Cocoa/contents/week03/day_11/src/main/java/com/example/demo/Counter.java";


    public static void copyFile(File sourceFile, File targetFile) {
        if (sourceFile.exists() && sourceFile.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
                BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
                System.out.println("FileCopy Start");

                char[] buffer = new char[1024];
                int readCount = 0;
                while ((readCount = br.read(buffer)) > 0) {
                    bw.write(buffer, 0, readCount);
                    System.out.println("Copy Complete");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("파일을 복사할 수 없습니다.");
        }
    }

    public static void main(String[] args) throws Exception {
        File sourceFile = new File(SOURCE_PATH);
        System.out.println(sourceFile);
        File targetFile = new File(TARGET_PATH);
        copyFile(sourceFile, targetFile);

    }
}


