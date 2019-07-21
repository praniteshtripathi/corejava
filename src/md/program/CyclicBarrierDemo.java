package md.program;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		
		
		CyclicBarrier barrier= new CyclicBarrier(2,new Runnable() {
			@Override
			public void run() {
			  System.out.println("-------All service Executed--------------");
			}
		});
		
		 CyclicBarrerTask barrerTask= new CyclicBarrerTask(barrier," reading ");
		Thread t1= new Thread(()->{
			barrerTask.doService();
		});
		t1.start();
		
		 CyclicBarrerTask barrerTask1= new CyclicBarrerTask(barrier," writting ");
			Thread t2= new Thread(()->{
				barrerTask1.doService();
			});
			t2.start();
			barrier.reset();
			
	}
	
}


class CyclicBarrerTask{
		private CyclicBarrier barrier;
		String task;
		CyclicBarrerTask(CyclicBarrier barrier,String task){
			this.barrier=barrier;
			this.task=task;
		}
		
		public void doService(){
			System.out.println("service up"+task);
			try {
				barrier.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}