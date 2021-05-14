

import java.util.Scanner;
public class ShopeDetails {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter you role");
	String role=sc.nextLine();
	if(role.equalsIgnoreCase("Customer"))
			{
				System.out.println("Enter the item you want to buy : Cookies/Candy/Ice Cream");
				String item=sc.nextLine();
				System.out.println("Enter the quantity of item you want to buy: ");
				float quan=sc.nextFloat();
				if(item.equalsIgnoreCase("Candy"))
				{
					ChocoCandy c=new ChocoCandy(quan);
					System.out.println("Your bill is :"+c.getcost());
				}
				else if(item.equalsIgnoreCase("Cookies"))
				{
					DeleciousCookies co=new DeleciousCookies(quan);
					System.out.println("Your bill is :"+co.getcost());
				}
				else if(item.equalsIgnoreCase("IceCream"))
				{
					CoolIceCream ic=new CoolIceCream(quan);
					System.out.println("Your bill is :"+ic.getcost());
				}

			}
			if(role.equalsIgnoreCase("Owner"))
			{
				System.out.println("Enter the item you want to store: Cookies/Candy/Ice Cream");
				String item1=sc.nextLine();
				System.out.println("Enter the quantity you want to store: ");
				int quan1=sc.nextInt();
				System.out.println("You stored " +quan1+ " "+ item1);
			}


	}

}
