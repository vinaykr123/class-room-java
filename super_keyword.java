/*class A
{
	int a=123;
	}
class B //extends A
{
	int a=20;
	void show()
	{
		System.out.println("a");
		//System.out.println("super.a");
	}
	}
public class super_keyword extends B 
{

	/*public super_keyword() {
	}

	public static void main(String[] args)
	{
		B.n=new B();
		n.show();        
	}

}*/
class Animal { // Superclass (parent)
  public void animalSound() {
	  //int n=10;
    System.out.println("The animal makes a sound");
  }
}

class Dog extends Animal { // Subclass (child)
  public void animalSound() {
	 int n=20;
    super.animalSound(); // Call the superclass method
    System.out.println("The dog says: bow wow");
    System.out.println(n);
    //int b=super.n;
    //System.out.println(b);
    
  }
}

public class super_keyword {
  public static void main(String args[]) {
    Animal myDog = new Dog(); // Create a Dog object
    myDog.animalSound(); // Call the method on the Dog object
  }
}