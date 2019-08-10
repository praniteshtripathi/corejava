package rnd.program;

import java.util.HashMap;
import java.util.Map;
public class FirstNonRepatableCharDemo1 {

	public static void main(String[] args) {
		try{
			System.out.println(findFirstNonRepeatable("google"));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Character findFirstNonRepeatable(String str) throws Exception{
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		for(Character ch:str.toCharArray()){
			map.put(ch, map.containsKey(ch)?map.get(ch)+1:1);
		}
		
		boolean isNotRepeatedCharacterPresent=false;
		for(Character ch:str.toCharArray()){
	
			if(map.get(ch)==1){
				isNotRepeatedCharacterPresent=true;
				return ch;
			}
		}
		  if(isNotRepeatedCharacterPresent==false){
			  throw new Exception("No Not Repeated characte found");
		  }
		
		return null;
	}
}
