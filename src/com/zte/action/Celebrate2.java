package com.zte.action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class Celebrate2 {

	JFrame frame;
	public Celebrate2() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 372, 136);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("恭喜你取消租车成功！");
		label.setFont(new Font("宋体", Font.BOLD, 20));
		label.setBounds(85, 0, 210, 47);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("确定");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame.dispose();
			}
		});
		button.setBounds(131, 49, 113, 27);
		frame.getContentPane().add(button);
		frame.setTitle("取消租车成功！");
		frame.setLocationRelativeTo(null);
	}

}
