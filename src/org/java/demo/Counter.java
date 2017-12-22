package org.java.demo;

public class Counter {
	
	private static int i =0;
	
	
	/**
	 * 用两个线程来访问该方法，判断，哪一个是第一个访问该方法的线程，哪一个是第二个访问该方法的线程
	 * @param threadName
	 */
	public  void show(String threadName){
		
		System.out.println("33333333333333333");
		
		synchronized (this) {
			
			i++;//次数加1 
			System.out.println(threadName+",你是第"+i+"个访问该方法的线程");
		}
	
	}

}
