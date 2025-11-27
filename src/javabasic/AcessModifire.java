package javabasic;

public class AcessModifire {

    public String name1 = "public bathroom ";
    private String name2 = "private bathroom";
            String  name3 = "mathe bathroom";
    private Integer num1 = 10;
              Integer num2 = 20;


}

class  sum {
    static void main(String[] args) {

        System.out.println("doood");

    }
}

class add{

    public static void main(){
        System.out.println("this is my clacullator" +
                "this is ,su");
      javabasic.AcessModifire acessModifire = new AcessModifire();
        System.out.println(acessModifire.name3);


          
    }

}