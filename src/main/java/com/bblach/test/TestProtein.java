package com.bblach.test;

public class TestProtein extends TestProduct {
    private int proteinCount;
    private String name;
    
    public TestProtein(String name, int proteinCount) {
        super(name);
        this.proteinCount= proteinCount;
        // TODO Auto-generated constructor stub
    }
    public int getProteinCount() {
        return proteinCount;
    }
    
    
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "TestProtein [name =" + super.getName() + ", proteinCount=" + proteinCount + "]";
    }
   
    
    
    

}
