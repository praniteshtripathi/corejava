package md.program;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;

public class EvenOddPrintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventOddPrintTask task= new EventOddPrintTask();
		Thread h= new Thread(()->{
			for(int i=2;i<=10;i++){
				if(i%2!=0)
				   task.odd(i);
			}
			
		}, "odd Thread ->");
		
		Thread w= new Thread(()->{
			for(int i=2;i<=10;i++){
				if(i%2==0)
				  task.even(i);
			}
			
		}, "even Thread ->");
		
		Thread print= new Thread(()->{
			for(int i=2;i<=10;i++){
				task.print();
			}
			
		}, "print Thread ->");
		
		
		h.start();
		w.start();
		print.start();
		
		
		
	}
}




class EventOddPrintTask{
	private static Semaphore odd= new Semaphore(0);
	private static Semaphore even= new Semaphore(1);
	BlockingQueue<Integer> blockingDeque= new SynchronousQueue<>();
	public void odd(int oddNo){
		try{
			odd.acquire();
			blockingDeque.put(oddNo);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		even.release();		
	}
	public void even(int evenNo){
		try{
			even.acquire();
			blockingDeque.put(evenNo);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		odd.release();
		
	}
	
	public void print(){
		try {
			System.out.println("Item in queue is :"+blockingDeque.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
