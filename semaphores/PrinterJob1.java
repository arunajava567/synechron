package semaphores;
class PrinterJob1 implements Runnable
{
   private PrinterQueue1 printerQueue;
 
   public PrinterJob1(PrinterQueue1 printerQueue)
   {
      this.printerQueue = printerQueue;
   }
 
   @Override
   public void run()
   {
      System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
      printerQueue.printJob(new Object());
   }
}
