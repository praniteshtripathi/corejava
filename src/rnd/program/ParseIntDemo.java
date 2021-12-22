package rnd.program;

public class ParseIntDemo {
    public static void main(String args[]){
      System.out.println(parseInt("123"));

    }

    public static int parseInt(String str){
        int val = 0;

        char[] chs=str.toCharArray();
        for (char c:chs){
            if(c>='0'&&c<='9'){
                val=val*10+(c-'0');
            }else{
                throw new IllegalArgumentException("Invalid Input");
            }
        }

        return val;
    }
}
