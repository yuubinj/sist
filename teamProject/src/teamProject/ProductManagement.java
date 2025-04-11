package teamProject;

import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
	private List<ProductVO> list = new ArrayList<ProductVO>();

	public void insertProduct(String name, int price, String expiredDate, int count) {
		ProductVO vo = new ProductVO();
		vo.setName(name);
		vo.setPrice(price);
		vo.setExpiredDate(expiredDate);
		vo.setCount(count);
		list.add(vo);
	}

	public boolean updateProduct(String oldName, String newName, int newPrice, String newExpiredDate, int newCount) {
		for (ProductVO vo : list) {
			if (vo.getName().equals(oldName)) {
				vo.setName(newName);
				vo.setPrice(newPrice);
				vo.setExpiredDate(newExpiredDate);
				vo.setCount(newCount);
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteProduct(String name) {
		for (ProductVO vo : list) {
			if (vo.getName().equals(name)) {
				list.remove(vo);
				return true;
			}
		}
		return false;
	}
	
	public List<ProductVO> productInfo() {
		return list;
	}
}