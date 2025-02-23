package JavaBasics;

public class DataTypesInJava {
    public static void main(String[] args) {
        // In Java there are two data types Primitive and non-Primitive data types

        //Primitive data type
          //1.Numeric data types
          //2. Non-numeric data types

        //1.Numeric data types
         //Integer
        int i = 10;
        System.out.println("Integer data type: " + i); // Range of int = -2,147,483,648 to 2,147,483,647

        long l = 1234;
        System.out.println("Long data type: " + l); // Range of long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        short s = 23;
        System.out.println("Short data type: " + s); // Range of short = -32,768 to 32,767

        byte b = 100;
        System.out.println("Byte data type: " + b); //Range of byte = -128 to 127

        //Floating Point
        float f = 12.12f;
        System.out.println("Float data type: " + f); //Range of float = up to 7 decimal digits

        double d = 1234.456;
        System.out.println("Double data type: " + d); //Range of double = up to 16 decimal digits



        //2.Non-numeric data type
        Boolean bc = true; // This is class
        System.out.println("Boolean data type: " +bc);

        char c = 'c';
        System.out.println("Char data type: " + c);


       //Non-primitive data types

       String name = "Chandhru";
        System.out.println("String data type: " + name);

        int [] arr = {1, 2, 3}; // You can not print an array directly


        //More........

    }
}
