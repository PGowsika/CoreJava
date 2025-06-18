package callByValueAndCallByReference;

public class callByReference {
	int x= 10;
	void change(callByReference n) {
		n.x = n.x + 100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x = 20;
		callByReference obj = new callByReference();
		System.out.println("Before change x = " + obj.x);
		obj.change(obj);
		System.out.println("After change x = " + obj.x);
		
	}
}
