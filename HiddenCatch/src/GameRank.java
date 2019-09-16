import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameRank extends JFrame {
	JPanel pnBase = new JPanel();
	JPanel pnHead = new JPanel();
	JPanel pnBtn = new JPanel();
	JPanel pnFoot = new JPanel();
	JButton btFoot = new JButton("�� �ڷΰ���");
	JLabel lbHead = new JLabel("�� �� �� �� �� ��");
	JLabel lbEasy = new JLabel("I D : ",JLabel.CENTER);//���⿡ get id �߰�
	JLabel lbNormal = new JLabel("�� �� �� �� : ",JLabel.CENTER);//���⿡ get ���ᰳ�� �߰�
	JLabel lbHard = new JLabel("�� �� �� �� : ",JLabel.CENTER);//���⿡ get �����ð� �߰�
	
	public GameRank() {
		
		Container cp = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�� R A N K I N G ��");
		setResizable(false); //frameâ�� ����ڰ� �ø��� ���̴� ����� ���ϰ� �Ѱ�.
		
		cp.add(pnBase);
		
		pnBase.setSize(350, 500);
		pnBase.setLayout(new BorderLayout(0, 40));
		pnBase.setBorder(BorderFactory.createEmptyBorder(30, 20, 20, 20)); // ��, ��, ��, ���� ������ ����.
		
		Color pnBaseColor = new Color(255, 255, 255);
		pnBase.setBackground(pnBaseColor);
		
		pnBase.add(pnHead,BorderLayout.NORTH);
		pnHead.add(lbHead);
		pnHead.setBackground(pnBaseColor);
		lbHead.setFont(new Font("�������",Font.BOLD,50)); //�۾��� ���� , ũ�⸦ ����
		
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
		
		lbEasy.setFont(new Font("�������",Font.BOLD,30));
		lbNormal.setFont(new Font("�������",Font.BOLD,30));
		lbHard.setFont(new Font("�������",Font.BOLD,30));
		btFoot.setFont(new Font("�������",Font.BOLD,20));
		
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
