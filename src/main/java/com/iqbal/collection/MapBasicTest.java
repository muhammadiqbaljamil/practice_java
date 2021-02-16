package com.iqbal.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapBasicTest {

	public static void main(String[] args) {
		Map<String, String> strMap = new LinkedHashMap<String, String>();
		strMap.put("Iqbal", "Software Developer");
		strMap.put("Umar", "Research Analyst");
		
		for (Map.Entry<String, String> entrySet : strMap.entrySet()) {
			System.out.println(entrySet.getKey() + " => " +entrySet.getValue());
		}
	}

}
