package queue.simple;
import java.util.concurrent.PriorityBlockingQueue; 
import java.util.*; 

public class ReverseDemo {
	  
	
	  
	    public static void main(String[] args) 
	    { 
	        // define capacity of PriorityBlockingQueue 
	        int capacity = 15; 
	  
	        // create object of PriorityBlockingQueue 
	        PriorityBlockingQueue<Integer> 
	            pbq 
	            = new PriorityBlockingQueue<Integer>(capacity, 
	                                                 Comparator 
	                                                     .reverseOrder()); 
	  
	        // add  numbers 
	        pbq.add(1); 
	        pbq.add(2); 
	        pbq.add(3); 
	  
	        // print queue 
	        System.out.println("PriorityBlockingQueue:"
	                           + pbq); 
	    } 
	} 