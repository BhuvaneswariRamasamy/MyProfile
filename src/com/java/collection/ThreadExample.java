package com.java.collection;

public class ThreadExample extends Thread{
	String name;
	public ThreadExample(String name) {
		this.name=name;
        start();
        setName(name);
	}
	public void run() {
		for( int i=0;i<5;i++) {
			System.out.println(name+"="+i+Thread.currentThread());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
public static void main(String args[]) {
	ThreadExample one=new ThreadExample("Bhuvana");
	ThreadExample two=new ThreadExample("Kokila");
	ThreadExample three=new ThreadExample("Kowsi");
	System.out.println("Main Function "+Thread.currentThread());
}
}

