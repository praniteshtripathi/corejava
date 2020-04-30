package rnd.java8features.methodreference;

public class MethodRefToConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyInterface1 ref = Hello::new;  
	        ref.display("Hello World!");  
	}

}
@FunctionalInterface 
interface MyInterface1{  
    Hello display(String say);  
}  
class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
}  