package teamProject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Pharmacy extends JFrame {

	private JPanel contentPane;

	public Pharmacy() 
	{
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(150, 170);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setVisible(true);

		getContentPane().setLayout(null);
		
		JButton btnOrder = new JButton("주문내역");
		btnOrder.setBounds(6, 6, 138, 29);
		getContentPane().add(btnOrder);
		
		JButton btnCustomer = new JButton("고객조회");
		btnCustomer.setBounds(6, 47, 138, 29);
		getContentPane().add(btnCustomer);
		
		JButton btnSum = new JButton("매출조회");
		btnSum.setBounds(6, 88, 138, 29);
		getContentPane().add(btnSum);
	}
}


