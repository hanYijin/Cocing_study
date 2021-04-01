package teamProject;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Customer extends JFrame
{
	private JPanel contentPane;

	public Customer() 
	{
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 200);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		getContentPane().setLayout(null);
		
		JButton btnOrder = new JButton("주문하기");
		btnOrder.setBounds(47, 38, 117, 75);
		getContentPane().add(btnOrder);
		
		JButton btnOrderSelect = new JButton("주문조회");
		btnOrderSelect.setBounds(257, 38, 117, 75);
		getContentPane().add(btnOrderSelect);
		
		setVisible(true);
		btnOrder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			OrderTable frame = new OrderTable();
			}
	});
		
		setVisible(true);
		btnOrderSelect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e2) {
				setVisible(false);
			OrderSelect frame = new OrderSelect();
			}
	});
	}
}
