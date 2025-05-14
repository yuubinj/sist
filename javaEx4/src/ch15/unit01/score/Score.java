package ch15.unit01.score;

import java.util.List;

public interface Score {
	public void insertScore(ScoreVO vo) throws DuplicationException;
	public boolean deleteScore(String hak);
	public List<ScoreVO> listScore();
	public ScoreVO findById(String hak);
	public void saveFile();
}
