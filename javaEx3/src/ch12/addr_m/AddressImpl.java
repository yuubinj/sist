package ch12.addr_m;

import java.util.ArrayList;
import java.util.List;

import ch12.score2.MyDuplicationException;

public class AddressImpl implements Address {
	private List<AddressVO> list = new ArrayList<AddressVO>();

	@Override
	public void insertAddress(AddressVO vo) throws MyDuplicationException {
		if(findById(vo.getName(), vo.getTel()) != null) {
			throw new MyDuplicationException("등록된 학번입니다.");
		}
		list.add(vo);
	}

	@Override
	public AddressVO findById(String name, String tel) {
		for(AddressVO vo : list) {
			if(name.equals(vo.getName()) && tel.equals(vo.getTel())) {
				return vo;
			}
		}
		
		return null;
	}

	@Override
	public List<AddressVO> findByAll() {
		return list;
	}

	@Override
	public List<AddressVO> findByName(String name) {
		List<AddressVO> searchList = new ArrayList<AddressVO>();
		
		for(AddressVO vo : list) {
			if(name.equals(vo.getName())) {
				searchList.add(vo);
			}
		}
		
		return searchList;
	}

	@Override
	public boolean deleteAddress(String name, String tel) {
		AddressVO vo = findById(name, tel);
		
		return list.remove(vo);
	}
}
