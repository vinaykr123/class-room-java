
public class variable {
	int a=10; //intance variable
	static double b=20.5;//static variable because we r using static keywords if not uses statics keyword then means intance variable

	public static void main(String[] args)
	{
		boolean c =true; //local variable
		//if we want to access intance variable then we should class object
		// and local and static variable dont should object
		variable s = new variable(); //object
		System.out.println(s.a);//intance variable aaccess this type
		System.out.println(b);
		System.out.println(c);
	}

}
