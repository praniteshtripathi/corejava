package rnd.program.java8;

import java.util.stream.Stream;

public class Palindrome {
    public static void main(String args[]){
     String str="This is a madam . Madam is going market";
        Stream.of(str.split(" ")).filter(v->isPalindrome(v)).forEach(System.out::println);
    }
    public static boolean isPalindrome(String str){
        char [] chArr= str.toCharArray();
        int len=chArr.length;
        int j=len-1;
        for(int i=0;i<len/2;i++,j--){
            if(chArr[i]!=chArr[j]){
                return false;
            }
        }
        if(len==1)
            return false;
        else
            return true;
    }
}
