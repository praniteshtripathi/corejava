package rnd.program;

public class ReverseString {
    public static void main(String args[]){
        System.out.println(rev2("abc"));
    }
 /*
    recursive reverse string
  */
    public static String rev1(String str){
        if(str.isEmpty()||str.isBlank()){
            return str;
        }

        return rev1(str.substring(1))+str.charAt(0);
    }
    // reverse string without any method

    public static String rev2(String str){
       char chArr[]= str.toCharArray();
       int len= chArr.length;
       int j=len-1;
       for(int i=0;i<len/2;i++){
           char c=chArr[i];
          chArr[i]=chArr[j];
           chArr[j]=c;
           j--;
       }
     return new String(chArr);
    }
}
