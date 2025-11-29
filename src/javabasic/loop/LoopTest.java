package javabasic.loop;

public class LoopTest {
    static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            System.out.println("loop-1");
            for (int j = 1; j <= i; j++) {
                System.out.println(j);
                System.out.println("loop-2");

            }
        }
    }
}
