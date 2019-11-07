package queue.simple;

import queue.simple.poison.ConsumerPoison;
import queue.simple.poison.ProducerPoison;
import queue.simple.raw.Consumer;
import queue.simple.raw.Producer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

     //   new Thread(new Producer(queue)).start();
     //   new Thread(new Consumer(queue)).start();

        Integer poison = -1;
        new Thread(new ProducerPoison(queue, poison)).start();
        new Thread(new ProducerPoison(queue, poison)).start();

        new Thread(new ConsumerPoison(queue, poison)).start();
        new Thread(new ConsumerPoison(queue, poison)).start();

    }

}
