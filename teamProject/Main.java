package teamProject;

import javax.swing.JFrame;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Main extends JFrame
{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Main() {
		getContentPane().setLayout(null);
		setSize(430, 200);
		setLocationRelativeTo(null);
		
		JButton btnCustmer = new JButton("고객용");
		btnCustmer.setBounds(41, 50, 130, 53);
		getContentPane().add(btnCustmer);
		
		JButton btnPharmacy = new JButton("약국용");
		btnPharmacy.setBounds(247, 50, 130, 53);
		getContentPane().add(btnPharmacy);
		
		setVisible(true);
		
		btnCustmer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e1) {
				Customer frame = new Customer();
			}
	});
		btnPharmacy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e2) {
				Pharmacy frame = new Pharmacy();
			}
	});
	}
}
