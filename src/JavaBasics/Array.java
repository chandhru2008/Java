package JavaBasics;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // In Java, You can not store different data types in same array
        int [] IntegerArray = {1, 2, 3 ,4, 5}; // If you try to print the array directly it will print the memory references of the array
        System.out.println("Memory references of the array: " + IntegerArray);

        //If you want to print the array directly use toString method
        System.out.println("Using toString method to print array: " + Arrays.toString(IntegerArray));

        //Printing array elements
         //1.using for loop
        for (int i = 0; i < IntegerArray.length; i++) {
            System.out.println(i + "th Index of IntegerArray: " + IntegerArray[i]);
        }

         //2.Using forEach
        for(int elements: IntegerArray){
            System.out.println(elements);
        }
    }


}
