
interface vehical
{
	String name="TVS"; //public+static+final		
	int Speed=100; ///public+static+final
	void start(); //public + abstract
	void stod(); //public +abstract
	 void color()
	{
		System.out.println("TVS color is red");
	}
	
}
class customer implements vehical {
	//@override
	public void start() {
		System.out.println("Start():instert key & press start button");
	}
	public void stop() {
		System.out.println("Stop():exit key ");
	}
}
public class interface_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		customer c=new customer();
		System.out.println(c.Speed);
		System.out.println(c.name);
		c.start();
		c.stop();
		//vehical.color;
		//c.color();

	}

}
