

import java.util.Scanner;
import java.util.function.Consumer;

public class OrdersDetailsLambda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order the value :");
		Integer ace= sc.nextInt();
		//int ace = 5000;
		
		Consumer<Integer> action = b-> {
			if (ace>5000) {
				System.out.println("Accepted the number"+ace);}
			else
				{System.out.println("Rejected the number" +ace);}
				
		};
	action.accept(ace);
	}
}