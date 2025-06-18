package collection;

public class Student {
	String name;
	int marks;
	int age;
	public Student(String name, int marks, int age) {
		
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		
		return marks;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student))
			return false;
		else {
			Student s1 = (Student)obj;
			return  marks == s1.marks && age == s1.age;
		}
		
	}
	

}
