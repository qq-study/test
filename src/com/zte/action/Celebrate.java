package com.zte.action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Celebrate {

	JFrame frame;
	public Celebrate() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 609, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel picture = new JLabel();
		Icon icon = new ImageIcon(Main.base_path+"Celebrate.jpg");
		picture.setIcon(icon);
		picture.setBounds(130, 29, 374, 365);
		frame.getContentPane().add(picture);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(130, 384, 374, 36);
		frame.getContentPane().add(panel);
		
		JLabel label = new JLabel("恭喜你注册成功！");
		panel.add(label);
		label.setFont(new Font("幼圆", Font.BOLD, 24));
		
		JButton button = new JButton("返回登录");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				Business b = new Business();
				b.frame.setVisible(true);
				frame.dispose();
			}
		});
		button.setBounds(258, 433, 100, 27);
		frame.getContentPane().add(button);
		frame.setLocationRelativeTo(null);
		// 不允许修改尺寸
		frame.setResizable(false);
		frame.setUndecorated(true);
	}
}
