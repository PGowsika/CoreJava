package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterfaceclass {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("vishal", 10);
        m1.put("sachin", 30);
        m1.put("vaibhav", 20);
        m1.put("Arun", null);
        m1.put(null, 40);
        m1.put("vaibhav", 20);
        
        System.out.println("HashMap m1 : " + m1);
        
        
        System.out.println("Methods in Map Interface :");
        System.out.println("1. get(sachin) : " + m1.get("sachin"));
        System.out.println("2. Iterating keySet using keyset().iterator :");
        Iterator<String> itrk = m1.keySet().iterator();
        while(itrk.hasNext())
        	System.out.println("   " + itrk.next());
        
        System.out.println("3. Iterating values using values().iterator :");
        Iterator<Integer> itrv = m1.values().iterator();
        while(itrv.hasNext())
        	System.out.println("   " + itrv.next());

        Set s = m1.keySet();
        System.out.println("4. Retrive keys Using Set --> keySet() : " + s);
        
		Collection<Integer> s1 = m1.values();
		System.out.println("5. Retrive values Using values() : " + s1);
		
		System.out.println("6. Retrive values and keys Using EntrySet() : ");
		for(Map.Entry<String, Integer> m : m1.entrySet())
			System.out.println("   " + m.getKey() + " -  "  + m.getValue());
		
		System.out.println("7. Retrive values and keys Using Iterator : ");
		Iterator<String> itr = m1.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println("   " + key + " --> " + m1.get(key));
		}
		
		
		/*
		 * Map<String, Integer> m2 = new LinkedHashMap<String, Integer>();
		 * m2.put("vishal", 10); m2.put("sachin", 30); m2.put("vaibhav", 20);
		 * System.out.println("LinkedHashMap m1 : " + m2);
		 * 
		 * Map<String, Integer> m3 = new TreeMap<String, Integer>(); m3.put("vishal",
		 * 10); m3.put("sachin", 30); m3.put("vaibhav", 20);
		 * System.out.println("TreeMap m1 : " + m3);
		 */
		

	}

}
