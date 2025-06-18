package filesAndStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {
	
		try 
		{
			FileOutputStream f1 = new FileOutputStream("D:\\fileStream\\inMakes.txt");
			int x = 76;
			f1.write(x);//write corresponding ASCII values : 76 - "L"
			f1.flush();
			String s = "\nI am a java developer";
			byte b[] = s.getBytes();
			f1.write(b);// to write full byte array - s
			f1.write(b,7,5);//to write "java"
			
			f1.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
	}

}
