package com.unitedcoder.io;

import com.unitedcoder.configutility.ApplicationConfig;
import com.unitedcoder.cubecartautomation.BaseClass;
import com.unitedcoder.cubecartautomation.LoginUser;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadLinesDemo extends BaseClass {
    public static void main(String[] args) {

        File fileToRead = new File("CubeCartAppTest" + File.separator + "Credentials");
        List<String> credentials = null;
        try {
            credentials = FileUtils.readLines(fileToRead,"UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(credentials);
        openBrowser(ApplicationConfig.readFromConfig("config.properties","url"));
        logIn(credentials.get(0),credentials.get(1));
    }
}
