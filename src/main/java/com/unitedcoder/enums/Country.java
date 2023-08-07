package com.unitedcoder.enums;

public enum Country {
    INDIA("India"),
    UAE("United Arab Emirates"),
    UK("United Kingdom");
    private String description;

    Country(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
