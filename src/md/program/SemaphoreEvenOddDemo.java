package md.program;

import java.util.concurrent.Semaphore;
//Thread print even odd alternatively
public class SemaphoreEvenOddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOddTask task= new EvenOddTask();
		Thread h= new Thread(()->{
			for(int i=0;i<=5;i++){
				task.odd();
				
			}
			
		}, "odd Thread ->");
		
		Thread w= new Thread(()->{
			for(int i=0;i<=5;i++){
				task.even();
			}
			
		}, "even Thread ->");
		
		h.start();
		w.start();
		
	}

}

class EvenOddTask{
	private static Semaphore odd= new Semaphore(0);
	private static Semaphore even= new Semaphore(1);
	public void odd(){
		try{
			odd.acquire();
			System.out.println(Thread.currentThread().getName()+" odd");
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		even.release();
		
		
	}
	
	
	public void even(){
		try{
			even.acquire();
			System.out.println(Thread.currentThread().getName()+ "even");
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		odd.release();
		
	}
	
}