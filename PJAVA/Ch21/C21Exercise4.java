import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class C21Exercise4 {

    public static void main(String[] args) throws IOException {

    	Integer a1 = new Integer(1);
    	int a2 = 1;
    	System.out.println(a1.equals(a2));
    	System.out.println();
        System.out.println("Enter file name: ");
        File file = new File("C21_4.txt");
        if (!file.isFile())
            throw new FileNotFoundException(file + " is not a file");
        else
        	System.out.println("is file");

        int vowelCount = 0;
        int consonantCount = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {

        	System.out.println("inside try");
        	System.out.println("test: " + Arrays.asList(new Character[]{'A', 'E', 'I', 'O', 'U'}));
            HashSet<Character> vowels = new HashSet<>(Arrays.asList(new Character[]{'A', 'E', 'I', 'O', 'U'}));

            String s;
            while ((s = in.readLine()) != null) {
                for (char ch : s.toCharArray()) {
                    if (Character.isAlphabetic(ch)) {
                        ch = Character.toUpperCase(ch);
                        if (vowels.contains(ch))
                            vowelCount++;
                        else
                            consonantCount++;
                    }
                }
            }

        } catch (IOException ex) {

        }

        System.out.println("Total vowels = " + vowelCount);
        System.out.println("Total consonants = " + consonantCount);
    }

}