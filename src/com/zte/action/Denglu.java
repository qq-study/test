package com.zte.action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.zte.dao.UserinfoDAOImpl;
import com.zte.entity.Userinfo;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Denglu {
	public JFrame frame;
	private JTextField username;
	private JButton submit;
	private JPasswordField mima;
	public Denglu() {
		initialize();
	}
	private void initialize(){
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 458, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("欢迎您登录");
		JLabel t1 = new JLabel("手机号码：");
		t1.setHorizontalAlignment(SwingConstants.RIGHT);
		t1.setBounds(14, 59, 122, 22);
		frame.getContentPane().add(t1);
		JLabel t2 = new JLabel("密码:");
		t2.setHorizontalAlignment(SwingConstants.RIGHT);
		t2.setBounds(74, 122, 54, 15);
		frame.getContentPane().add(t2);
		username = new JTextField();
		username.setBounds(136, 56, 235, 29);
		frame.getContentPane().add(username);
		username.setColumns(10);
		submit = new JButton("立刻登陆");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String phone = username.getText();
				String  password = String.valueOf(mima.getPassword());
				UserinfoDAOImpl dao = new UserinfoDAOImpl();
				try {
					Userinfo ui = dao.findByPhone(phone);
					Warning w = new Warning();
					if(ui == null){
						//使当前窗口不可见，进入下一个窗口
						frame.setVisible(false);
						w.frame.setVisible(true);
						frame.dispose();
						w.show("手机号未输入或不正确！", "警告！！！");
					}else{
						if(ui.getPassword().equals(password)){
							//使当前窗口不可见，进入下一个窗口
							frame.setVisible(false);
							ShowCars1 sc1= new ShowCars1();
							sc1.frame.setVisible(true);
							frame.dispose();
						}else{
							//使当前窗口不可见，进入下一个窗口
							frame.setVisible(false);
							w.frame.setVisible(true);
							frame.dispose();
							w.show("密码不正确！", "警告！！！");
						}
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		submit.setBounds(170, 178, 104, 35);
		frame.getContentPane().add(submit);
		mima = new JPasswordField();
		mima.setBounds(136, 117, 235, 29);
		frame.getContentPane().add(mima);
		frame.setLocationRelativeTo(null);
		// 不允许修改尺寸
		frame.setResizable(false);
	}
}
