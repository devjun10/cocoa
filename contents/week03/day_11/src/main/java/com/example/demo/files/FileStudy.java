package com.example.demo.files;

import java.nio.file.*;

public class FileStudy {
    public static void main(String[] args) throws Exception {

        Path path = Paths.get("").toAbsolutePath();
        Path first = Path.of("").toAbsolutePath();
//        Files.getFileStore(Path.of("/Users/jjw/Jun/CodeSquad/CodeSquad_Cocoa/contents/week03/day_11/src/main/java/com/example/demo"));
        System.out.println(Files.getFileStore(Path.of("/Users/jjw/Jun/CodeSquad/CodeSquad_Cocoa/contents/week03/day_11/src/main/java/com/example/demo")));
//        FileSystems.getFileSystem(path.toUri());
//        System.out.println(first);
        System.out.println(existRealPath(Path.of("/Users/jjw/Jun/CodeSquad/CodeSquad_Cocoa/contents/week03/day_11/src/main/java/com/example/demo/files/FileStudy.java")));
        Path path1 = Path.of("/Users/jjw/Jun/CodeSquad/CodeSquad_Cocoa/contents/week03/day_11/src/main/java/com/example/demo/files/FileStudy.java");
        System.out.println(isExecutable(path1));

    }

    public static boolean existRealPath(Path path) {
        return Files.exists(path) && !Files.notExists(path);
    }

    public static boolean isDirectory(Path path) {
        return Files.isDirectory(path);
    }

    public static boolean isFile(Path path) {
        return !Files.isDirectory(path);
    }


    public static boolean isReadable(Path path) {
        return Files.isReadable(path);
    }

    public static boolean isWriteable(Path path) {
        return Files.isWritable(path);
    }

    public static boolean isExecutable(Path path) {
        return Files.isExecutable(path);
    }




}
