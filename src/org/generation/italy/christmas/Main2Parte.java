package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main2Parte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("dimmi una parola:");
		String word = sc.nextLine();
		
		List<String> letters = new ArrayList<>();
		letters.add(word);
		for (int x=0;x<letters.size();x++) {
			
			String str = letters.get(x);
		}
		System.out.print(letters);
		
		System.out.print("\n------------------------------------");
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("dimmi una parola:");
		String word2 = sc.nextLine();
		Map<Integer,String> map = new HashMap<>();
		
		for(Integer key: map.keySet()) {
			
		map.put(5, word2);
		System.out.println(map);
		
		String value = map.get(key);
		
		System.out.println(key + " --> " + value);
	}
	}
}
