import java.util.Scanner;

public class Exercise_21 {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        int number = new Scanner(System.in).nextInt();

        System.out.print(number + " in binary is " + dec2Bin(number));
    }

    public static String dec2Bin(int value) {

        String s = ((value & 1) == 1) ? "1" : "0";
        if (value == 0 || value == 1)
            return s;
        else
        {
        	System.out.println("s: " + s);
        	System.out.println("value>>1 " + (value>>1));
        	System.out.println("both" + (value>>1) + s);
            return dec2Bin(value >> 1) + s;
        }
    }
}