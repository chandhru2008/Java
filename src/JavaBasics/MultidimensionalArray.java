package JavaBasics;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int [] [] MultidimensionalArray = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        //Printing elements in MultidimensionalArray
        for (int i = 0; i < MultidimensionalArray.length; i++) {
            for (int j = 0; j < MultidimensionalArray[i].length; j++) {
                System.out.println(i + "th Index of " + j + "th element: " + MultidimensionalArray[i][j]);
            }
        }

        //Using forEach
        for(int [] ArrayElements: MultidimensionalArray){
            for (int elements: ArrayElements){
                System.out.println(elements);
            }
        }
    }

}
