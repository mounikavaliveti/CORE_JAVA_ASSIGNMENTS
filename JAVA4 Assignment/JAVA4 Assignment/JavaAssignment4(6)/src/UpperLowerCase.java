
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperLowerCase {

	public static void main(String[] args) {
		List<String> ls= new ArrayList<>(Arrays.asList("Animal","Humans","trees","oceans","Lakes","Hill"));
		System.out.println(ls);
		
		List<String> s= new ArrayList<>(); 
		s.add("Hey");
		System.out.println(s);
		ls.replaceAll(n -> n.toLowerCase()); 
		System.out.println(ls);
		ls.replaceAll(n -> n.toUpperCase()); 
		System.out.println(ls);
	

	}

}
