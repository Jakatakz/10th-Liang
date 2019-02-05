
import java.util.ArrayList;

public class C138 implements Cloneable {
  private ArrayList<Object> list = new ArrayList<Object>();

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public int getSize() {
    return list.size();
  }

  public Object peek() {
    return list.get(getSize() - 1);
  }

  public Object pop() {
    Object o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  public void push(Object o) {
    list.add(o);
  }
  
  @Override
  protected Object clone()
  {
	  C138 c = null;
	  try
	  {
		  c = (C138) super.clone();
	  }
	  catch(CloneNotSupportedException ex)
	  {
		  ex.printStackTrace();
	  }
	  
	  c.list = new ArrayList<>(list);
	  return c;
	  
  }

  @Override /** Override the toString in the Object class */
  public String toString() {
    return "stack: " + list.toString();
  }
}
