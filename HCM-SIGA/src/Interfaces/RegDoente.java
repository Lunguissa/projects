package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class RegDoente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegDoente frame = new RegDoente();
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
	public RegDoente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 611, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSenha.setBounds(30, 90, 85, 14);
		panel.add(lblSenha);
		
		JLabel label = new JLabel("Senha:");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label.setBounds(30, 115, 85, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Senha:");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_1.setBounds(30, 165, 85, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Senha:");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_2.setBounds(30, 140, 85, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Senha:");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_3.setBounds(30, 215, 85, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Senha:");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_4.setBounds(30, 190, 85, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Senha:");
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_5.setBounds(30, 265, 85, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Senha:");
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_6.setBounds(30, 240, 85, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Senha:");
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_7.setBounds(30, 315, 85, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Senha:");
		label_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_8.setBounds(30, 290, 85, 14);
		panel.add(label_8);
		

	}
}
