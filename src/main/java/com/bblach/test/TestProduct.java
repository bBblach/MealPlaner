package com.bblach.test;

public abstract class TestProduct {
    private String name;

    public TestProduct(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TestProduct [name=" + name + "]";
    }

}
