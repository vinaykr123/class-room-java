import java.io.File;

public class file_creat {

	public static void main(String[] args) throws Exception {
		File f=new File("C:\\\\Users\\\\LENOVO\\\\Desktop\\\\java\\\\LC.txt"); 
		if(f.createNewFile())
		{
			System.out.println("file successfully create...");
		}
		else
		{
			System.out.println("file already exist...");
		}

	}

}
