package teamProject;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class SelectPill extends JFrame 
{
	public SelectPill() {
		getContentPane().setLayout(null);
		
		JButton BtnOrder = new JButton("주문하기");
		BtnOrder.setBounds(126, 183, 117, 29);
		getContentPane().add(BtnOrder);
		setSize(400,600);
		
		
	}
}
