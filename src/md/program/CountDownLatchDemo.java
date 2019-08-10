package md.program;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.ArrayList;
import java.util.List;
public class CountDownLatchDemo {

	public static void main(String[] args) {
		CountDownLatch countDownLatch= new CountDownLatch(3);
		CountDownTask countDownTasservie1= new CountDownTask(countDownLatch, "Data base service");
		CountDownTask countDownTasservie2= new CountDownTask(countDownLatch, "Network base service");
		CountDownTask countDownTasservie3= new CountDownTask(countDownLatch, "Internet base service");
		List<CountDownTask> task= new ArrayList<>();
		task.add(countDownTasservie1);
		task.add(countDownTasservie2);
		task.add(countDownTasservie3);
		
        ExecutorService executorService= Executors.newFixedThreadPool(task.size());
        for(CountDownTask countDownTask:task){
        	executorService.execute(countDownTask);
        }
	}

}

class CountDownTask implements Runnable{ 
	private CountDownLatch countDownLatch;
	private String service;
	
	CountDownTask (CountDownLatch countDownLatch, String service){
		this.countDownLatch=countDownLatch;
		this.service=service;
	}

	@Override
	public void run() {
	   System.out.println(service +" serive is up" );
	   countDownLatch.countDown();
	}
	
}