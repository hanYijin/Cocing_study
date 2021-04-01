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

public class OrderTable extends JFrame {

	private JPanel contentPane;
	private JLabel lblOrder;
	private JButton BtnNext;
	private JTextField tfUid;
	private JTextField tfName;
	private JTextField tfAddress;
	private JTextField tfPhone;
	private JTextField tfSymptom;
	private JLabel lblAge;
	private JTextField tfage;
	private JTextField tfGender;
	private JLabel lblGender;
	private JButton BtnBack;

	public OrderTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 530);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblOrder = new JLabel("주문");
		Font f1 = new Font("돋움", Font.BOLD, 20); //궁서 바탕 돋움
		lblOrder.setFont(f1); 
		lblOrder.setBounds(159, 41, 101, 20);
		contentPane.add(lblOrder);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(69, 93, 69, 20);
		contentPane.add(lblId);
		
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
		lblSymptom.setBounds(69, 328, 69, 20);
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
		
		BtnNext = new JButton("다음");
		BtnNext.setBounds(216, 445, 139, 29);
		contentPane.add(BtnNext);
		
		tfSymptom = new JTextField();
		tfSymptom.setColumns(10);
		tfSymptom.setBounds(159, 321, 186, 35);
		contentPane.add(tfSymptom);
		
		tfage = new JTextField();
		tfage.setColumns(10);
		tfage.setBounds(159, 180, 186, 35);
		contentPane.add(tfage);
		
		tfGender = new JTextField();
		tfGender.setColumns(10);
		tfGender.setBounds(159, 368, 186, 35);
		contentPane.add(tfGender);
		
		lblGender = new JLabel("성별");
		lblGender.setBounds(69, 375, 69, 20);
		contentPane.add(lblGender);
		
		BtnBack = new JButton("이전");
		BtnBack.setBounds(49, 445, 139, 29);
		contentPane.add(BtnBack);
		
		setVisible(true);
		BtnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e2) {
				setVisible(false);
				SelectPill frame = new SelectPill();
			}
		});
		
		BtnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e2) {
				setVisible(false);
				Customer frame = new Customer();
			}
	});

	}
}


