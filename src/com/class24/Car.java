package com.class24;

public class Car {


    void start() {
        System.out.println("Use the key to start me");
    }
    void stop(){
        System.out.println("Use the breaks to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}

class BMW extends Car{
    void start() {
        System.out.println("Use the Button to start me");
    }
    void driffting(){
        System.out.println("I can drift really good in rain");
    }
}
class Tesla extends Car{
    void start() {
        System.out.println("Use App to start me");
    }
    void park(){
        System.out.println("Park me using sensor and camera");
    }
}

class Toyota extends Car{

}
