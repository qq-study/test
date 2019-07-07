package com.zte.action;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;
import com.zte.dao.OrderDAOImpl;
import com.zte.entity.Order;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class OrderSubmit{

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public OrderSubmit() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("车辆编号：");
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		label.setBounds(180, 66, 103, 45);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("请设置你需要租用的信息");
		label_1.setFont(new Font("宋体", Font.BOLD, 24));
		label_1.setBounds(180, 13, 294, 40);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("租车开始时间：");
		label_2.setFont(new Font("宋体", Font.PLAIN, 20));
		label_2.setBounds(141, 242, 140, 45);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("租车结束时间：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 20));
		label_3.setBounds(141, 300, 147, 45);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("租车类型：");
		label_4.setFont(new Font("宋体", Font.PLAIN, 20));
		label_4.setBounds(180, 184, 103, 45);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("车辆折扣：");
		label_5.setFont(new Font("宋体", Font.PLAIN, 20));
		label_5.setBounds(180, 126, 103, 45);
		frame.getContentPane().add(label_5);
		
		textField = new JTextField();
		textField.setBounds(297, 78, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(297, 138, 86, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setText("           9折");
		textField_1.setEditable(false);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(297, 196, 86, 24);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(299, 254, 215, 24);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(297, 312, 216, 24);
		frame.getContentPane().add(textField_4);
		
		JLabel label_6 = new JLabel("注意：时间填写方式例如：20190627");
		label_6.setBounds(106, 358, 254, 45);
		frame.getContentPane().add(label_6);
		
		JButton btnNewButton = new JButton("提交订单");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 把所有的零散信息汇总成对象
				Order o = new Order();
				o.setUid(Integer.valueOf(textField.getText()));
				o.setCid(Integer.valueOf(textField_2.getText()));
				String time = textField_3.getText();
				String time2 =  textField_4.getText();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				try {
					Date utilDate = sdf.parse(time);
					java.sql.Date dayDateSql = new java.sql.Date(utilDate.getTime());
					o.setRsd(dayDateSql);
				} catch (ParseException h) {
					// TODO Auto-generated catch block
					h.printStackTrace();
				}
				try {
					Date utilDate2 = sdf.parse(time2);
					java.sql.Date dayDateSql = new java.sql.Date(utilDate2.getTime());
					o.setRed(dayDateSql);
				} catch (ParseException h) {
					// TODO Auto-generated catch block
					h.printStackTrace();
				}
				
				// 交由 转么处理这个对象的 dao 来完成
				OrderDAOImpl dao = new OrderDAOImpl();
				dao.save(o);
				//关闭当前页面，跳转下一页面
				frame.setVisible(false);
				Complete b = new Complete();
				b.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(283, 403, 113, 27);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 646, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("请设置您的租车信息！");
		frame.setLocationRelativeTo(null);
	}
}
