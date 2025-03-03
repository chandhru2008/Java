package JavaBasics.ArrayInJava;

public class ArrayProblemsInJava {
    public static void main(String[] args) {
        ArrayProblems firstProblems = new ArrayProblems();
        System.out.println(firstProblems.findElementInArray(1));   // Send the number as parameter
        System.out.println(firstProblems.findElementInArray(9));

        ArrayProblems secondProblems = new ArrayProblems();
        System.out.println("Sum of the Array is : " + secondProblems.sumOfThrArray());

    }
}

class ArrayProblems {
    // Check given number exit in the array or not
    int[] exampleArray = {1, 2, 4, 5, 6, 7, 8};

    String findElementInArray(int target) {
        for (int i = 0; i < exampleArray.length; i++) {
            if (target == exampleArray[i]) {
                return ("Element found in " + i + "th index");
            }
        }
        return ("Element not in the array");
    }

    int sumOfThrArray() {
        int sum = 0;
        for (int element : exampleArray) {
            sum += element;
        }
        return sum;
    }

}
