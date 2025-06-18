package callByValueAndCallByReference;

public class callByValue {

	void change(int x) {
		++x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		callByValue obj = new callByValue();
		System.out.println("Before change x = " + x);
		obj.change(x);
		System.out.println("After change x = " + x);
		
	}
	

}
