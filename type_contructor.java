
public class type_contructor 
{
	int a;String s;boolean c;
	      
	                  //////default constructor
          
	/*public type_contructor() {//default constructor using for change the value that's why assume the 0's value
		a=21;
		s="vinay";
		c=true;
	}
	void show()
	{
		System.out.println(a+" "+s+" "+c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		type_contructor d=new type_contructor();
		d.show();

	}
*/
	                          //parameter constructor
	/*type_contructor(int x,String y){
		a=x;
		s=y;
		
		
		
	}
	void show()
	{
		System.out.println(a+" "+s);
	}
	public static void main(String[] args)
	{
		type_contructor e = new type_contructor(100,"vinay");
		e.show();
	}*/
	
	                         //copy constructor
	
/*	type_contructor()
	{
		a=10;
		s="learncoding";
	}
	type_contructor(type_contructor ref)
	{
		a=ref.a;
		s=ref.s;
		System.out.println(a+" "+s);
	}
	public static void main(String[] args)
	{
		type_contructor e = new type_contructor();
		type_contructor f = new type_contructor(e);
		}
	*/	

	                //private constructor 
	
	private type_contructor()
	{
		a=100;
		s="arun";
		//b=true;
		System.out.println(a+" "+s);
	}
	public static void main(String[] args)
	{
		type_contructor e = new type_contructor();
	}
	
	
	
	
	
	
	
	
	
	
	
}
