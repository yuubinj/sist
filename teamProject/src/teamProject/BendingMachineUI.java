package teamProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BendingMachineUI {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private BendingMachineVO bVo = new BendingMachineVO();
	private Manager mg = new ManagerImpl();
	private User us = new UserImpl();

	public void menu() {
		int ch1;
		int ch2;
		int ch3;
		while (true) {
			gogo: try {
				System.out.println("1.관리자 2.사용자");
				System.out.print("선택 => ");
				ch1 = Integer.parseInt(br.readLine());

				if (ch1 == 1) {
					System.out.println("\n1.등록 2.상품수정 3.상품삭제 4.재고확인 5.동전충전 6.동전개수확인 7.총금액회수 8.종료 9.이전으로");
					System.out.print("선택 => ");
					ch2 = Integer.parseInt(br.readLine());
					if (ch2 == 8) {
						System.out.println("\n종료");
						return;
					}
					switch (ch2) {
					case 1:
						insertProduct();
						break;
					case 2:
						updateProduct();
						break;
					case 3:
						deleteProduct();
						break;
					case 4:
						viewProduct();
						break;
					case 5:
						recharge();
						break;
					case 6:
						viewMoney();
						break;
					case 7:
						getProfit();
						break;
					}

				} else if (ch1 == 2) {

					while (true) {
						System.out.println("\n1.상품목록보기 2.구매하기 3.금액투입 4.투입금액확인 5.종료 6.이전으로");
						System.out.print("선택 => ");
						ch2 = Integer.parseInt(br.readLine());
						if (ch2 == 5) {
							System.out.println("\n종료");
							return;
						}
						switch (ch2) {
						case 1:
							userViewProduct();
							break;
						case 2:
							userBuyProduct();
							break;
						case 3:
							putMoney();
							break;
						case 4:
							countMoney();
							break;
						case 6:
							break gogo;
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void getProfit() {

	}

	private void viewMoney() {
		mg.viewMoney();
	}

	private void recharge() {
		System.out.print("얼마를 충전하시겠습니까? ");
		try {
			System.out.print("만원권 : ");
			int countOf10000won = Integer.parseInt(br.readLine());
			System.out.print("오천원권 : ");
			int countOf5000won = Integer.parseInt(br.readLine());
			System.out.print("천원권 : ");
			int countOf1000won = Integer.parseInt(br.readLine());
			System.out.print("오백원권 : ");
			int countOf500won = Integer.parseInt(br.readLine());
			System.out.print("백원권 : ");
			int countOf100won = Integer.parseInt(br.readLine());

			boolean b = mg.recharge(countOf10000won, countOf5000won, countOf1000won, countOf500won, countOf100won);
			if (b) {
				// 얼마 충전되었는지 보여주기
				int amountCharge = 10000 * countOf10000won + 5000 * countOf5000won + 1000 * countOf1000won
						+ 500 * countOf10000won + 100 * countOf100won;
				System.out.println(amountCharge + "가 충전되었습니다.");
				System.out.println();
			}
		} catch (NumberFormatException e) {
			System.out.println("동전은 숫자로 입력하십시오.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void updateCount() {

	}

	// 상품 보기
	private void viewProduct() {

	}

	private void deleteProduct() {

		// TODO Auto-generated method stub

	}

	public void insertProduct() {
		System.out.println("<< 상품 등록 >>");
		String name, expiredDate;
		int price, count;
		try {
			System.out.print("상품의 이름을 입력해주세요. => ");
			name = br.readLine();
			System.out.print("상품의 가격을 입력해주세요. => ");
			price = Integer.parseInt(br.readLine());
			if (price <= 0) {
				System.out.println("상품의 가격은 0보다 커야합니다.");
				return;
			}

			System.out.println("[형식 : yyyy-MM-dd, yyyy.MM.dd, yyyy/MM/dd]");
			System.out.print("상품의 유통기한을 입력해주세요. => ");
			expiredDate = br.readLine();
			if (isValidDate(expiredDate) == false) {
				System.out.println("잘못된 날짜 형식입니다.");
				return;
			}
			System.out.print("상품의 재고를 입력해주세요. => ");
			count = Integer.parseInt(br.readLine());
			mg.insertProduct(name, price, expiredDate, count);

			System.out.println("상품 등록이 완료되었습니다.");
		} catch (IOException e) {
			System.out.println("입출력에 문제가 발생했습니다.");
		} catch (NumberFormatException e) {
			System.out.println("가격, 재고는 숫자로 입력해야 합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateProduct() {
		System.out.println("<< 상품 수정 >>");
		String oldName, newName, newExpiredDate;
		int newPrice, newCount;
		boolean updateSuccess;
		try {
			System.out.print("수정할 상품의 이름을 입력해주세요. => ");
			oldName = br.readLine();

			System.out.print("새로운 상품의 이름을 입력해주세요. => ");
			newName = br.readLine();

			System.out.print("새로운 상품의 가격을 입력해주세요. => ");
			newPrice = Integer.parseInt(br.readLine());
			if (newPrice <= 0) {
				System.out.println("상품의 가격은 0보다 커야합니다.");
				return;
			}
			System.out.println("[형식 : yyyy-MM-dd, yyyy.MM.dd, yyyy/MM/dd]");
			System.out.print("새로운 상품의 유통기한을 입력해주세요. => ");
			newExpiredDate = br.readLine();
			if (isValidDate(newExpiredDate) == false) {
				System.out.print("잘못된 날짜 형식입니다.");
				return;
			}
			System.out.print("새로운 상품의 재고를 입력해주세요. => ");
			newCount = Integer.parseInt(br.readLine());
			updateSuccess = mg.updateProduct(oldName, newName, newPrice, newExpiredDate, newCount);
			if (updateSuccess) {
				System.out.println("상품이 수정되었습니다.");
			} else {
				System.out.println("등록되지 않은 상품입니다.");
			}
		} catch (IOException e) {
			System.out.println("입출력에 문제가 발생했습니다.");
		} catch (NumberFormatException e) {
			System.out.println("가격은 숫자로 입력해야 합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end of update
		// 날짜 형식 검사

	public boolean isValidDate(String strDate) {
		try {
			if (strDate.matches("\\d{4}[-./]\\d{2}[-./]\\d{2}") == false) {
				return false;
			}

			strDate = strDate.replaceAll("(\\-|\\.|\\/)", "");
			String s;
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
			LocalDate localDate = LocalDate.parse(strDate, formatter);
			s = localDate.format(formatter);
			if (strDate.equals(s)) {
				return true;
			}

		} catch (Exception e) {
			return false;
		}

		return false;
	} // end of isValidDate

	private void userBuyProduct() {

		try {
			System.out.print("상품이름 ? ");
			String name = br.readLine();

			List<ProductVO> list = mg.viewProduct();
			for (ProductVO vo : list) {
				if (name.equals(vo.getName())) {
					// 상품을 구매하던지 못하던지(재고 확인, 내가 투입한 돈 확인해야 함, 자판기 안에 돈 확인)

				}
			}

			System.out.println("상품이 존재하지 않습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 금액 투입

	private void userViewProduct() {
		List<ProductVO> list = mg.viewProduct();

		for (ProductVO vo : list) {
			System.out.printf("이름 => %s\t", vo.getName());
			System.out.printf("가격 => %d\n", vo.getPrice());
		}
	}

	protected void putMoney() {

		System.out.println("\n[금액을 투입합니다.]");

		String input;

		int money;

		try {

			System.out.print("얼마를 투입하시겠습니까? => ");

			money = Integer.parseInt(br.readLine());

			if (money <= 0) {

				System.out.println("금액은 0 이상의 값을 입력하세요.");

			} else {

				bVo.setMoney(bVo.getMoney() + money);

				System.out.println("[금액이 충전되었습니다.]");

			}

		} catch (NumberFormatException e) {

			System.out.println("금액은 숫자만 입력 가능합니다.");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	// 투입금액 확인

	protected void countMoney() {

		System.out.println("\n[투입 금액을 확인합니다.]");

		System.out.println("[투입 금액은 " + bVo.getMoney() + "원 입니다.]");

	}

}