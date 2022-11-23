package org.generation.italy.christmas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Main {
	
	public static class StringComparator implements Comparator<String>{
		@Override public int compare(String o1,String o2) {
			if(o1.length() > o2.length()) {
				return 1;
			}
			else if(o1.length() > o2.length()) {
				return -1;
			}
			return 0;
	}
		}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> gifts = new ArrayList<>();
		
		
		while(true) {
			System.out.print("\nvuoi chiedere un regalo a Babbo NAtale? y/n");
			String answer = sc.nextLine();
			if(answer.equals("y")) {
				System.out.print("Scrivi il tuo prossimo primo regalo di Natale?");
				String gift = sc.nextLine();
				gifts.add(gift);
				System.out.print("Il ragalo che hai scelto è: " + gift);
				continue;
			}
			break;
		}
		
		Collections.sort(gifts);
		System.out.println(gifts);
		System.out.print("----------------------------");
		Collections.frequency(gifts, "aeiou");
		
	}

}
