package com.zte.action;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Complete {

	JFrame frame;
	public Complete() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("恭喜你租车成功！");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 26));
		lblNewLabel.setBounds(167, 91, 216, 72);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("取消租车");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Cancel cl = new Cancel();
				cl.frame.setVisible(true);
				frame.dispose();
			}
		});
		button.setBounds(211, 187, 113, 27);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("返回首页");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ShowCars1 sc1 = new ShowCars1();
				sc1.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_1.setBounds(92, 261, 113, 27);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("退出系统");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_2.setBounds(315, 261, 113, 27);
		frame.getContentPane().add(button_2);
		frame.setBounds(100, 100, 555, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("恭喜你提交订单成功！");
		frame.setLocationRelativeTo(null);
	}

}
