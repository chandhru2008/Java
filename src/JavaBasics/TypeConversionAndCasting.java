package JavaBasics;

public class TypeConversionAndCasting {
    public static void main(String[] args) {
        // Type conversion (Implicit conversion)
        int num1 = 12;
        byte num2 = 14;
        num1 = num2;
        System.out.println("Example of Type Conversion: " + num1);

        //Type casting (Explicit conversion)
        byte num3 = 12;
        int num4 = 246;
        num3 = (byte) num4; // But this will lose some date because the int(num4) we try to convert into byte is up to range of a Byte
        System.out.println("Example of Type casting: " + num3); // The out-put will be -10
    }
}
