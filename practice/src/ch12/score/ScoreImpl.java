package ch12.score;

import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score{
	// 학생 정보를 저장할 List 구현 클래스 객체
	private List<ScoreVO> list = new ArrayList<ScoreVO>();

	@Override
	public void insertScore(Score vo) throws MyDuplicationException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ScoreVO> findByAll(String hak) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScoreVO findByHak(String hak) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScoreVO> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteScore(String hak) {
		// TODO Auto-generated method stub
		return false;
	}

}
