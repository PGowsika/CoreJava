package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainMthod {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Anand", 1001, "Software Engineer", 50000);
		Employee emp2 = new Employee("Vinoth", 1002, "SOC Analyst", 100000);
		Employee emp3 = new Employee("Balaji", 1003, "Data Engineer", 150000);
		Employee emp4 = new Employee("Manoj", 1004, "Data Analyst", 70000);
		
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		
		emplist.forEach(new Consumer<Employee>() 
		{
			@Override
			public void accept(Employee t) {
				System.out.println(t);	
			}
		});
		
		System.out.println("\nConsumer using lambda Expression :");
		emplist.forEach((e)->System.out.println(e));
		
		
		System.out.println("\nSupplier interface using inner class method :");
		Supplier<String> emp = new Supplier<String>() {
			
			@Override
			public String get() {
				return "Hello";
				
			}
		};
		System.out.println(emp.get());
		
		
		
		System.out.println("\nPredicate Interface using lambda Expression for designation :");
		emplist.stream().filter(e->e.Designation.contains("Engineer")).forEach(System.out::println);
		System.out.println("\nPredicate Interface using lambda Expression for salary :");
		emplist.stream().filter(e->e.salary >= 100000).forEach(x->System.out.println(x));
		
		System.out.println("Function Interface using anonymous inner class :");
		emplist.stream().map(new Function<Employee, Integer>() {

			@Override
			public Integer apply(Employee t) {
				
				return t.name.length();
			}
			
		}).forEach(x->System.out.println(x));
		
		System.out.println("Function Interface using Lambda expression : ");
		emplist.stream().map(e->e.name.length()).forEach(x->System.out.println(x));
	}

}
