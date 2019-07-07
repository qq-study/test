package com.zte.action;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
public class Main {
	public static String base_path;
	static {
		String p = Main.class.getResource("/").getPath();
		p = p.substring(0, p.lastIndexOf("bin/"))+"res/";
		base_path=p;
	}
	JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Main() {
		initialize();
	}
	JProgressBar progressBar;
	private void initialize() {
		frame = new JFrame();
		frame.setSize(543,276);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(new BorderLayout());
		//导入图片
		JLabel wi = new JLabel();
		Icon icon = new ImageIcon(Main.base_path+"logo.png");
		wi.setIcon(icon);
		//设置图片居中布局
		frame.getContentPane().add(wi,BorderLayout.CENTER);
		progressBar = new JProgressBar();
		frame.getContentPane().add(progressBar, BorderLayout.SOUTH);
		//启动多线程 执行任务
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				int count = 0;
				while(count < 100) {
					count+=20;
					progressBar.setValue(count);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				Main.this.frame.setVisible(false);
				Business b = new Business();
				b.frame.setVisible(true);
				Main.this.frame.dispose();
			}
		}).start();
	}
}
