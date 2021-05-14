
public class Main {

	public static void main(String[] args) 
	{
		Manager m1 = new Manager("Mounika", 15000,1200,100);
		Manager m2 = new Manager("Sharanya", 8000,400,800);
		System.out.println("salary of emp  "+m1.name+" is :"+m1.getIncentive());
		System.out.println("salary of emp  "+m2.name+" is :"+m2.getIncentive());
		System.out.println();
		Labour l1 = new Labour("Kishan",800);
		Labour l2 = new Labour("Raju", 90);
		System.out.println("overtime of labour  "+l1.name+" is :"+l1.getOverTime());
		System.out.println("overtime of labour  "+l2.name+" is :"+l2.getOverTime());
	}

}
