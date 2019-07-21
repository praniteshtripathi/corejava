package md.program;

public class FactorialDemoRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		System.out.println("factorial of: "+n+" is " +factorial(n));
	}
	
	public static int factorial(int n){
		if (n==1){
			return n;
		}
		
		return n*factorial(n-1);
	}

}
