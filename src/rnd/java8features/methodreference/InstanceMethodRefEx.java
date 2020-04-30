package rnd.java8features.methodreference;

public class InstanceMethodRefEx {

	public void myMethod(){  
		System.out.println("Instance Method");  
	    }  
	    public static void main(String[] args) {  
	    	InstanceMethodRefEx obj = new InstanceMethodRefEx();   
		// Method reference using the object of the class
		MyInterface ref = obj::myMethod;  
		// Calling the method of functional interface  
		ref.display();  
	    }  

}
//@FunctionalInterface 
interface MyInterface{  
    void display();  
} 