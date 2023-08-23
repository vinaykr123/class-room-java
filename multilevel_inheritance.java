
                //multilevel inheritance 

import java.util.*;
class A{
	int a,b,c;

	void add() {
		System.out.println("enter the value");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("addition"+c);
	}
	void sub() {
		System.out.println("enter the value");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=a-b;
		System.out.println("substraction"+c);
	}
}
class B extends A
{
	void mul() {
		System.out.println("enter the value");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=a*b;
		System.out.println("multiplication"+c);
	}
	void div() {
		System.out.println("enter the value");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=a/b;
		System.out.println("division"+c);
	}
	}
class C extends B{
	void rem() {
		System.out.println("enter the value");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=a%b;
		System.out.println("remainder"+c);
	}
}
public class multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 addition");
		System.out.println("2 subtraction");
		System.out.println("3 multiplication");
		System.out.println("4 division");
		System.out.println("5 remaider");
		
		System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		C n=new C();
		switch(ch)
		{
		case 1: n.add();
		break;
		case 2: n.sub();
		break;
		case 3: n.mul();
		break;
		case 4: n.div();
		break;
		case 5: n.rem();
		break;
		default:System.out.println("invalid choice");
		}
		
		

	}

}
