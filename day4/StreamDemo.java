package blockingqueue;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
class Employee{
	int id;String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}
public class StreamDemo {
	public static void main(String[] args) {
		
	
	  Employee[] arrayOfEmps = {
		    new Employee(1, "Jeff Bezos", 100000.0), 
		    new Employee(2, "Bill Gates", 200000.0), 
		    new Employee(3, "Mark Zuckerberg", 300000.0)
		};

	   List<Employee> empList = Arrays.asList(arrayOfEmps);
	   
	   Stream.generate(Math::random)
	      .limit(50)
	      .forEach(System.out::println);


	   
	   Stream<Integer> evenNumStream = Stream.iterate(2, i -> i * 2);

	    List<Integer> collect = evenNumStream
	      .limit(5)
	      .collect(Collectors.toList());
	    collect.forEach(System.out::println);

	    String[] words = {
	    	      "hello", 
	    	      "refer",
	    	      "world",
	    	      "level"
	    	    };
	    	    
	    	    try (PrintWriter pw = new PrintWriter(
	    	      Files.newBufferedWriter(Paths.get("d:\\abc.txt")))) {
	    	        Stream.of(words).forEach(pw::println);
	    	    }
	    	    catch(IOException e) {}

	    
	    
}
}
