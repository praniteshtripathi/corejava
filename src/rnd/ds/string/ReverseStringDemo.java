package rnd.ds.string;

public class ReverseStringDemo {
    public static void main(String args[]){
        System.out.println(reverse("abcdef"));
    }

    public static String reverse(String str){
       if(str.isEmpty()){
           return str;
       }
       return reverse(str.substring(1))+str.charAt(0);
    }
}
