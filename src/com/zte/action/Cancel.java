package com.zte.action;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import com.zte.dao.CancelDaoImpl;
import com.zte.entity.Order;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Cancel {
	JFrame frame;
	private JTextField textField;

	public Cancel() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("请输入您刚刚租车的车辆编号：");
		label.setFont(new Font("宋体", Font.BOLD, 26));
		label.setBounds(90, 98, 378, 37);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(168, 169, 189, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("取消租车");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 把所有的零散信息汇总成对象
				Order o = new Order();
				o.setCid(Integer.valueOf(textField.getText()));
				// 交由 转么处理这个对象的 dao 来完成
				CancelDaoImpl dao = new CancelDaoImpl();
				dao.cancel(o);
				Celebrate2 cl2 = new Celebrate2();
				cl2.frame.setVisible(true);
			}

			
		});
		btnNewButton.setBounds(90, 275, 113, 27);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("返回首页");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ShowCars1 sc1 = new ShowCars1();
				sc1.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(316, 275, 113, 27);
		frame.getContentPane().add(btnNewButton_1);
		frame.setTitle("取消租车");
		frame.setBounds(100, 100, 555, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
