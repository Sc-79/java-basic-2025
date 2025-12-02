package javabasic.thisandsuper;

public class UsedThis {
    int x = 20;

    class Test {
        int x = 24;
    }

    static void main(String[] args) {
        UsedThis usedThis = new UsedThis();
        System.out.println(usedThis.x);
       UsedThis.Test inner = usedThis.new Test();
        System.out.println(inner.x);

    }
}
