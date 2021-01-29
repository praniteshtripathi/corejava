package rnd.program;

public class test {
	public static void main(String args[]) 
    { 
        //String str = "word1, word2 word3@word4?word5.word6"; 
        //String[] arrOfStr = str.split("[, ?.@]+"); 
		String str = "Park1&&Park2?Park3||Park4"; 
		String st2;
		if (str.contains("||") ) {
			st2=str.replace("||", "&&");
		}
			else
		{
			st2=str;
		}
        String[] arrOfStr = st2.split("&&"); 
        
        int count=0;
        for (String a : arrOfStr) {
        	
            System.out.println(a); 
            System.out.println(count);
            count++;
        }
       } 
}
