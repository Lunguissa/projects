package Interfaces;
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
import Testes.runTeste;
import java.awt.Window.Type;
import java.io.IOException;

public class arrancaAplicacao extends JFrame implements Runnable {
	private JLabel lblDinamico;
	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public JProgressBar progressBar;
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
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 513);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocation(findScreenCenter());
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(0, 204, 0));
		progressBar.setIndeterminate(true);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(0, 102, 153));
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 30));
		lblNewLabel.setIcon(new ImageIcon("Capture.PNG"));
		JLabel lblSoft = new JLabel(" Carregando a aplicacao.  Aguarde .......");
		lblSoft.setBackground(new Color(255, 250, 205));
		lblSoft.setForeground(new Color(255, 250, 240));
		lblSoft.setFont(new Font("Rockwell Condensed", Font.PLAIN, 32));
		lblDinamico = new JLabel("10%");
		lblDinamico.setForeground(new Color(255, 250, 250));
		lblDinamico.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING,
																								false)
																						.addComponent(
																								progressBar,
																								GroupLayout.PREFERRED_SIZE,
																								649,
																								GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addComponent(
																												lblSoft,
																												GroupLayout.PREFERRED_SIZE,
																												419,
																												GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												ComponentPlacement.RELATED,
																												GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												lblDinamico))))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(132)
																		.addComponent(
																				lblNewLabel)))
										.addContainerGap(32, Short.MAX_VALUE)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addComponent(lblNewLabel,
												GroupLayout.PREFERRED_SIZE,
												340, GroupLayout.PREFERRED_SIZE)
										.addGap(31)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblSoft,
																GroupLayout.DEFAULT_SIZE,
																53,
																Short.MAX_VALUE)
														.addComponent(
																lblDinamico))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(progressBar,
												GroupLayout.PREFERRED_SIZE, 33,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
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
		new RegDoente().setVisible(true);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
