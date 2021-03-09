package com.avinash;

import java.util.HashMap;
import java.util.Map;

public class RepString {
		
		public  static void repStr(String str) {
		
			Map< Character, Integer> map=new HashMap<Character, Integer>();
			
		char[] ch	=str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				char value=ch[i];
				if (map.containsKey(value)) {
					map.put(value, map.get(value)+1);
				}else {
					map.put(value, 1);
				}
				
			}
			
			for (char k : map.keySet()) {
				map.get(k);
				System.out.println(k);
				System.out.println(map.get(k));
			}
			
	}
		
		
		
		public static void main(String[] args) {
			repStr("avinash");
		}
}



