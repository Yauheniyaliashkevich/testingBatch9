package com.class28.interfacess;

public interface InterfaceI1 {
    void method();
}
interface InterfaceI2{
    void method();
}

class Child1 implements InterfaceI1, InterfaceI2{

    @Override
    public void method(){
        System.out.println("Same method for all  ");
    }
}
