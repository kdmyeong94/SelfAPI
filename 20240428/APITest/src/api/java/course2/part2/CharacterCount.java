package api.java.course2.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "Hello, World!";
		
		Map<Character, Integer> charCountmap = new HashMap<Character, Integer>();
		
//		HashMap<Character, Integer> charCountmap = new HashMap<Character, Integer>();
		char[] strArray = str.toCharArray(); // {'H','e','l','l', ....}
		
		
//		for(char c : strArray) {
//			System.out.println(c);
//		}
		
		for(char c : strArray) {
			if(charCountmap.containsKey(c)) {
				charCountmap.put(c, charCountmap.get(c)+1);
			} else { 
				charCountmap.put(c, 1);
			}
		}
		
		System.out.println("Character Counts");
		for(Entry<Character, Integer> a : charCountmap.entrySet()) {
			System.out.println(a);
		}
		
		for(char a : charCountmap.keySet()) {
			System.out.println(a + ":"+ charCountmap.get(a));
		}
		
	}
}
