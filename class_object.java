//person common quality
import java.util.*;
public class class_object {
	//System.out.println("enter the age");
	//System.out.println("enter the weight");
	//System.out.println("enter the color");
	Scanner s= new Scanner(System.in);
	//System.out.println("enter the age");
	int age=s.nextInt();
	int weight=s.nextInt();
	String color =s.nextLine();
	void eat()
	{
		System.out.println("i am eating");
	}
	void sleep()
	{
		System.out.println("i am sleeping");
	}

	public static void main(String[] args) {
		class_object p = new class_object();
		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.color);
		p.eat();
		p.sleep();
		
		

	}

}
