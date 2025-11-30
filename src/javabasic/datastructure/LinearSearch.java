package javabasic.datastructure;

//arr = {1,2,3,4,5,6,7};
//target = 5
public class LinearSearch {
    public static int linerSearch(int[] arr, int target){
        for (int i = 0; i <arr.length ; i++) {
          
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    };

    static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int target = 7;
       int findIndx =  linerSearch(array,target);
        System.out.println(findIndx);

    }

}
