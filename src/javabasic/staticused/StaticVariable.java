package javabasic.staticused;
//PRACTICE–1: Static Variable (Shared Across Objects)
//✔ object 3 বার create → static count = 3
//        ✔ সব object একই count share করে


public class StaticVariable {
    static int count = 0;
//return type thek na
    StaticVariable(){
        count++;
    }
}

class Test1{
    static void main(String[] args) {
        new StaticVariable();
        new StaticVariable();
        new StaticVariable();
        new StaticVariable();
        new StaticVariable();
        new StaticVariable();
        new StaticVariable();
        new StaticVariable();

        System.out.println(StaticVariable.count);


    }
}