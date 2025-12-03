package javabasic.inheritance;

public  class InheritanceExample1 {
//    single Inheritance Example
static class Animal{
        void eat(){
            System.out.println("Eating");

        }

}

static class Dog extends Animal{
        void bark(){
            System.out.println("braking");

        }
}


    static void main(String[] args) {
        Animal animal = new Animal();
         animal.eat();
         Dog dog = new Dog();
           dog.bark();
           dog.eat();

    }
}
