package javabasic.constructor;

public class CreateConstructor {

    String name ;

    CreateConstructor(){
        this.name = "akash";
    }

    static void main(String[] args) {
        CreateConstructor Mynameobj = new CreateConstructor();
        System.out.println(Mynameobj.name);


    }
}
