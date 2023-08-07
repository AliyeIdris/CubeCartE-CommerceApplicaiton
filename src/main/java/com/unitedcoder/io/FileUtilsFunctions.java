package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileUtilsFunctions {
    public static void main(String[] args) {
        File fileToDelete=new File("CubeCartAppTest");
        try {
            FileUtils.deleteDirectory(new File("cubecartlogintestresult"));
            FileUtils.deleteDirectory(fileToDelete);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
