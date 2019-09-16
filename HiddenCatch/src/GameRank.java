import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameRank extends JFrame {
	JPanel pnBase = new JPanel();
	JPanel pnHead = new JPanel();
	JPanel pnBtn = new JPanel();
	JPanel pnFoot = new JPanel();
	JButton btFoot = new JButton("← 뒤로가기");
	JLabel lbHead = new JLabel("★ 최 고 기 록 ★");
	JLabel lbEasy = new JLabel("I D : ",JLabel.CENTER);//여기에 get id 추가
	JLabel lbNormal = new JLabel("맞 춘 개 수 : ",JLabel.CENTER);//여기에 get 맞춘개수 추가
	JLabel lbHard = new JLabel("남 은 시 간 : ",JLabel.CENTER);//여기에 get 남은시간 추가
	
	public GameRank() {
		
		Container cp = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("★ R A N K I N G ★");
		setResizable(false); //frame창을 사용자가 늘리고 줄이는 기능을 못하게 한것.
		
		cp.add(pnBase);
		
		pnBase.setSize(350, 500);
		pnBase.setLayout(new BorderLayout(0, 40));
		pnBase.setBorder(BorderFactory.createEmptyBorder(30, 20, 20, 20)); // 상, 좌, 하, 우의 여백을 지정.
		
		Color pnBaseColor = new Color(255, 255, 255);
		pnBase.setBackground(pnBaseColor);
		
		pnBase.add(pnHead,BorderLayout.NORTH);
		pnHead.add(lbHead);
		pnHead.setBackground(pnBaseColor);
		lbHead.setFont(new Font("나눔고딕",Font.BOLD,50)); //글씨의 종류 , 크기를 지정
		
		Color lbColor = new Color(124, 86, 255);
		lbHead.setForeground(lbColor);
		
		pnBase.add(pnBtn,BorderLayout.CENTER);
		
		pnBtn.setBackground(pnBaseColor);
		pnBtn.setLayout(new GridLayout(3,1,0,15));
		pnBtn.add(lbEasy);
		pnBtn.add(lbNormal);
		pnBtn.add(lbHard);

		

		lbEasy.setBackground(new Color(251,255,137));
		lbNormal.setBackground(new Color(255, 235, 137));
		lbHard.setBackground(new Color(255, 137, 137));
		
		lbEasy.setFont(new Font("나눔고딕",Font.BOLD,30));
		lbNormal.setFont(new Font("나눔고딕",Font.BOLD,30));
		lbHard.setFont(new Font("나눔고딕",Font.BOLD,30));
		btFoot.setFont(new Font("나눔고딕",Font.BOLD,20));
		
		pnBase.add(pnFoot,BorderLayout.SOUTH);
		pnFoot.setBackground(pnBaseColor);
		pnFoot.add(btFoot);
		btFoot.setBackground(pnBaseColor);
		
		setBounds(750, 250, 350, 500);
		setVisible(true);
		
		MyHandler my = new MyHandler();
		btFoot.addActionListener(my);
		
}// GameRank()-----------------------------------------------------------------------
	
	
	class MyHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) { 
			Object obj = e.getSource();
			if(obj==btFoot) {
				setVisible(false);}
		}
	}
		
//}//MyHandler--------------------------------------------------------------------------------------
	
	 

	public static void main(String[] args) {
		new GameRank();

	}

}//GameRank---------------------------------------------------------------------------------
