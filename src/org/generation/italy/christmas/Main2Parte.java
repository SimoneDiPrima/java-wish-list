package org.generation.italy.christmas;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main2Parte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("dimmi una parola:");
		String sentence = sc.nextLine();
		
		Set<Character>charter = new HashSet<>();
		
		for (char c : sentence.toCharArray()) {
			
			charter.add(c);
		}
		System.out.print(charter);
		
		
		System.out.print("\n------------------------------------");
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("dimmi una parola:");
		String word2 = sc.nextLine();
		Map<Character,Integer> charFreq = new HashMap<>();
		
		for(Character c : word2.toCharArray()) {
			if(charFreq.containsKey(c)) {
				int oldFreq = charFreq.get(c);
				charFreq.put(c, oldFreq+1);
			}else {
				charFreq.put(c, 1);
			}
		
	}
		System.out.println(charFreq);
	}
}
