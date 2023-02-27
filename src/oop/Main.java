package oop;

public class Main {
    public static void main(String[] args) {
        Car audi=new Car();
        audi.model="Audi";
        audi.speed=10;

        System.out.println(audi.model+" hızı :"+audi.speed);


        Car bmw=new Car();
        bmw.model="BMW";
        bmw.speed=20;
        bmw.increaseSpeed(20);
        bmw.printSpeed();

        Car mercedes=new Car();
        mercedes.model="Mercedes";
        mercedes.speed=30;
        mercedes.printSpeed();
    }
}
