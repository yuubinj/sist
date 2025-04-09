package ch12.unit04;

import java.util.Set;
import java.util.TreeSet;

public class Quiz01 {

	public static void main(String[] args) {
		// Lotto : 1~45 까지 6개
		Set<Integer> set = new TreeSet<Integer>();
		
		while(set.size() < 6) {
			/*
			int n = (int)(Math.random()*45) + 1;
			set.add(n);
			*/
			set.add((int)(Math.random() * 45) + 1);
		}

		System.out.println(set);
	}
}
