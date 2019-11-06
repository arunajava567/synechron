package forkjoin;

import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {

        System.out.println(ForkJoinAdd.startForkJoinSum(100));
System.out.println();
       ForkJoinFibonacci task = new ForkJoinFibonacci(50);
        new ForkJoinPool().invoke(task);

        System.out.println(task.getNumber());

    }

}
