package rnd.program.LRU.BySet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRU {

    Set<Integer> cache;
    int capacity;

    public LRU(int capacity)
    {
        this.cache = new LinkedHashSet<Integer>(capacity);
        this.capacity = capacity;
    }

    public boolean get(int key){

        if (!cache.contains(key))
            return false;
        cache.remove(key);
        cache.add(key);
        return true;
    }

    public void get_Value(int key)
    {
        if (get(key) == false)
            put(key);
    }

    public void put(int key)
    {

        if (cache.size() == capacity) {
            int firstKey = cache.iterator().next();
            cache.remove(firstKey);
        }

        cache.add(key);
    }

    public void display()
    {
        LinkedList<Integer> list = new LinkedList<>(cache);
        Iterator<Integer> itr = list.descendingIterator();

        while (itr.hasNext())
            System.out.print(itr.next() + " ");
    }
    public static void main(String[] args){

        LRU obj = new LRU(4);
        obj.get_Value(4);
        obj.get_Value(5);
        obj.get_Value(6);
        obj.get_Value(4);
        obj.get_Value(7);
        obj.get_Value(5);
        obj.display();
    }
}
