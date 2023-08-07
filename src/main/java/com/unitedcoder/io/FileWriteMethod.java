package com.unitedcoder.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteMethod {
    //create a method to write a text file
    public void writeToFile(String folderName, String fileName, String extensions, String content){
        String projectPath=System.getProperty("user.dir");
        String folderLocation=projectPath+ File.separator+folderName;
        File folder= new File(folderLocation);
        if(!folder.exists()){
            folder.mkdir();
            System.out.println("Folder " +folderName+ " is created.");
        }
        String finalFileLocation=folderLocation+File.separator+fileName+extensions;
        File file= new File(finalFileLocation);
        System.out.println("File " +fileName+extensions+" is created.");
        FileWriter writer=null;
        try {
            writer= new FileWriter(file.getAbsoluteFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bufferedWriter= new BufferedWriter(writer);
        try {
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.dir"));

    }

}
