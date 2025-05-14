package ch16.unit01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatForm extends JFrame implements ActionListener, Runnable{
	private static final long serialVersionUID = 1L;
	
	private JTextField tf = new JTextField(); // 텍스트 한줄만 입력 가능. 창 맨 아래칸
	private JTextArea ta = new JTextArea(); // 텍스트 여러줄 입력 가능. 창 위 칸

	public ChatForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ta.setEditable(false); // 창 위칸(text area) 텍스트 입력, 삭제, 수정 불가
		JScrollPane pane = new JScrollPane(ta); // 스크롤바 만듦
		add(pane, BorderLayout.CENTER);
		
		// JTextField에 ActionEvent 등록
		// JTextField에서 엔터를 누르면 ActionEvent 발생
		tf.addActionListener(this);
		add(tf, BorderLayout.SOUTH);
		
		setTitle("채팅");
		setSize(500, 500);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ChatForm();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf) { // ActionEvent 가 textField에 발생했는지
			String s = tf.getText().trim();
			if(s.isEmpty()) { // if(s.length() == 0 {
				return;
			}
			
			try {
				
				ta.append("보냄> " + s + "\n");
				
				tf.setText("");
				tf.requestFocus();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
