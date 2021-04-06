package teamProject;

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
import javax.swing.table.DefaultTableModel;


public class Orderlist extends JFrame {
	
	JPanel center_p= new JPanel();
	JPanel bottom_p=new JPanel();
	
	JButton btn = new JButton("주문조회");
	
	JTable jt =null;
	JScrollPane jp=null;
	
	public static DefaultTableModel DFTM=null;
	
	public static Vector<Vector> data = new Vector<Vector>();
	public static Vector<String> title = new Vector<String>();
	
	public Orderlist(){
		 center_p.setLayout(null);
		 
		 title.add("고객 ID");
		 title.add("고객 이름");
		 title.add("제품 코드");
		 title.add("주문 날짜");
		 title.add("가격");
		 title.add("재고");
		Vector<String> data1= new Vector<String>();
		 data1.add("고객 ID");
		 data1.add("고객 이름");
		 data1.add("제품 코드");
		 data1.add("주문 날짜");
		 data1.add("가격");
		 data1.add("재고");
		 
		 data.add(data1);
		 DFTM= new DefaultTableModel(data,title);
		 jt=new JTable(DFTM);
		 jt.setBounds(0,0,785,530);
		 
		 jp=new JScrollPane(jt);
		 jp.setBounds(0,0,785,530);
		 
		 center_p.add(jp,BorderLayout.CENTER);
		 
		 bottom_p.add(btn);
		 btn.addActionListener(new ActionListener(){
			 @Override
			 public void actionPerformed(ActionEvent e){
				 data.clear();
				 
				 Oder oder = new Oder();
				 oder.getDate();
				 
				 DFTM.fireTableDataChanged();
				 jt = new JTable(data,title);
		 
			 }			 
		 });
		 getContentPane().add(center_p, BorderLayout.CENTER);
		 getContentPane().add(bottom_p, BorderLayout.SOUTH);
			
			setSize(800, 600);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Orderlist();
	}
}