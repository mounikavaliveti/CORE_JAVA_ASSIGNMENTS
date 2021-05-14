
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> n=new HashSet<>();
		n.add("carrot");
		n.add("beans");
		n.add("dosa");
		n.add("briyani");
		
		System.out.println("Unorderd "+n);
		
		LinkedHashSet<String> ln=new LinkedHashSet<String>();
		ln.add("carrot");
		ln.add("beans");
		ln.add("dosa");
		ln.add("briyani");		
		System.out.println("Orderd "+ln);
		
	}

}
