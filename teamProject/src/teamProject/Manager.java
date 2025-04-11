package teamProject;

import java.util.List;

public interface Manager {
	public boolean deleteProduct(String name);
	
	public List<ProductVO> viewProduct();
	public void updateCount(String name);
	
	public void viewMoney();
	public boolean getProfit();
	void insertProduct(String name, int price, String expiredDate, int count);

	boolean updateProduct(String oldName, String newName, int newPrice, String newExpiredDate, int newCount);

	boolean recharge(int countOf10000won, int countOf5000won, int countOf1000won, int countOf500won, int countOf100won);
}
