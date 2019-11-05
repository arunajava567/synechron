package examples.sequence;

import examples.sequence.generator.AtomicSequenceGenerator;
import examples.sequence.generator.SequenceGenerator;
import examples.sequence.generator.SyncSequenceGenerator;
import examples.sequence.generator.UnSafeSequenceGenerator;

import java.util.List;
import java.util.concurrent.*;
public class Main {

    public static void main(String[] args) {

       // SequenceGenerator sequenceGenerator = new UnSafeSequenceGenerator();
       //SequenceGenerator sequenceGenerator = new SyncSequenceGenerator();
        SequenceGenerator sequenceGenerator = new AtomicSequenceGenerator();

        ExecutorService executor = Executors.newCachedThreadPool();

        try {

            Callable<List<Long>> task1 = new PrintSequenceCallable(sequenceGenerator);
            Callable<List<Long>> task2 = new PrintSequenceCallable(sequenceGenerator);
            Callable<List<Long>> task3 = new PrintSequenceCallable(sequenceGenerator);

            Future f1 = executor.submit(task1);
            Future f2 = executor.submit(task2);
            Future f3 = executor.submit(task3);

            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

    }

}