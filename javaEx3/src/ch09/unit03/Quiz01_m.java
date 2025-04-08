package ch09.unit03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01_m {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q01 obj = new Q01();
		
		try {
			System.out.print("첫 번째 수 ? ");
			obj.setNum(sc.nextInt());
			int a = obj.getNum();
			
			System.out.print("두 번째 수 ? ");
			obj.setNum(sc.nextInt());
			int b = obj.getNum();
			
			System.out.print("연산자 ? ");
			obj.setOperator(sc.next());
			String op = obj.getOperator();
			
			int result = 0;
			switch(op) {
			case "+": result = a + b; break;
			case "-": result = a - b; break;
			case "*": result = a * b; break;
			case "/": result = a / b; break;
			case "%": result = a % b; break;
			}
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			
		} catch (OperatorInputException e) {
			System.out.println("바른 연산자를 입력하세요.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요.");
		} finally {
			sc.close();
		}

	}
}

class OperatorInputException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public OperatorInputException() {
	}
	
	public OperatorInputException(String message) {
		super(message);
	}
}

class Q01 {
	private int num;
	private String operator;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) throws OperatorInputException{
		if(! (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")
				|| operator.equals("%"))) {
			throw new OperatorInputException("연산자 입력 오류 입니다.");
		}
		
		this.operator = operator;
	}
}