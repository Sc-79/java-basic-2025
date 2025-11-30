package javabasic.javascope;

public class JavaSameVariableUsed {
    static void main(String[] args) {

        for(int i =0; i<= 20; i++){
            System.out.println(i);
            for(int j = 20; j<=40; j++){
                System.out.println(j);
            }
        }
        for(int i =0; i<= 20; i++){
            System.out.println(i);
            System.out.println("sourav chongrey");
            for(int j = 20; j<=40; j++){
                System.out.println(j);
            }
        }

    }
}
