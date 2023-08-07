package com.unitedcoder.jsonfile.serilization1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcoder.cubecartautomation.CustomerInfo;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Serilization {
    public static void main(String[] args) {

        CustomerInfo customerInfo = new CustomerInfo("Miss", "Aliye", "Idris", 123456,
                "aliye@hotmail.com");

        ObjectMapper mapper = new ObjectMapper();
        String content;
        try {
            content = mapper.writeValueAsString(customerInfo);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try {
            FileUtils.writeStringToFile(new File("JsonFile/customer-info.json"), content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
