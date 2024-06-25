package com.example.store.model;

public enum Color {
    RED("RED"),
    BLUE("BLUE"),
    BLACK("BLACK"),
    WHITE("WHITE");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
