public class Test {
  public static void main(String[] args) {
    Object o = new String();
    String d = (String)o;
    
    if(o instanceof String)
    	System.out.println("k");
    else
    	System.out.println("not k");
  }
}