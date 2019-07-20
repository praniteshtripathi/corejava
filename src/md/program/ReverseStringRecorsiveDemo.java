package md.program;

public class ReverseStringRecorsiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(revStrRecursive("1234"));


	}

	public static String revStrRecursive(String str){
		if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return revStrRecursive(str.substring(1)) + str.charAt(0);
	}
}
