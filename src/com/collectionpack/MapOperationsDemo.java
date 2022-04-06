package com.collectionpack;

import java.util.*;

public class MapOperationsDemo {

	public static void main(String[] args) {

		// Map<String,String> map = new HashMap<>();
		// System.out.println(map.put("Key1", "Value1"));
		// System.out.println(map.put("Key1", "Value11"));
		// System.out.println(map.put("Key2", "Value2"));
		// System.out.println(map.put("Key3", "Value3"));
		// System.out.println(map.put("Key3", "Value33"));
		// System.out.println(map);

		Map<String, String> map = new HashMap<>();
		map.put(null, "");
		map.put("Key1", "Value1");
		map.put("Key2", "Value2");
		map.put("Key3", "Value3");
		map.put("Key4", "Value4");
		map.put("Key5", "Value5");

		// keySet, values, entrySet
		Iterator<String> keySet = map.keySet().iterator();
		while (keySet.hasNext()) {
			String key = keySet.next();
			System.out.println(key + " = " + map.get(key));
		}

		Iterator<String> values = map.values().iterator();
		while (values.hasNext()) {
			System.out.println(values.next());
		}
 
		Set<Map.Entry<String, String>> entry = map.entrySet();
		Iterator<Map.Entry<String, String>> entryItr = entry.iterator();

		while (entryItr.hasNext()) {
			Map.Entry<String, String> keyValues = entryItr.next();
			System.out.println(keyValues.getKey()+" = "+keyValues.getValue());
		}
		
		
		Hashtable<String, String> hash = new Hashtable<>(map);
		hash.put(null, "");
		Enumeration<String> enumu = hash.elements();
		while(enumu.hasMoreElements()){
			System.out.println(enumu.nextElement());
		}
	}

}
