package com.unitedcoder.jsonfile.serilization1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unitedcoder.cubecartautomation.CustomerInfo;

import java.util.List;

public class Customers {
    @JsonProperty("Customers")
    private List<CustomerInfo> customers;

    public Customers(List<CustomerInfo> customers) {
        this.customers = customers;
    }
}
