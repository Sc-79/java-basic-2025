package javabasic.arraybasic;

public class LoopArray {
    String[] myFamilyName = {"sourav", "koushik", "Akash", "nill","srijan", "sristi" };

    static void main(String[] args) {
        LoopArray myarray = new LoopArray();
        for (int i = 0; i < myarray.myFamilyName.length ; i++) {
            System.out.println(i);
        }
    }
}
