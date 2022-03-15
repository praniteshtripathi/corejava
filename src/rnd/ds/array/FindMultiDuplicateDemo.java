package rnd.ds.array;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindMultiDuplicateDemo {
    public static void main(String[] args){
        int []n={2,4,5,2,6,7,6,3,2};
        Set<Integer> duplicate=new LinkedHashSet<>();
        for(int i=0;i<n.length-1;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i]==n[j]){
                    duplicate.add(n[i]);
                    System.out.println("duplicate added "+n[i]);
                }
            }
        }
        int []data=duplicate.stream().mapToInt(x->x).toArray();
        for (int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }

    }
}
