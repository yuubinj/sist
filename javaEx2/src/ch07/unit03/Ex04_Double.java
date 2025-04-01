package ch07.unit03;

public class Ex04_Double {

	public static void main(String[] args) {
		double d;
		String s;
		
		s = "1213.57";
		d = Double.parseDouble(s); // String 을 double 로
		System.out.println(d);
		
		d = Double.valueOf(s); // String 을 double 로
		System.out.println(d);
		
		System.out.println(Double.toString(d));
		// double 을 String 로
	}

}
