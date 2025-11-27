package javabasic.oop;
//////Car হলো একটি class → blueprint
//
//myCar হলো একটি object → real memory-তে থাকা উপাদান
//
//আমরা object-এর জন্য color ও speed সেট করেছি
//
//তারপর myCar.drive() call করেছি


public class BasicClass {
    String color;
    int speed;
    void drive() {
        System.out.println(color + " car is diving at " + speed + "km/h");

    }

}

class Main {
    public static void main(String[] args){
       BasicClass basicClass = new BasicClass();
       basicClass.color = "red";
       basicClass.speed = 100;
       basicClass.drive();
    }

}


