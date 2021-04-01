package teamProject;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class OrderSelect extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsername;
	private JButton loginBtn, joinBtn;
	public OrderSelect() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("ID");
		lblLogin.setBounds(58, 77, 69, 35);
		contentPane.add(lblLogin);
		
		tfUsername = new JTextField();
		tfUsername.setBounds(139, 77, 176, 35);
		contentPane.add(tfUsername);
		tfUsername.setColumns(10);
		
		joinBtn = new JButton("이전");
		joinBtn.setBounds(214, 154, 104, 29);
		contentPane.add(joinBtn);
		
		loginBtn = new JButton("조회");
		loginBtn.setBounds(70, 154, 106, 29);
		contentPane.add(loginBtn);
		
		setVisible(true);
				joinBtn.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Customer frame = new Customer();
			}
		});		
	}
}

