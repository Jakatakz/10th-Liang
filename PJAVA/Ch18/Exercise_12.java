import java.util.Scanner;

public class Exercise_12 {

    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        String s = new Scanner(System.in).nextLine();
        reverseDisplay(s);

    }

    private static void reverseDisplay(String s) {
        reverseDisplay(s, s.length());
    }

    private static void reverseDisplay(String s, int high) {
        if (high == 0)
            return;
        System.out.print(s.substring(high - 1));
        reverseDisplay(s.substring(0, high - 1));
    }
}