package filesAndStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	@SuppressWarnings({ "deprecation", "deprecation" })
	public static void main(String[] args) {
		short s;
		int i;
		long l;
		boolean b;
		double d;
		byte by;
		char c;
		float f;
		try {
			FileInputStream fin=new FileInputStream("D:\\eclipse_workspace\\CoreJava\\src\\filesAndStream\\file2.txt");
			FileOutputStream fout = new FileOutputStream("D:\\eclipse_workspace\\CoreJava\\src\\filesAndStream\\file2.txt");
			DataOutputStream dos = new DataOutputStream(fout);
			DataInputStream dis = new DataInputStream(System.in);
			
			System.out.println("Enter the Integer : ");
			i = Integer.parseInt(dis.readLine());
			System.out.println("Enter the Double : ");
			d = Double.parseDouble(dis.readLine());
			System.out.println("Enter the Boolean : ");
			b = Boolean.parseBoolean(dis.readLine());
			System.out.println("Enter the char : ");
			c = dis.readLine().charAt(0);
			//System.out.println("Enter the Short : ");
			//s = Short.parseShort(dis.readLine());
			//System.out.println("Enter the Long : ");
			//l = Long.parseLong(dis.readLine());
			//System.out.println("Enter the byte : ");
			//by = Byte.parseByte(dis.readLine());
			//System.out.println("Enter the float : ");
			//f = Float.parseFloat(dis.readLine());
			
			
			
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeBoolean(b);
			//dos.writeFloat(f);
			dos.writeChar(c);
			//dos.writeShort(s);
			//dos.writeLong(l);
			//dos.writeByte(by);
			
			DataInputStream dis1 = new DataInputStream(fin);
			System.out.println(dis1.readInt());
			System.out.println(dis1.readDouble());
			System.out.println(dis1.readBoolean());
			System.out.println(dis1.readChar());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		

	}

}
