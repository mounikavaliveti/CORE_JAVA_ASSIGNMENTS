
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Failsafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<Object> n=new HashSet();
		
		n.add("Hash");
		n.add("Hide");
		n.add(25);
		n.add(55);

		Iterator i=n.iterator();
		 while(i.hasNext())
		   {
			   
			   Object a=i.next();
			   n.add("Jerry");
			   System.out.println(a); 
		   }
	}
}
