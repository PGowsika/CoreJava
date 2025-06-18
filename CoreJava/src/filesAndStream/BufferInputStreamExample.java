package filesAndStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("D:\\eclipse_workspace\\CoreJava\\src\\filesAndStream\\file1.txt"); 
		BufferedInputStream bin = new BufferedInputStream(fin);
		int x;
		while((x = bin.read()) != -1)
			System.out.print((char)x);
		
		bin.close();
		fin.close();
		
		
		System.out.println("Buffer with size");
		FileInputStream fin1=new FileInputStream("D:\\eclipse_workspace\\CoreJava\\src\\filesAndStream\\file1.txt"); 
		BufferedInputStream bin1 = new BufferedInputStream(fin1, 500);
		int x1;
		while((x1 = bin1.read()) != -1)
			System.out.print((char)x1);
		
		
		bin1.close();
		fin1.close();
	

	}

}
