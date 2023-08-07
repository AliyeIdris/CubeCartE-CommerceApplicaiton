package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo2 {
    public static void main(String[] args) {
        String s="I am Testing CubeCart Application\n";
        StringBuilder stringBuilder= new StringBuilder();
        String s1="Customer 1\n";
        String s2="Customer 2\n";
        stringBuilder.append(s);
        stringBuilder.append(s1);
        stringBuilder.append(s2);
        File file= new File("CubeCartAppTest"+File.separator+"MyTest.txt");
        try {
            FileUtils.writeStringToFile(file,stringBuilder.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
