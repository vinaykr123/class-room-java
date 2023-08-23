/*
public class thiskeyword {
	int a;
	thiskeyword(int a)
	{
		this.a=a;//compiler is confused because compiler cannot understand which a is local or instance
	}//then integer default value is 0 then use thiskeyword
	void show()
	{
		System.out.println(a);
		
	}
	
	public static void main(String[] args) 
	{
		thiskeyword r=new thiskeyword(100);
		r.show();
		
	}

}
*/
public class thiskeyword
{
	thiskeyword()
	{
		System.out.println("learn Java");
	}
	thiskeyword(int a)
	{
		this();// thiskeyword call above default constructor
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		thiskeyword t =new thiskeyword(100);
	}
	
}
