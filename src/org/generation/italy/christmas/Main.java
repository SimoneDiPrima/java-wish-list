package org.generation.italy.christmas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> gift = new ArrayList<>();
		
		
		
		for(int i = 0;i<gift.size();i++) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Scrivi la tua lista di regali di natale! Dimmi un regalo:");
				String gift1 = sc.nextLine();
			}
			String str = gift.get(i);
			System.out.print(str);
		}
		
		
	}

}
