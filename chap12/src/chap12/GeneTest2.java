package chap12;

import java.util.Hashtable;
import java.util.Properties;

public class GeneTest2 {
	public static void main(String[] args) {
		// ArrayList, LinkedList, Vector
		// HashSet, TreeSet
		// HashMap. TreeMap. HashTable
		
		// Enumeration, Itertor, ListIterator
		
		// Property
		
		Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
		hashtable.put("A", 10);
		hashtable.put("B", 20);
		hashtable.put("C", 30);
		
		System.out.println(hashtable);
		
		Properties properties = new Properties();
		properties.put("가", "나");
		properties.setProperty("나", "10");
		System.out.println(properties);
		String result = properties.getProperty("가");
		System.out.println(result);
	}
}
