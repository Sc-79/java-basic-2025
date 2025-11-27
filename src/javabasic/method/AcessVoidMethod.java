package javabasic.method;

public class AcessVoidMethod {
    String name = "sourav chongrey";
    int age = 30;
    String study = "computer science";

    void getMyDetails(){
        System.out.println(name + age + "is a " + study );
    }

    static void main(String[] args) {
        System.out.println("this is my void method");
        AcessVoidMethod acessVoidMethod = new AcessVoidMethod();
         acessVoidMethod.getMyDetails();
        System.out.println("End");
    }
}
