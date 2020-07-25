package com.javarush.task.task31.task3113;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

/* 
Что внутри папки?
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();
        Path pathFile = Paths.get(path);
        if(Files.isDirectory(pathFile)){
            Files.walkFileTree(pathFile, new MyFileVisitor());
            System.out.println("Всего папок - " + (MyFileVisitor.dirCount - 1));
            System.out.println("Всего файлов - " + MyFileVisitor.fileCount);
            System.out.println("Общий размер - " + MyFileVisitor.allSize);
        }else {
            System.out.println(path + " - не папка" );
        }
    }

    public static class MyFileVisitor extends SimpleFileVisitor<Path> {
        private static long allSize = 0;
        private static long dirCount = 0;
        private static long fileCount = 0;

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            if(attrs.isDirectory()){
                dirCount++;
            }
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            allSize += attrs.size();
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            fileCount++;
            return FileVisitResult.CONTINUE;
        }
    }
}
