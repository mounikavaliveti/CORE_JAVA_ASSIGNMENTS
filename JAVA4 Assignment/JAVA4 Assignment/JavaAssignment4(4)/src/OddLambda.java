
import java.util.ArrayList;
import java.util.List;

public class OddLambda {
	public static void main(String[] args) {
		List<String> ls= new ArrayList<>();
		ls.add("mouni");
		ls.add("monu");
		ls.add("sharanya");
		ls.add("mohan");
		ls.add("akil");
		ls.add("kittu");
		
		ls.forEach(i -> {  
            if (i.length() % 2 == 0) { //check for even length of string  
                System.out.println(i); 
		
            }  
        });  
    }  
} 