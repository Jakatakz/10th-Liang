import java.util.*;
import java.io.*;

public class C21_3 {
  public static void main(String[] args) throws Exception {  

    if (args.length != 1)
    {
    	System.out.println("only need 1 file");
    	System.exit(1);
    }
    //pass java file name from command line
    File file = new File(args[0]);
    if (!file.isFile())
    {
    	System.out.println("not a file");
    	System.exit(2);
    }
    else 
    {
      System.out.println("The number of keywords in " + file 
        + " is " + countKeywords(file));
    }
  }
  
  //if a keyword is in comment or string, don't count it
  public static int countKeywords(File file) throws Exception {  
    // Array of all Java keywords + true, false and null
    String[] keywordString = {"abstract", "assert", "boolean", 
        "break", "byte", "case", "catch", "char", "class", "const",
        "continue", "default", "do", "double", "else", "enum",
        "extends", "for", "final", "finally", "float", "goto",
        "if", "implements", "import", "instanceof", "int", 
        "interface", "long", "native", "new", "package", "private",
        "protected", "public", "return", "short", "static", 
        "strictfp", "super", "switch", "synchronized", "this",
        "throw", "throws", "transient", "try", "void", "volatile",
        "while", "true", "false", "null"};

    Set<String> keywordSet = 
      new HashSet<>(Arrays.asList(keywordString));
    int count = 0;    

    Scanner input = new Scanner(file);

    boolean commentTrue = false;
    while (input.hasNext()) {
      String word = input.next();
      //check for comments
      if (word.startsWith("//"))
      {
    	  continue;
      }
      else if (word.startsWith("/*"))
      {
    	 String nextWord;
    	 do
    	 {
    		 nextWord=input.next();
    	 } while(!nextWord.contains("*/"));
      }
      //check for strings
      else if (word.contains("/"))
      {
    	  String nextWord;
      do
      {
    	  nextWord = input.next();
      } while (!nextWord.contains("\""));
    }
      else if (keywordSet.contains(word))
    	  count++;
  }
	return count;
}
}