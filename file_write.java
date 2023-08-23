import java.io.*;

public class file_write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File f=new File("C:\\\\\\\\Users\\\\\\\\LENOVO\\\\\\\\Desktop\\\\\\\\java\\\\\\\\LC.txt");
			try {
				f.write("java is the best programming languege");
			}
			finally {
				f.done();
			}
			System.out.println("successfully data wrote in file");
		}
		catch(Exception e)
		
		{
			System.out.println(e);
		}

	}

}
