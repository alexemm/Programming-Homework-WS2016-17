package Uebung13;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Schiebepuzzle extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Schiebepuzzle frame = new Schiebepuzzle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Schiebepuzzle() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("Schiebepuzzle");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnHidden = new JButton("");
		btnHidden.setEnabled(false);
		btnHidden.setBounds(187, 190, 60, 60);
		contentPane.add(btnHidden);

		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button.setBounds(10, 13, 60, 60);
		contentPane.add(button);

		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button_1;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button_1.setBounds(69, 13, 60, 60);
		contentPane.add(button_1);

		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button_2;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button_2.setBounds(128, 13, 60, 60);
		contentPane.add(button_2);

		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button_3;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button_3.setBounds(187, 13, 60, 60);
		contentPane.add(button_3);

		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button_4;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button_4.setBounds(10, 72, 60, 60);
		contentPane.add(button_4);

		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button_5;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button_5.setBounds(69, 72, 60, 60);
		contentPane.add(button_5);

		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button_6;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button_6.setBounds(128, 72, 60, 60);
		contentPane.add(button_6);

		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button_7;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button_7.setBounds(187, 72, 60, 60);
		contentPane.add(button_7);

		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button_8;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button_8.setBounds(10, 131, 60, 60);
		contentPane.add(button_8);

		JButton button_9 = new JButton("10");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button_9;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button_9.setBounds(69, 131, 60, 60);
		contentPane.add(button_9);

		JButton button_10 = new JButton("11");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button_10;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button_10.setBounds(128, 131, 60, 60);
		contentPane.add(button_10);

		JButton button_11 = new JButton("12");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button_11;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button_11.setBounds(187, 131, 60, 60);
		contentPane.add(button_11);

		JButton button_12 = new JButton("13");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button_12;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button_12.setBounds(10, 190, 60, 60);
		contentPane.add(button_12);

		JButton button_13 = new JButton("14");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button_13;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button_13.setBounds(69, 190, 60, 60);
		contentPane.add(button_13);

		JButton button_14 = new JButton("15");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton b = button_14;
				int metrik = Math.abs(b.getX()-btnHidden.getX()) + Math.abs(b.getY()-btnHidden.getY());
				if(metrik == 59) {
					int locX = btnHidden.getX();
					int locY = btnHidden.getY();
					btnHidden.setLocation(b.getX(),b.getY());
					b.setLocation(locX,locY);
				}

			}
		});
		button_14.setBounds(128, 190, 60, 60);
		contentPane.add(button_14);

	}
}
