package stringBuffer;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java is a Programming ");
		System.out.println("before append : " + sb);
		sb.append("Language");
		System.out.println("append() : " + sb);
		//System.out.println();

		// inserting a string
		sb.insert(9, " object oriented");
		System.out.println("insert() : " + sb);
		
		
		//replace a string
		sb.replace(26, 37, "secure");
		System.out.println("replace() : " + sb);
	
		//delete a string
		sb.delete(26, 33);
		System.out.println("delete() : " + sb);
		
		//char at specified index
		System.out.println("charAt() : " + sb.charAt(10));
		
		//length of string
		System.out.println("length() : " + sb.length());
		
		//substring of a string
		System.out.println("substring() : " + sb.substring(10));
		System.out.println("substring(start, end) : " + sb.substring(10,16));
		
		//reverse a string
		sb.reverse();
		System.out.println("reverse() : " + sb);
		
		
		// capacity
		System.out.println("capacity() : ");
		
	   StringBuffer s = new StringBuffer();
         // default 16
       System.out.println(s.capacity()); 
       s.append("Hello");
         // now 16
       System.out.println(s.capacity()); 
       s.append("java is my favourite language jhjjyfghghhg hfuutuygguy gfyftygygny");
        // (oldcapacity*2)+2
       System.out.println(s.capacity());
   
		
		
	
	}

}
