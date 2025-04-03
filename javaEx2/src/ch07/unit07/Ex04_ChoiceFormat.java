package ch07.unit07;

import java.text.ChoiceFormat;

public class Ex04_ChoiceFormat {

	public static void main(String[] args) {
		double[] limits = {0, 60, 70, 80, 90}; // 작은 것에서 큰 순
		String[] grades = {"F", "D", "C", "B", "A"};
		
		// 특정 값의 범위를 문자열로 반환
		ChoiceFormat cf = new ChoiceFormat(limits, grades);
		
		System.out.println("95 : " + cf.format(95));
		System.out.println("80 : " + cf.format(80));
		System.out.println("55 : " + cf.format(55));
		System.out.println();
		
		limits = new double[]{0, 60, 65, 70, 75, 80, 85, 90, 95};
		grades = new String[]{"0.0", "1.0", "1.5", "2.0", "2.5", "3.0", "3.5", "4.0", "4.5"};
		ChoiceFormat cf2 = new ChoiceFormat(limits, grades);
		
		double a;
		a = Double.parseDouble(cf2.format(83));
		System.out.println("83 : " + a); // 3.0
		
		String p = "60#D|70#C|80<B|90#A"; // # < 만 가능
		// 60#D : 0~69, 70#C : 70~80, 80<B : 81~89, 90#A : 90~
		ChoiceFormat cf3 = new ChoiceFormat(p);
		System.out.println("55: " + cf3.format(55)); // D
		System.out.println("70: " + cf3.format(70)); // C
		System.out.println("75: " + cf3.format(75)); // C
		System.out.println("80: " + cf3.format(80)); // C
		System.out.println("85: " + cf3.format(85)); // B
		System.out.println("95: " + cf3.format(95)); // A
	}

}
