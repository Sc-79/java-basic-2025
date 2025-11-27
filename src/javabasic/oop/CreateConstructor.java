package javabasic.oop;

public class CreateConstructor {
    String name;
    int age;
//constructor
    CreateConstructor(String n , int a){
        name = n;
        age = a;
    }

    void show(){
        System.out.println("name:" + name+ " " + "age:" + age);

    }

}

 class Test1Constuctor {
    static void main(String[] args) {
        CreateConstructor createConstructor = new CreateConstructor( "sosososo",32);
        createConstructor.show();

    }
}