
abstract class animal{
	void legs() {
		System.out.println("all animal have the 4 legs");
	}
	abstract void sound();
	abstract void eat();
	
}
class dogs extends animal{
	//@override
	
	void sound() {
		System.out.println("bow.. bow..");
	}
	void eat()
	{
		System.out.println("meat eating");
	}
}
class cow extends animal{
	void sound() {
		System.out.println("Oooo.. ooo..");
	}
	void eat()
	{
		System.out.println("grass eating");
	}
}
public class abtract_class {
	

	public static void main(String[] args) {
		dogs d=new dogs();
		cow c=new cow();
		d.sound();

		d.eat();
		c.sound();
		c.eat();
		d.legs();
		// TODO Auto-generated method stub

	}

}
