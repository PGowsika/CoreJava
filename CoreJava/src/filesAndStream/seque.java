package filesAndStream; 
import java.io.*; 
import java.util.*; 



public class seque {

	public static void main(String args[])
	{ 
		try {
		//creating the FileInputStream objects for all the following files 
		FileInputStream fin=new FileInputStream("D:\\eclipse_workspace\\CoreJava\\src\\filesAndStream\\file1.txt"); 
		FileInputStream fin2=new FileInputStream("D:\\eclipse_workspace\\CoreJava\\src\\filesAndStream\\file2.txt"); 
		FileInputStream fin3=new FileInputStream("D:\\eclipse_workspace\\CoreJava\\src\\filesAndStream\\file3.txt"); 

		//adding fileinputstream obj to a vector object 
		Vector v = new Vector(); 
		
		v.add(fin); 
		v.add(fin2); 
		v.add(fin3); 
		
		//creating enumeration object by calling the elements method 
		Enumeration enumeration = v.elements(); 

		//passing the enumeration object in the constructor 
		SequenceInputStream sin = new SequenceInputStream(enumeration); 
		
		// determine how many bytes are available in the first stream 
		System.out.println("" + fin.available()); 
		
		// Estimating the number of bytes that can be read 
		// from the current underlying input stream 
		System.out.println( sin.available()); 
		
		int i = 0; 
		while((i = sin.read())!= -1) 
		{ 
			System.out.print((char)i); 
		} 
		sin.close(); 
		fin.close(); 
		fin2.close(); 
		fin3.close(); 
		}
catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	} 
} 


