package teamProject;

import java.util.List;

public class ManagerImpl implements Manager {
	private ProductManagement productMangement = new ProductManagement();
	private ChangeManagement changeManagement = new ChangeManagement();

	@Override
	public void insertProduct(String name, int price, String expiredDate, int count) {
		productMangement.insertProduct(name, price, expiredDate, count);

	}

	@Override
	public boolean updateProduct(String oldName, String newName, int newPrice, String newExpiredDate, int newCount) {
		if (productMangement.updateProduct(oldName, newName, newPrice, newExpiredDate, newCount)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteProduct(String name) {
		if (productMangement.deleteProduct(name)) {
			return true;
		}

		return false;
	}

	@Override
	public List<ProductVO> viewProduct() {
		return productMangement.productInfo();
	}

	@Override
	public void updateCount(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean recharge(int countOf10000won, int countOf5000won, int countOf1000won,
			int countOf500won, int countOf100won) {
		return changeManagement.recharge(countOf10000won, countOf5000won, countOf1000won, countOf500won, countOf100won);
	}

	@Override
	public void viewMoney() {
		changeManagement.viewMoney();
	}

	@Override
	public boolean getProfit() {
		// TODO Auto-generated method stub
		return false;
	}

}
