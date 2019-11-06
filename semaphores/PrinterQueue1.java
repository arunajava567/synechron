package semaphores;

import java.util.Date;
import java.util.concurrent.Semaphore;

class PrinterQueue1
{
   private final Semaphore semaphore;
 
   public PrinterQueue1()
   {
      semaphore = new Semaphore(1);
   }
 
   public void printJob(Object document)
   {
      try
      {
         semaphore.acquire();
          
         Long duration = (long) (Math.random() * 10000);
         System.out.println(Thread.currentThread().getName() + ": PrintQueue: Printing a Job during " + (duration / 1000) + " seconds :: Time - " + new Date());
         Thread.sleep(duration);
      }
      catch (InterruptedException e)
      {
         e.printStackTrace();
      }
      finally
      {
         System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
          
         semaphore.release();
      }
   }
}
