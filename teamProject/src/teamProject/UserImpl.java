package teamProject;

import java.util.List;

public class UserImpl implements User {
	private ProductManagement pmg = new ProductManagement();
	private List<ProductVO> productList;
	private BendingMachineVO machine;
	private int insertedMoney = 0; 

	@Override
	public List<ProductVO> userViewProduct() {
		return pmg.productInfo();
	}

	@Override
	public boolean userBuyProduct(String name) {
		
		return false;
	}

	@Override
	public boolean putMoney(int Money) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int viewMoney() {
		// TODO Auto-generated method stub
		return 0;
	}
}
