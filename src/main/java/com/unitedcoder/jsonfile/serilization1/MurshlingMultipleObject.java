package com.unitedcoder.jsonfile.serilization1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcoder.cubecartautomation.CustomerInfo;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MurshlingMultipleObject {
    public static void main(String[] args) {
        CustomerInfo customerInfo1 = new CustomerInfo("Miss.", "Aliye", "Idris", 123456,
                "aliye@hotmail.com");
        CustomerInfo customerInfo2 = new CustomerInfo("Mr.", "David", "Smith", 123456,
                "david@gmail.com");
        CustomerInfo customerInfo3 = new CustomerInfo("Mrs.", "Kate", "Smith", 123456,
                "kate@hotmail.com");
        List<CustomerInfo> customerInfoList=new ArrayList<>();
        customerInfoList.addAll(Arrays.asList(customerInfo1,customerInfo2,customerInfo3));
        ObjectMapper mapper=new ObjectMapper();
        Customers customers=new Customers(customerInfoList);
        String s;
        try {
            s=mapper.writeValueAsString(customers);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try {
            FileUtils.writeStringToFile(new File("JsonFile/multiple-customerInfoList.json"),s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
