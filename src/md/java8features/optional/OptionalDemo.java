package md.java8features.optional;
import java.util.Optional; 
public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="this is my first string";
		String str = null;
		Optional <String> strval=Optional.empty();
		if(strval.isPresent()){
			System.out.println("value is not null");
		}else{
			System.out.print("null value");
		}
     	
	}

}
