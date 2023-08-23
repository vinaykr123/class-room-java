class student() 
{
	int roll,marks;
    String name;
	//void input()
	{ 
		System.out.println("enter the roll ,name & maarks");
	}
}
class vinay extends student
{
	void disp()
	{
		roll=1;
		name=vinay;
		marks=89;
		System.out.println(roll+" "+marks+" "+name);
	}
}

public class inheritance {
	public static void main(String[] args)
	{
		vinay v=new vinay();
		v.input();
		v.disp();
	}

}
