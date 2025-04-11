package bank_temp;

import java.util.Scanner;

public class MainUI {
	private Scanner sc=new Scanner(System.in);
	
	private Bank bank = new BankImpl();
	private BankUI bankUI = new BankUI(bank);
	private UserUI userUI = new UserUI(bank);
	
	public void menu() {
		int ch;
		while(true) {
			do {
				System.out.println("----------------------");
				System.out.println("1.은행원  2.고객  3.종료 ");
				System.out.println("----------------------");
				System.out.print("선택=> ");
				ch=sc.nextInt();
			} while(ch<1 || ch>3);
			
			if(ch == 3) {
				return;
			}
			
			switch(ch) {
			case 1:bankUI.login(); break;
			case 2:userUI.menu(); break;
			}
		}
	}
	
}
