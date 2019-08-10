package rnd.designpattern;

public class LazySingleton  implements Cloneable {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		LazySingleton lazySingleton2=LazySingleton.getInstance();
		
		LazySingleton lazySingleton1=LazySingleton.getInstance();
		System.out.println(lazySingleton1==lazySingleton1);
		
	}
	
	private static volatile LazySingleton instance = null;
	 
    // private constructor
    private LazySingleton() throws Exception {
    	if(instance!=null){
    		throw  new Exception();
    	}
    }
 
    public static LazySingleton getInstance() throws Exception {
        if (instance == null) {
            synchronized (LazySingleton.class) {
            	if (instance == null) {
            			instance = new LazySingleton();
            	}
            }
        }
        return instance;
    }

    public Object clone() throws CloneNotSupportedException {
    	return new  CloneNotSupportedException("Clone not allowed");
    }
    
    public Object readResolve(){
    	return instance;
    }
}
