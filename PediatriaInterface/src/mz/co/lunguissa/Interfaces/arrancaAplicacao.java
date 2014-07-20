package mz.co.lunguissa.Interfaces;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JProgressBar;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.ImageIcon;


import java.awt.Window.Type;
import java.io.IOException;
import javax.swing.UIManager;

public class arrancaAplicacao extends JFrame implements Runnable {
	private JLabel lblDinamico;
	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public JProgressBar progressBar;
	private JLabel lblNewLabel_1;
	public static void main(String[] args) {
		arrancaAplicacao sp = new arrancaAplicacao();
		sp.setVisible(true);
		sp.carregar();
	}
	/**
	 * Create the frame.
	 */
	public arrancaAplicacao() {
		super("Conservatória 1.0");
		setTitle("HCM");
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 513);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocation(findScreenCenter());
		progressBar = new JProgressBar();
		progressBar.setBounds(10, 440, 681, 33);
		progressBar.setForeground(new Color(0, 0, 139));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(221, 5, 0, 340);
		lblNewLabel.setForeground(new Color(0, 102, 153));
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 30));
		lblNewLabel.setIcon(new ImageIcon("Capture.PNG"));
		JLabel lblSoft = new JLabel(" Carregando a aplicacao.  Aguarde .......");
		lblSoft.setBounds(89, 387, 419, 53);
		lblSoft.setBackground(new Color(255, 250, 205));
		lblSoft.setForeground(new Color(0, 0, 139));
		lblSoft.setFont(new Font("Rockwell Condensed", Font.PLAIN, 32));
		lblDinamico = new JLabel("10%");
		lblDinamico.setBounds(635, 395, 56, 34);
		lblDinamico.setForeground(new Color(0, 0, 139));
		lblDinamico.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		contentPane.setLayout(null);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(arrancaAplicacao.class.getResource("/img/fundosplash.PNG")));
		lblNewLabel_1.setBounds(-42, -27, 780, 415);
		contentPane.add(lblNewLabel_1);
		contentPane.add(progressBar);
		contentPane.add(lblSoft);
		contentPane.add(lblDinamico);
		contentPane.add(lblNewLabel);
	}
	private Point findScreenCenter() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension mySize = getSize();
		Point fin = new Point(0, 0);
		fin.x = (screenSize.width - mySize.width) / 2;
		fin.y = (screenSize.height - mySize.height) / 2;
		return fin;
	}

	public void carregar() {

		for (int i = 0; i < 101; i++) {
			final int percent = i;
			try {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						progressBar.setValue(percent);
					}
				});
				Thread.sleep(50);
				if (i == 30)
				{
					lblDinamico.setText("30%");
				}
				if (i == 60)
				{
					lblDinamico.setText("60%");
				}
				if (i == 80)
				{
					lblDinamico.setText("98%");
				}
			} catch (InterruptedException e) {
				JOptionPane.showMessageDialog(null,
						"Erro ao carregar a aplicacao : " + e.getMessage());
				e.printStackTrace();
			}
		}
		dispose();
		new Janela_1().setVisible(true);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
