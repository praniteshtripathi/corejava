package rnd.designpattern;

import java.io.Serializable;

public class SingletonDemo implements Cloneable, Serializable {
    private static SingletonDemo singletonDemo= null;

    private SingletonDemo(){
    }
    private static SingletonDemo getInstance(){
        if(singletonDemo==null){
            synchronized (SingletonDemo.class){
                if(singletonDemo==null){
                    singletonDemo= new SingletonDemo();
                }
            }
        }
        return singletonDemo;
    }
    public SingletonDemo clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
    protected Object readResolve()
    {
        return singletonDemo;
    }
}
