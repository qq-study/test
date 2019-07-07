package com.zte.action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import com.zte.dao.UserinfoDAOImpl;
import com.zte.entity.Userinfo;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
public class Regist {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	public Regist() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 573, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("欢迎您进行注册！");
		frame.getContentPane().setLayout(null);
		// 不允许修改尺寸
		frame.setResizable(false);
		
		JLabel picture = new JLabel();
		Icon icon = new ImageIcon(Main.base_path+"RegistWeclome.jpg");
		picture.setIcon(icon);
		picture.setBounds(123, 0, 290, 206);
		frame.getContentPane().add(picture);
		
		JLabel label = new JLabel("手机号码：");
		label.setFont(new Font("宋体", Font.BOLD, 15));
		label.setBounds(90, 330, 80, 37);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("密码：");
		label_1.setFont(new Font("宋体", Font.BOLD, 15));
		label_1.setBounds(115, 294, 55, 37);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("姓名：");
		label_2.setFont(new Font("宋体", Font.BOLD, 15));
		label_2.setBounds(115, 219, 55, 37);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("身份证号码：");
		label_3.setFont(new Font("宋体", Font.BOLD, 15));
		label_3.setBounds(73, 369, 97, 37);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("性别：");
		label_4.setFont(new Font("宋体", Font.BOLD, 15));
		label_4.setBounds(115, 257, 55, 37);
		frame.getContentPane().add(label_4);
		
		textField = new JTextField();
		textField.setBounds(183, 222, 235, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 263, 235, 24);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(184, 338, 235, 24);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(184, 375, 235, 24);
		frame.getContentPane().add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(184, 300, 235, 25);
		frame.getContentPane().add(passwordField);
		
		JButton button = new JButton("立即注册");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				// 把所有的零散信息汇总成对象
				Userinfo ui = new Userinfo();
				ui.setPhone(textField_2.getText());
				String  password = String.valueOf(passwordField.getPassword());
				ui.setPassword(password);
				ui.setGender(textField_1.getText());
				ui.setId(textField_2.getText());
				ui.setRegtime(new Date());
				ui.setTname(textField.getText());
				
				// 交由 转么处理这个对象的 dao 来完成
				UserinfoDAOImpl dao = new UserinfoDAOImpl();
				dao.save(ui);
				
				//使当前窗口不可见，进入下一个窗口
				frame.setVisible(false);
				Celebrate mf = new Celebrate();
				mf.frame.setVisible(true);
				frame.dispose();
			}
		});
		button.setBounds(225, 428, 113, 27);
		frame.getContentPane().add(button);
	}
}
