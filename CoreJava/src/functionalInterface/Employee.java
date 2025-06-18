package functionalInterface;

public class Employee {
	String name;
	int id;
	String Designation;
	double salary;
	
	public Employee(String name, int id, String designation, double salary) {
		
		this.name = name;
		this.id = id;
		this.Designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Designation=" + Designation + ", salary=" + salary + "]";
	}
}
