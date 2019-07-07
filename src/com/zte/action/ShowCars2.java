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
public class ShowCars2 {

	JFrame frame;
	public ShowCars2() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 899, 641);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel picture1 = new JLabel();
		picture1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car11();
			}
		});
		Icon icon1 = new ImageIcon(Main.base_path+"/cars/11.png");
		picture1.setIcon(icon1);
		frame.getContentPane().add(picture1);
		picture1.setBounds(0, 0, 220, 168);
		frame.getContentPane().add(picture1);
		
		JLabel picture2 = new JLabel();
		picture2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car12();
			}
		});
		Icon icon2 = new ImageIcon(Main.base_path+"/cars/12.png");
		picture2.setIcon(icon2);
		frame.getContentPane().add(picture2);
		picture2.setBounds(220, 0, 220, 168);
		frame.getContentPane().add(picture2);
		
		JLabel picture3 = new JLabel();
		picture3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car13();
			}
		});
		Icon icon3 = new ImageIcon(Main.base_path+"/cars/13.png");
		picture3.setIcon(icon3);
		frame.getContentPane().add(picture3);
		picture3.setBounds(440, 0, 220, 168);
		frame.getContentPane().add(picture3);
		
		JLabel picture4 = new JLabel();
		picture4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car14();
			}
		});
		Icon icon4 = new ImageIcon(Main.base_path+"/cars/14.png");
		picture4.setIcon(icon4);
		frame.getContentPane().add(picture4);
		picture4.setBounds(661, 0, 220, 168);
		frame.getContentPane().add(picture4);
		
		JLabel picture5 = new JLabel();
		picture5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car15();
			}
		});
		Icon icon5 = new ImageIcon(Main.base_path+"/cars/15.png");
		picture5.setIcon(icon5);
		frame.getContentPane().add(picture5);
		picture5.setBounds(0,181,220,168);
		frame.getContentPane().add(picture5);
		
		JLabel picture6 = new JLabel();
		picture6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car16();
			}
		});
		Icon icon6 = new ImageIcon(Main.base_path+"/cars/16.png");
		picture6.setIcon(icon6);
		frame.getContentPane().add(picture6);
		picture6.setBounds(220, 181, 220, 168);
		frame.getContentPane().add(picture6);
		
		JLabel picture7 = new JLabel();
		picture7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car17();
			}
		});
		Icon icon7 = new ImageIcon(Main.base_path+"/cars/17.png");
		picture7.setIcon(icon7);
		frame.getContentPane().add(picture7);
		picture7.setBounds(440, 181, 220, 168);
		frame.getContentPane().add(picture7);
		
		JLabel picture8 = new JLabel();
		picture8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car18();
			}
		});
		Icon icon8 = new ImageIcon(Main.base_path+"/cars/18.png");
		picture8.setIcon(icon8);
		frame.getContentPane().add(picture8);
		picture8.setBounds(661, 168, 220, 168);
		frame.getContentPane().add(picture8);
		
		JLabel picture9 = new JLabel();
		picture9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car19();
			}
		});
		Icon icon9 = new ImageIcon(Main.base_path+"/cars/19.png");
		picture9.setIcon(icon9);
		frame.getContentPane().add(picture9);
		picture9.setBounds(220, 351, 220, 168);
		frame.getContentPane().add(picture9);
		
		JLabel picture10 = new JLabel();
		picture10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				CarlistInformation cli = new CarlistInformation();
				cli.frame.setVisible(true);
				frame.dispose();
				//调用相应的方法
				cli.car20();
			}
		});
		Icon icon10 = new ImageIcon(Main.base_path+"/cars/20.png");
		picture10.setIcon(icon10);
		frame.getContentPane().add(picture10);
		picture10.setBounds(440, 351, 220, 168);
		frame.getContentPane().add(picture10);
		
		JButton btnNewButton = new JButton("上一页");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				ShowCars1 sc1 = new ShowCars1();
				sc1.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(355, 531, 143, 35);
		frame.getContentPane().add(btnNewButton);
		frame.setTitle("点击即可查看车辆相关信息！");
		frame.setLocationRelativeTo(null);
	}
}
