package filesAndStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamExample {

	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\eclipse_workspace\\CoreJava\\src\\filesAndStream\\file1.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String s= "This is buffered Output Stream";
			bout.write(s.getBytes());			
			bout.close();
			fout.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
