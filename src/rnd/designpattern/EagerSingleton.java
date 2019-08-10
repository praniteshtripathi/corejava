package rnd.designpattern;

public class EagerSingleton {
	public static void main(String args[]){
		EagerSingleton eagerSingleton1=EagerSingleton.getInstance();
		eagerSingleton1.getMessage();
		EagerSingleton eagerSingleton2=EagerSingleton.getInstance();
		System.out.println(eagerSingleton1==eagerSingleton2);
		
	}
	
    private static volatile EagerSingleton instance = new EagerSingleton();
 
    // private constructor
    private EagerSingleton() {
    }
 
    public static EagerSingleton getInstance() {
        return instance;
    }
    public  void getMessage(){
    	System.out.println("---------EagerSingleton--------------");
    }
}