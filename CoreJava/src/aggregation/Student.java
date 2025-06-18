package aggregation;

public class Student {

	int rollno;
	String name;
	Aggregation adr;
	
	public Student(int rollno, String name, Aggregation adr) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", adr=" + adr + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation adr = new Aggregation("Chennai", "TamilNadu", "India"); 
		Student s1 = new Student(101, "Siva", adr);
		Student s2 = new Student(102, "Yuvan", adr);
		Student s3 = new Student(103, "Gowsi", adr);
		System.out.println(adr);
		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
