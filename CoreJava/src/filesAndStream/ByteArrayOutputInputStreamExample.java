package filesAndStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputInputStreamExample {

	public static void main(String[] args) throws IOException {
		
		String s ="I am a Java Developer";
		byte b[] = s.getBytes();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		out.write(b);
		
		
		ByteArrayInputStream input = new ByteArrayInputStream(b);
		System.out.println("Available Bytes : " + input.available());
		
		input.read();
		input.read();
		
		System.out.println("Available Bytes : " + input.available());
		int x ;
		while((x = input.read()) != -1)
		{
			input.skip(2);
			System.out.print((char)x);
			
		}
	}

}
