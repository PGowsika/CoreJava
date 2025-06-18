package filesAndStream;

import java.io.File;
import java.io.IOException;

public class Directories {

	public static void main(String[] args) {
		String directory = "test";
		File f1 = new File("D:\\eclipse_workspace\\CoreJava\\src\\filesAndStream\\" + directory);
		
		if(f1.mkdir())
		{
			System.out.println("Directory Created..... ");

		}
		else if (f1.exists())
		{
			System.out.println("Directory Already Created..... ");
			System.out.println("List of files in directory : ");
			String s[] = f1.list();
			for(String i : s)
			{
				File f2 = new File(f1, i);
				if (f2.isFile())
                    System.out.println(i + " : is a file");
                if (f2.isDirectory())
                    System.out.println(i + " : is a directory");
			}
			System.out.println("Total Files : " + s.length);
		}
		File f2 = new File("D:\\eclipse_workspace\\CoreJava\\src\\filesAndStream\\");
		try {
			System.out.println(f2.createNewFile());
			String s1[] = f2.list();
			for(String i : s1)
			{
				File f3 = new File(f2, i);
				if (f3.isFile())
                    System.out.println(i + " : is a file");
                if (f3.isDirectory())
                    System.out.println(i + " : is a directory");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
