package teamProject;

public class ChangeManagement {
	private ChangeInVM ch = new ChangeInVM();

	public boolean recharge(int _10000, int _5000, int _1000, int _500, int _100) {

		try {
			ch.setCountOf10000won(_10000);
			ch.setCountOf5000won(_5000);
			ch.setCountOf1000won(_1000);
			ch.setCountOf500won(_500);
			ch.setCountOf100won(_100);

			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void viewMoney() {

		System.out.print("현재 자판기에 남아있는 잔돈은 " + ch.getTot() + "원으로, ");
		System.out.println("지폐별 개수는 ");
		System.out.println("만원권 : " + ch.getCountOf10000won());
		System.out.println("오천원권 : " + ch.getCountOf5000won());
		System.out.println("천원권 : " + ch.getCountOf1000won());
		System.out.println("오백원권 : " + ch.getCountOf500won());
		System.out.println("백원권 : " + ch.getCountOf100won());
		System.out.println();
	}
}