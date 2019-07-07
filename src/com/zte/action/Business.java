package com.zte.action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Business {
	JFrame frame;
	public Business() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Regist r = new Regist();
				r.frame.setVisible(true);
				frame.dispose();
			}
		});
		Icon icon1 = new ImageIcon(Main.base_path+"zhuce.png");
		lblNewLabel.setIcon(icon1);
		
		lblNewLabel.setBounds(0, 38, 244, 202);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Denglu d = new Denglu();
				d.frame.setVisible(true);
				frame.dispose();
			}
		});
		Icon icon2 = new ImageIcon(Main.base_path+"denglu.png");
		label.setIcon(icon2);
		label.setBounds(247, 38, 244, 202);
		frame.getContentPane().add(label);
		frame.setBounds(100, 100, 513, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("欢迎使用租车系统");
	}
}
