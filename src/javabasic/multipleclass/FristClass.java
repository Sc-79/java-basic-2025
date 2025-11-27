package javabasic.multipleclass;



public class FristClass {
     int x = 10;
     int y = 20;
    static void main(String[] args) {
        FristClass fristClass = new FristClass();
        int value = fristClass.x;
        System.out.println(value);   // 10
        for (int i =5; i<=value; i++ ){
            System.out.println(i); //
        }
    }
}


class SecondClass{

    static void main(String[] args) {
        FristClass fristClass = new FristClass();
        int value = fristClass.x;
      System.out.println(value);   // 10
        for (int i =5; i<=value; i++ ){
            System.out.println(i); //
        }
    }

}
