package methodOverriding;

public class MainMethod {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.moving();
		
		Dog d = new Dog();
		d.moving();
		
		Snake s = new Snake();
		s.moving();
		
	}

}
