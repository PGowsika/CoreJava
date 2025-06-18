package filesAndStream;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter implements FilenameFilter {
	String extension;
	
	public FileFilter(String extension) {
		
		this.extension = extension;
	}

	public static void main(String[] args) {
		File f = new File("D:\\JAVA FULL STACK\\CORE JAVA\\Operator"); 
		FileFilter filter = new FileFilter(".java");
		System.out.println("List of files in directory : ");
		String s[] = f.list(filter);
		for(String i : s)
		{
			System.out.println(i);
		}
		System.out.println("Total Files : " + s.length);

	}

	@Override
	public boolean accept(File f, String s) {
		//System.out.println(f);
		return s.endsWith(extension);
	}

}
