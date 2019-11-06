package semaphores;
public class SemaphoreExample1
{
   public static void main(String[] args)
   {
      PrinterQueue1 printerQueue = new PrinterQueue1();
      Thread thread[] = new Thread[10];
      for (int i = 0; i < 10; i++)
      {
         thread[i] = new Thread(new PrinterJob1(printerQueue), "Thread " + i);
      }
      for (int i = 0; i < 10; i++)
      {
         thread[i].start();
      }
   }
}
