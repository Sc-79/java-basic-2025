package javabasic.staticused;

public class StaticBlock {

}
//⭐ PRACTICE–3: Static Block (Class load হলে 1 বার run)
class Loder{
    static {
        System.out.println("just one time lodded ");

    }
}

 class Test3{
     static void main(String[] args) {
         Loder obj = new Loder();
         System.out.println("my loader is loading");
     }
}