
public class constructor {
	int a; String name;

	/*public constructor() {
		a=0; name= null;
		//System.out.println(a+ "  " +name);
	}*/
	
	// without contructor got same output that means compiler creat a one type of default constructor
    void show()
    {
    	System.out.println(++a + "  " +name);
    }
	public static void main(String[] args) {
		constructor ref = new constructor();
       ref.show();
	}

}
