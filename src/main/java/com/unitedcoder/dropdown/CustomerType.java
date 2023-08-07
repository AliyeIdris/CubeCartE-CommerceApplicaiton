package com.unitedcoder.dropdown;

public enum CustomerType {
    REGISTERED_CUSTOMER("Registered Customer"),
    UNREGISTERED_CUSTOMER("Unregistered Customer");

    private String description;

    CustomerType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
