                 //compile time polymorphism

public class method_overloading
{
	void add() {
		int a=10, b=20;
		int c=a+b;
		System.out.println(c);
		
	}
	void add(int x,int y) {
		//int x=10, y=20;
		int c=x+y;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_overloading m=new method_overloading();
		m.add();

		m.add(12, 20);
	}

}
