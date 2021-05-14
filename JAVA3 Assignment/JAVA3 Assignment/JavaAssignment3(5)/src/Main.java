

//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Set;
import java.util.Map.Entry;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee(1009,"mouni",30000,"mouni@ok.com");
		Employee e2=new Employee(1020,"Raj",50000,"raj@ok.com");
		Employee e3=new Employee(1005,"Kishan",20000,"kishan@ok.com");
		Employee e4=new Employee(1010,"ravi",80000,"ravi@ok.com");
		
		Department d1 = new Department(10001,"IT","Hyderabad");
		Department d2 = new Department(10003,"ECE","Haryana"); 
		
		Map<Employee,Department> empDeptMap = new HashMap<>();
		empDeptMap.put(e1, d1);
		empDeptMap.put(e2, d2);
		empDeptMap.put(e3, d1);
		empDeptMap.put(e4, d2);
		
		Set<Entry<Employee,Department>> entrySet = empDeptMap.entrySet();
		Iterator<Entry<Employee,Department>>iterator= entrySet.iterator();
		
		for(Entry<Employee,Department> entry:entrySet) {
			Employee employee = entry.getKey();
			Department department = entry.getValue();
			
			System.out.println(employee);
			System.out.println(department);
			
		}
		
		
		
	}

}
