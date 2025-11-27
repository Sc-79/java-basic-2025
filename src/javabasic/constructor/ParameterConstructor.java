package javabasic.constructor;

public class ParameterConstructor {
    int modelYear;
    String modelName;

    ParameterConstructor(int Year, String Name){
         modelYear = Year;
       modelName = Name;


    }

    static void main(String[] args) {
        ParameterConstructor parameterConstructor = new ParameterConstructor(2938, "souatbaj");
        System.out.println(parameterConstructor.modelName);
        System.out.println(parameterConstructor.modelYear);


    }
}
