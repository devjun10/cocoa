package com.example.demo.files;

import java.io.IOException;
import java.nio.file.*;

public class FilesCopyA {
    private static final String SOURCE_PATH = "/Users/jjw/Jun/CodeSquad/CodeSquad_Cocoa/contents/week03/day_11/src/main/java/com/example/demo/concurrent/Counter.java";
    private static final String TARGET_PATH = "/Users/jjw/Jun/CodeSquad/CodeSquad_Cocoa/contents/week03/day_11/src/main/java/com/example/demo/Counter.java";


    public static void main(String[] args) throws Exception {
        Path source = Paths.get(SOURCE_PATH);
        Path target = Paths.get(TARGET_PATH);
        StandardCopyOption[] options = new StandardCopyOption[]{StandardCopyOption.REPLACE_EXISTING};
        copyFile(source, target, options);
    }

    public static void copyFile(Path source, Path target, CopyOption[] options) {
        if (Files.isDirectory(source) || Files.notExists(source)) {
            System.out.println("존재하지 않는 디렉토리입니다.");
        }

        try {
            if (Files.exists(target)) {
                System.out.println("대상 파일이 존재합니다.");
            }
            Files.copy(source, target, options);
        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean existRealPath(Path path) {
        return Files.isDirectory(path) || Files.notExists(path);
    }
}


