package org.java.demo;

public class Counter {
	
	private static int i =0;
	
	
	/**
	 * �������߳������ʸ÷������жϣ���һ���ǵ�һ�����ʸ÷������̣߳���һ���ǵڶ������ʸ÷������߳�
	 * @param threadName
	 */
	public  void show(String threadName){
		
		System.out.println("33333333333333333");
		
		synchronized (this) {
			
			i++;//������1 
			System.out.println(threadName+",���ǵ�"+i+"�����ʸ÷������߳�");
		}
	
	}

}
