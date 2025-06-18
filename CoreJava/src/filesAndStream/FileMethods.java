package filesAndStream;

import java.io.File;
import java.io.IOException;

public class FileMethods {

	public static void main(String[] args) {
		
		File f = new File("Image.txt");
		try {
			
			if(f.createNewFile()) 
			{
				System.out.println("File Created ");
				System.out.println("File Name : " +f.getName());
				
			}
			else if(f.exists())
			{
				System.out.println("File Already created ");
				System.out.println("Is file read : " + f.canRead());
				System.out.println("Is file write : " + f.canWrite());
				System.out.println("File Absolute path : " + f.getAbsolutePath());
				System.out.println("File Length : " + f.length());
				System.out.println("Is File :" + f.isFile());
				System.out.println("File Hidden : " + f.isHidden());
				System.out.println("File deleted : "+ f.delete());
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*File f1 = new File("D:\\eclipse_workspace\\CoreJava\\Image1.txt");
		try {
			
			if(f1.createNewFile())
				System.out.println("File Created ");
			else if(f1.exists())
				System.out.println("File Already created ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f1.getAbsolutePath());*/
		
		
		
		
		
	}

}
