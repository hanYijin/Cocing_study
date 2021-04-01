package teamProject;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Join extends JFrame {

	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton joinCompleteBtn;
	private JTextField tfUid;
	private JTextField tfName;
	private JTextField tfAddress;
	private JTextField tfPhone;
	private JTextField tfSymptom;
	private JLabel lblAge;
	private JTextField tfage;

	public Join() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 490);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblJoin = new JLabel("고객추가");
		Font f1 = new Font("돋움", Font.BOLD, 20); //궁서 바탕 돋움
		lblJoin.setFont(f1); 
		lblJoin.setBounds(159, 41, 101, 20);
		contentPane.add(lblJoin);
		
		JLabel lblUid = new JLabel("uid");
		lblUid.setBounds(69, 93, 69, 20);
		contentPane.add(lblUid);
		
		JLabel lblName = new JLabel("이름");
		lblName.setBounds(69, 140, 69, 20);
		contentPane.add(lblName);
		
		lblAge = new JLabel("나이");
		lblAge.setBounds(69, 187, 69, 20);
		contentPane.add(lblAge);
		
		JLabel lblAddress = new JLabel("주소");
		lblAddress.setBounds(69, 234, 69, 20);
		contentPane.add(lblAddress);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setBounds(69, 281, 69, 20);
		contentPane.add(lblPhone);
		
		JLabel lblSymptom = new JLabel("증상");
		lblSymptom.setBounds(69, 324, 69, 20);
		contentPane.add(lblSymptom);
		
		tfUid = new JTextField();
		tfUid.setColumns(10);
		tfUid.setBounds(159, 86, 186, 35);
		contentPane.add(tfUid);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(159, 133, 186, 35);
		contentPane.add(tfName);
		
		tfAddress = new JTextField();
		tfAddress.setColumns(10);
		tfAddress.setBounds(159, 227, 186, 35);
		contentPane.add(tfAddress);
		
		tfPhone = new JTextField();
		tfPhone.setColumns(10);
		tfPhone.setBounds(159, 274, 186, 35);
		contentPane.add(tfPhone);
		
		joinCompleteBtn = new JButton("추가");
		joinCompleteBtn.setBounds(139, 395, 139, 29);
		contentPane.add(joinCompleteBtn);
		
		tfSymptom = new JTextField();
		tfSymptom.setColumns(10);
		tfSymptom.setBounds(159, 321, 186, 35);
		contentPane.add(tfSymptom);
		
		tfage = new JTextField();
		tfage.setColumns(10);
		tfage.setBounds(159, 180, 186, 35);
		contentPane.add(tfage);
		
		setVisible(true);
		joinCompleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "추가 완료되었습니다.");
				dispose();
				
			}
		});

	}
}


