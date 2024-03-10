package com.solvemath;


import java.util.Map;
import java.util.Map.Entry;

public class HashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> hm 
        = new java.util.HashMap<String, Integer>(); 
		
		hm.put("a", 100);
		hm.put("b" , 200);
		hm.put("c" , 300);
		hm.put("d" , 400);
		
		for(Entry<String, Integer> me : hm.entrySet()) {
			
			System.out.println(me.getKey() + ": " + me.getValue());
			//System.out.println(me.getValue()+ ":");
			
	 hm.put(new String("e"), 500);
//			
     System.out.println(me.getKey()+" new value : "+ me.getValue());
//			System.out.println(me.getValue()+ ":");
		}
	}
	}


	