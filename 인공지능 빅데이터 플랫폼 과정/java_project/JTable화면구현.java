import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableEx01 extends JFrame {
	JPanel center_panel = new JPanel();
	JPanel bottom_panel = new JPanel();
	JButton btn_select = new JButton("��ȸ");
	
	JTable jt = null;
	JScrollPane jp = null;
	
	Vector<Vector> data = new Vector<Vector>();
	Vector<String> title = new Vector<String>();
	
	public JTableEx01() {
		center_panel.setLayout(null);	// �ش� ��ǥ�� ũ�⿡ ���� ������Ʈ�� �߰�
		
		center_panel.setBackground(Color.DARK_GRAY);
		bottom_panel.setBackground(Color.LIGHT_GRAY);

		// 1���� �迭
		title.add("1��");
		title.add("2��");
		title.add("3��");
		title.add("4��");
		
		// data[0] = data1 1���� vector �߰�
		Vector<String> data1 = new Vector<String>();
		data1.add("����1");
		data1.add("����1");
		data1.add("����1");
		data1.add("����1");

		// data[1] = data2 1���� vector �߰�
		Vector<String> data2 = new Vector<String>();
		data2.add("����2");
		data2.add("����2");
		data2.add("����2");
		data2.add("����2");
		
		data.add(data1);
		data.add(data2);
		
		jt = new JTable(data,title);
		jt.setBounds(0, 0, 785, 530);	//jtable ũ������
		
		// ��ũ�� �г����� ���̺� �߰�
		jp = new JScrollPane(jt);
		jp.setBounds(0, 0, 785, 530);	//jtable ũ������
		
		// �߰� ��ο� ��ũ�� ��� �߰�
		// JPanel �⺻ ���̾ƿ� -> FlowLayout -> �帣�°�..
		// Component -> JButton, Jtable, JScrollPane, JLabel
		// Contorl -> DataGridView, Label, TextField
		center_panel.add(jp, BorderLayout.CENTER);
		
		// �ؿ� �гο� ��ư �߰�
		bottom_panel.add(btn_select);
		btn_select.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//vector ������ ����� �ٽ� �����͸� ä��� ����
				data.clear();
				//data ������ DB�� ����������
				DBManger dbm= new DBManger();
				data= dbm.getData();
				
				jt = new JTable(data,title);
				jt.setBounds(0, 0, 785, 530);	//jtable ũ������
				// ��ũ�� �г����� ���̺� �߰�
				jp = new JScrollPane(jt);
				jp.setBounds(0, 0, 785, 530);	//jtable ũ������
				
				center_panel.add(jp, BorderLayout.CENTER);
			}
		});
		
		getContentPane().add(center_panel, BorderLayout.CENTER);
		getContentPane().add(bottom_panel, BorderLayout.SOUTH);
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTableEx01();
	}
}
________________________________________________________________________________________________________
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class DBManger {
	public Vector<Vector> getData(){
		Vector<Vector> data = new Vector<Vector>();
		Connection conn=null;
		PreparedStatement pstmt= null;
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","AI","1234");
			pstmt= conn.prepareStatement("SELECT * FROM BUYING");
			rs=pstmt.executeQuery();
			while(rs.next()){
				Vector<String> row= new Vector<String>();
				row.add(rs.getString(1));
				row.add(rs.getString(2));
				row.add(rs.getString(3));
				row.add(rs.getString(4));
				row.add(rs.getString(5));
				data.add(row);
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception close){}

		}
		return data;
	}

}

