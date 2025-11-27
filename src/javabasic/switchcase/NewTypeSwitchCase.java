package javabasic.switchcase;

public class NewTypeSwitchCase {
    static void main(String[] args) {
        int day = 3;
        String dayName = switch (day){
            case 1 -> "monday";
            case 2 -> "Tuesday";
            case 3 -> "Thursday";
            case 4 -> "Sunday";
            case 5 -> "Friday";
            default -> "Invalid Day";
        };
        System.out.println(dayName);
    }
}
