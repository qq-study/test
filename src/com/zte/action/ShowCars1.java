package com.zte.action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class ShowCars1 {
	JFrame frame;
	public ShowCars1() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 899, 641);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel picture1 = new JLabel("图片1位置");
		picture1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car1();
			}
		});
		Icon icon1 = new ImageIcon(Main.base_path+"/cars/1.png");
		picture1.setIcon(icon1);
		frame.getContentPane().add(picture1);
		picture1.setBounds(0, 0, 220, 168);
		frame.getContentPane().add(picture1);
		
		JLabel picture2 = new JLabel("图片2位置");
		picture2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car2();
			}
		});
		Icon icon2 = new ImageIcon(Main.base_path+"/cars/2.png");
		picture2.setIcon(icon2);
		frame.getContentPane().add(picture2);
		picture2.setBounds(220, 0, 220, 168);
		frame.getContentPane().add(picture2);
		
		JLabel picture3 = new JLabel("图片3位置");
		picture3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car3();
			}
		});
		Icon icon3 = new ImageIcon(Main.base_path+"/cars/3.png");
		picture3.setIcon(icon3);
		frame.getContentPane().add(picture3);
		picture3.setBounds(440, 0, 220, 168);
		frame.getContentPane().add(picture3);
		
		JLabel picture4 = new JLabel("图片4位置");
		picture4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car4();
			}
		});
		Icon icon4 = new ImageIcon(Main.base_path+"/cars/4.png");
		picture4.setIcon(icon4);
		frame.getContentPane().add(picture4);
		picture4.setBounds(661, 0, 220, 168);
		frame.getContentPane().add(picture4);
		
		JLabel picture5 = new JLabel("图片5位置");
		picture5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car5();
			}
		});
		Icon icon5 = new ImageIcon(Main.base_path+"/cars/5.png");
		picture5.setIcon(icon5);
		frame.getContentPane().add(picture5);
		picture5.setBounds(0,181,220,168);
		frame.getContentPane().add(picture5);
		
		JLabel picture6 = new JLabel("图片6位置");
		picture6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car6();
			}
		});
		Icon icon6 = new ImageIcon(Main.base_path+"/cars/6.png");
		picture6.setIcon(icon6);
		frame.getContentPane().add(picture6);
		picture6.setBounds(220, 181, 220, 168);
		frame.getContentPane().add(picture6);
		
		JLabel picture7 = new JLabel("图片7位置");
		picture7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car7();
			}
		});
		Icon icon7 = new ImageIcon(Main.base_path+"/cars/7.png");
		picture7.setIcon(icon7);
		frame.getContentPane().add(picture7);
		picture7.setBounds(440, 181, 220, 168);
		frame.getContentPane().add(picture7);
		
		JLabel picture8 = new JLabel("图片8位置");
		picture8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car8();
			}
		});
		Icon icon8 = new ImageIcon(Main.base_path+"/cars/8.png");
		picture8.setIcon(icon8);
		frame.getContentPane().add(picture8);
		picture8.setBounds(661, 168, 220, 168);
		frame.getContentPane().add(picture8);
		
		JLabel picture9 = new JLabel("图片9位置");
		picture9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car9();
			}
		});
		Icon icon9 = new ImageIcon(Main.base_path+"/cars/9.png");
		picture9.setIcon(icon9);
		frame.getContentPane().add(picture9);
		picture9.setBounds(220, 351, 220, 168);
		frame.getContentPane().add(picture9);
		
		JLabel picture10 = new JLabel("图片10位置");
		picture10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car10();
			}
		});
		Icon icon10 = new ImageIcon(Main.base_path+"/cars/10.png");
		picture10.setIcon(icon10);
		frame.getContentPane().add(picture10);
		picture10.setBounds(440, 351, 220, 168);
		frame.getContentPane().add(picture10);
		
		JButton btnNewButton = new JButton("下一页");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				ShowCars2 sc2 = new ShowCars2();
				sc2.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(355, 531, 143, 35);
		frame.getContentPane().add(btnNewButton);
		frame.setTitle("点击即可查看车辆相关信息！");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}
}
