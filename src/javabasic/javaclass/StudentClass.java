package javabasic.javaclass;

public class StudentClass {
   String name = "sourav chongrey";
    Integer rollNumber = 10;
    String schoolName = "Khatul shibo durga high school";


   void GetName(){
       System.out.println("my name is "+ name + "my roll number is "+ rollNumber + "my school " + schoolName  );
   }



    static void main(String[] args) {
        StudentClass studentClass = new StudentClass();
        System.out.println(studentClass.name);
        studentClass.GetName();
    }

}
