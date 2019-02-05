import java.util.ArrayList;

public class C11_10_Stack extends ArrayList<String> {
	
	public C11_10_Stack()
	{
		
	}

	public boolean isEmpty2()
	{
		return isEmpty();
	}
	
	public int getSize()
	{
		return size();
	}
	
	public String peek()
	{
		return get(getSize() - 1);
	}
	
	public String pop() {
		return remove(getSize() - 1);
	}
	
	public String push(String str)
	{
		add(str);
		return str;
	}
	
	@Override
	public String toString()
	{
		return "stack: " + toString();
	}
}
