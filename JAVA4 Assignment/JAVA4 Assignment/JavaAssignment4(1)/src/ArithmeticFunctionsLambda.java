

interface Add{
	int add(int x,int y, int z);
}

interface Subtract{
	int sub(int x,int y);
}

interface Multiply{
	int mul(int x,int y, int z);
}

interface Divide{
	int div(int x,int y);
}



public class ArithmeticFunctionsLambda {

	public static void main(String[] args) {
		
		
		Add add = (a,b,c) -> a+b+c;
		System.out.println(add.add(30,40,50));
		
		Subtract sub = (a,b) -> a-b;
		System.out.println(sub.sub(30,20));
		
		Multiply mul = (a,b,c) -> a*b*c;
		System.out.println(mul.mul(6,2,3));
		
		Divide divFunction = (a,b) -> a/b;
		System.out.println(divFunction.div(10,5));
		

	}

}
