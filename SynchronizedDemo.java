class Display
{

 public  synchronized void wish(String name)
 {

   for(int i=0;i<10;i++)
   {

   System.out.print("good morning  ");

    try
    {
     Thread.sleep(1000);

    }catch(InterruptedException ie)
     {}

    System.out.println(name);

   }//for

 }//wish

}

class MyThread112 extends Thread
{
 Display d;
 String name;

  MyThread112(Display d, String name)
  {

   this.d=d;

   this.name=name;
  }

  public void run()
  {

   d.wish(name);

  }
}

class SynchronizedDemo
{

  public static void main(String args[])
  {

   Display d= new Display();

  MyThread112 t1= new MyThread112(d,"Raj");

  MyThread112 t2= new MyThread112(d,"Ravi");

    t1.start();

    t2.start();

   }

}