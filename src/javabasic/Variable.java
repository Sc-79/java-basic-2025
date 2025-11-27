package javabasic;

//int, double, char, boolean

public class Variable {

    static String language = "Java"; // static/global variable

    String developer = "sourav chongrey"; //not  access this variable


    static void main(String[] args) {
        int age = 30;
        int year = 2025;
        int quantity = 1;

        char grade = 'B';
        String grade1 = "B++";



        double price = 19.30;
        double gpa = 3.5;
        double temp =2.3;

        boolean isStudent = true;
        boolean  isOnline = false;
        boolean isOk = true;




//         boolean isStudent = false;
        try {
            if (!isStudent) {
                System.out.println("This is not student ");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("variavle" + "sourav chongry" + Variable.language);
        Variable obj = new Variable();
        System.out.println("developer:" + obj.developer);
        System.out.println("Full Out:" + language + "by" + obj.developer);

    }
}

