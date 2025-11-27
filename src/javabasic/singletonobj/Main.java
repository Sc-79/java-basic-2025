package javabasic.singletonobj;


class Logger {

    private static Logger instance;

    private Logger() {
        // কেউ new করতে পারবে না
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // শুধুমাত্র একবার তৈরি হবে
        }
        return instance;               // সবসময় একই object ফেরত দেবে
    }

    public void log(String msg) {
        System.out.println("LOG: " + msg);
    }
}

public class Main {
    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        Logger l3 = Logger.getInstance();

        l1.log("Hi");
        l2.log("Hello");
        l3.log("Ok");

        System.out.println(l1 == l2); // true
        System.out.println(l2 == l3); // true
    }
}