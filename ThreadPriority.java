class MyThread111 extends Thread{
	MyThread111(String s){
		super(s);
		start();

	}

	public void run(){
		for(int i=0;i<3;i++){
			Thread cur=Thread.currentThread();
			cur.setPriority(Thread.MAX_PRIORITY);
			int p=cur.getPriority();
			System.out.println("Thread Name  :"+Thread.currentThread().getName());
			System.out.println("Thread Priority  :"+cur);
			}

	}

}
	class MyThread21 extends Thread{
	MyThread21(String s){
		super(s);
		start();

	}

public void run(){
		for(int i=0;i<3;i++){
			Thread cur=Thread.currentThread();
			cur.setPriority(Thread.MIN_PRIORITY);
			int p=cur.getPriority();
			System.out.println("Thread Name  :"+Thread.currentThread().getName());
			System.out.println("Thread Priority  :"+cur);
			}
	}

}


public class ThreadPriority{
	public static void main(String args[]){	
		MyThread111 m1=new MyThread111("My Thread 1");
		MyThread21 m2=new MyThread21("My Thread 2");

	}

}