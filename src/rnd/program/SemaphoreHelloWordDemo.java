package rnd.program;

import java.util.concurrent.Semaphore;

public class SemaphoreHelloWordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task= new Task();
		Thread h= new Thread(()->{
			for(int i=0;i<=5;i++){
				task.hello();
				
			}
			
		}, "Hello Thread ->");
		
		Thread w= new Thread(()->{
			for(int i=0;i<=5;i++){
				task.word();
			}
			
		}, "Word Thread ->");
		
		h.start();
		w.start();
		
	}

}

class Task{
	private static Semaphore word= new Semaphore(0);
	private static Semaphore hello= new Semaphore(1);
	public void hello(){
		try{
			hello.acquire();
			System.out.println(Thread.currentThread().getName()+" hello");
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		word.release();
		
		
	}
	
	
	public void word(){
		try{
			word.acquire();
			System.out.println(Thread.currentThread().getName()+ "word");
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		hello.release();
		
	}
	
}