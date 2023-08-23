
public class strings {

	public static void main(String[] args) {
		String str="vinay";
		String str2=new String("vinay");
		int l=str.length();
		System.out.println(l);
		System.out.println(str.toUpperCase());
        if(str==str2)
        	System.out.println("both r equals");
        else
        	System.out.println("not equals");
        if(str.equals(str2))
        	System.out.println("both r equals");
        else
        	System.out.println("not equals");
        
        str.concat("kumar");
        String str3=str.concat("kumar");
        System.out.println(str);
        System.out.println(str3);//string is immutetable then want to change anything in string then we have to creat duplicate...
	}// strings is immutetable
	// 1 execution fast
	//2 storage less

}
