package org.java.demo;

public class MyThread implements Runnable {

	private static Counter c = new Counter();// ��������

	public static void main(String[] args) {
		MyThread obj = new MyThread();
		
		Thread t1 = new Thread(obj);
		t1.setName("A�߳�sssq");
		
		
		Thread t2 = new Thread(obj);
		t2.setName("B1111233�߳�");
	
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		c.show(Thread.currentThread().getName());
	}

}
