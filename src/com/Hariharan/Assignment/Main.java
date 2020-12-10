package com.Hariharan.Assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        FileCreation();
        NioExample obj = new NioExample();
        obj.ReadLine();
    }
    public static void FileCreation(){
        String data = "";
        for (int i = 1; i <= 100; i++) {
            data = data + "Test Data " + i + "\n";
        }
        Path path = Paths.get("c:/Users/kavin AM/IdeaProjects/NIO/Test.txt");
        try {
            Files.write((path), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
