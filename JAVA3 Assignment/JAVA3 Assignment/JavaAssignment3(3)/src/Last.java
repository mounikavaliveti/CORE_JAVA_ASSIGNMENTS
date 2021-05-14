
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
public class Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Object> n=new ArrayList<>();
		

		n.add("carrot");
		n.add("Beetroot");
		n.add("Cabbage");
		n.add("Spinach");
		n.add(3);
		
		System.out.println(n);
		
		ListIterator<Object>  l= n.listIterator(n.size());
		
		while(l.hasPrevious())
		{
			Object s=l.previous();
			System.out.println(s);
				}
	}
}
