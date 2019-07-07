package com.zte.action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import com.zte.dao.CarlistDAOImpl;
import com.zte.entity.Carlist;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class CarlistInformation {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;
	private JButton button;
	public CarlistInformation() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 646, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("恭喜您查询的车辆信息如下：");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 24));
		lblNewLabel.setBounds(147, 0, 325, 85);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("车牌子：");
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(157, 83, 77, 49);
		frame.getContentPane().add(label);
		//车牌子填写
		textField = new JTextField();
		textField.setBounds(248, 98, 170, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("车类型：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(157, 148, 77, 49);
		frame.getContentPane().add(label_1);
		//车类型填写
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(248, 162, 170, 24);
		frame.getContentPane().add(textField_1);
		
		JLabel label_2 = new JLabel("车价格：");
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(157, 210, 77, 49);
		frame.getContentPane().add(label_2);
		//车价格填写
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(248, 224, 170, 24);
		frame.getContentPane().add(textField_2);
		
		JLabel label_3 = new JLabel("车保险：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(157, 272, 77, 49);
		frame.getContentPane().add(label_3);
		//车保险填写
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(248, 286, 170, 24);
		frame.getContentPane().add(textField_3);
		
		JLabel label_4 = new JLabel("车描述：");
		label_4.setFont(new Font("宋体", Font.PLAIN, 18));
		label_4.setBounds(157, 334, 77, 49);
		frame.getContentPane().add(label_4);
		//车描述填写
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(248, 348, 170, 24);
		frame.getContentPane().add(textField_4);
		
		btnNewButton = new JButton("返回查看车辆");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ShowCars1 sc1 = new ShowCars1();
				sc1.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(147, 405, 128, 27);
		frame.getContentPane().add(btnNewButton);
		
		button = new JButton("选择租用信息");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				OrderSubmit o = new OrderSubmit();
				o.frame.setVisible(true);
				frame.dispose();
			}
		});
		button.setBounds(328, 405, 128, 27);
		frame.getContentPane().add(button);
		frame.setTitle("查询信息如下");
		frame.setLocationRelativeTo(null);
	}
	//调用数据库数据
	CarlistDAOImpl dao = new CarlistDAOImpl();
	public void car1(){
		Carlist li = dao.findByCid(1);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car2(){
		Carlist li = dao.findByCid(2);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car3(){
		Carlist li = dao.findByCid(3);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car4(){
		Carlist li = dao.findByCid(4);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car5(){
		Carlist li = dao.findByCid(5);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car6(){
		Carlist li = dao.findByCid(6);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car7(){
		Carlist li = dao.findByCid(7);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car8(){
		Carlist li = dao.findByCid(8);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car9(){
		Carlist li = dao.findByCid(9);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car10(){
		Carlist li = dao.findByCid(10);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car11(){
		Carlist li = dao.findByCid(11);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car12(){
		Carlist li = dao.findByCid(12);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car13(){
		Carlist li = dao.findByCid(13);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car14(){
		Carlist li = dao.findByCid(14);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car15(){
		Carlist li = dao.findByCid(15);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car16(){
		Carlist li = dao.findByCid(16);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car17(){
		Carlist li = dao.findByCid(17);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car18(){
		Carlist li = dao.findByCid(18);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car19(){
		Carlist li = dao.findByCid(19);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	public void car20(){
		Carlist li = dao.findByCid(20);
		textField.setText(li.getCname());
		textField_1.setText(li.getCtype());
		textField_2.setText(li.getPrice().toString());
		textField_3.setText(li.getInsure().toString());
		textField_4.setText(li.getDesp());
		notedit();
	}
	private void notedit() {
		//设置不可编辑
				textField.setEditable(false);
				textField_1.setEditable(false);
				textField_2.setEditable(false);
				textField_3.setEditable(false);
				textField_4.setEditable(false);
	}
}
