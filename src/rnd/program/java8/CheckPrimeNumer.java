package rnd.program.java8;

import java.util.stream.IntStream;

class CheckPrimeNumber {
    public static void main(String args[]){
    // print prime No. between 0 to 100;
        IntStream.range(1,100).filter(n->isPrime(n)).forEach(System.out::println);
    }

    public static boolean isPrime(int n){
        if(n==0||n==1)
            return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

}
