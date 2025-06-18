package filesAndStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputSreamExample {

	public static void main(String[] args) {
		try {
			
			FileInputStream f1 = new FileInputStream("D:\\fileStream\\inMakes.txt");
			char x= (char)f1.read();
			System.out.println(x);
			int ch;
			System.out.println(f1.available());
            while ((ch = f1.read()) != -1) {
              
                // Print the data
                System.out.print((char)ch);
                
            }

            // Close the stream
            //f1.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch(IOException ioe)
		{
			ioe.printStackTrace();
		}

	}

}
