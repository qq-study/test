package com.zte.action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Warning {
	JFrame frame;
	public Warning() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 571, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel picture = new JLabel();
		picture.setBounds(86, 0, 369, 340);
		Icon icon = new ImageIcon(Main.base_path+"Warning.png");
		picture.setIcon(icon);
		frame.getContentPane().add(picture);
		JButton btnNewButton = new JButton("重新登录");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				Denglu w = new Denglu();
				w.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(210, 398, 113, 27);
		frame.getContentPane().add(btnNewButton);
		frame.setLocationRelativeTo(null);
		show(null, null);
	}
	void show(String content ,String title) {
		JLabel lblNewLabel = new JLabel(content);
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 24));
		lblNewLabel.setBounds(136, 343, 288, 42);
		frame.setTitle(title);
		frame.getContentPane().add(lblNewLabel);
	}
}
