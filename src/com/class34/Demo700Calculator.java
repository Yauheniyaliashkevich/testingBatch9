package com.class34;




public class Demo700Calculator {
    public static void main(String[] args) {

        Calculator calculator=new Calculator();

        try{
            calculator.Calculate();
        }catch (ArithmeticException e){
            System.out.println("Can not divide by zero");
        }catch (NullPointerException e){
            System.out.println("Null object");
        }catch (Exception e){
            System.out.println("Generic exception");
        }
    }
}
