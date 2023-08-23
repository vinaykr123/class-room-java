          //overridide
class shape
{
	void draw() {
		System.out.println("can't say shape type");
	}
	}
class square extends shape
{
	//@override
	
	void draw() {
		super.draw();
		System.out.println("square");
	}
	}
public class method_overriding {

	public static void main(String[] args) {
	
		square s=new square();
		s.draw();
		
		// TODO Auto-generated method stub

	}

}
