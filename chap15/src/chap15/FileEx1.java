package chap15;

import java.util.Hashtable;
import java.util.Properties;
import java.util.Set;

public class FileEx1 {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		Hashtable<String, String> hashtable;
		
		 Set<?> keys = properties.keySet();
//		 System.out.println(keys);
		 keys.forEach(key -> {
			 System.out.println(key + " : " + properties.get(key));
		 });
	}
}
