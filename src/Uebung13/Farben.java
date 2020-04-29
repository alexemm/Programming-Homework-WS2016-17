package Uebung13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Farben extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Farben frame = new Farben();
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
	public Farben() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 28, 402, 46);
		contentPane.add(panel);

		JSlider slider = new JSlider();
		slider.setPaintLabels(true);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				panel.setBackground(new Color(slider.getValue(), panel.getBackground().getGreen(),
						panel.getBackground().getBlue()));
			}
		});
		slider.setSnapToTicks(true);
		slider.setMaximum(255);
		slider.setBounds(99, 125, 313, 23);
		contentPane.add(slider);

		JSlider slider_1 = new JSlider();
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				panel.setBackground(new Color(panel.getBackground().getRed(), slider_1.getValue(),
						panel.getBackground().getBlue()));
			}
		});
		slider_1.setMaximum(255);
		slider_1.setBounds(99, 159, 313, 23);
		contentPane.add(slider_1);

		JSlider slider_2 = new JSlider();
		slider_2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				panel.setBackground(new Color(panel.getBackground().getRed(), panel.getBackground().getGreen(),
						slider_2.getValue()));
			}
		});
		slider_2.setMaximum(255);
		slider_2.setBounds(99, 193, 313, 23);
		contentPane.add(slider_2);

		JLabel lblRot = new JLabel("Rot");
		lblRot.setBounds(10, 134, 46, 14);
		contentPane.add(lblRot);

		JLabel lblGruen = new JLabel("Gruen");
		lblGruen.setBounds(10, 168, 46, 14);
		contentPane.add(lblGruen);

		JLabel lblBlau = new JLabel("Blau");
		lblBlau.setBounds(10, 202, 46, 14);
		contentPane.add(lblBlau);
	}

}
