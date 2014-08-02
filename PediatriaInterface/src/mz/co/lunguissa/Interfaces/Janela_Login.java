package mz.co.lunguissa.Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.UIManager;

import mz.co.lunguissa.Funcionalidades.point;

import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;

public class Janela_Login extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtTesteas;
	private JPasswordField passwordField;
	private String data,horas,user;
	private Date dataSistema =new Date();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela_Login frame = new Janela_Login();
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
	public Janela_Login() {
		setTitle("HCM");
		setResizable(false);
		
		
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1193, 735);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(24, 129, 838, 555);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnSeguinte = new JButton("Iniciar Sess\u00E3o");
		btnSeguinte.setFont(new Font("Consolas", Font.PLAIN, 17));
		btnSeguinte.setBackground(Color.WHITE);
		btnSeguinte.setBounds(477, 331, 195, 30);
		panel_1.add(btnSeguinte);
		
		JLabel lblNomeDoUtilizador = new JLabel("Nome do Utilizador:");
		lblNomeDoUtilizador.setForeground(Color.BLACK);
		lblNomeDoUtilizador.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNomeDoUtilizador.setBounds(128, 237, 245, 20);
		panel_1.add(lblNomeDoUtilizador);
		
		txtTesteas = new JTextField();
		txtTesteas.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTesteas.setColumns(10);
		txtTesteas.setBackground(Color.WHITE);
		txtTesteas.setBounds(389, 230, 283, 30);
		panel_1.add(txtTesteas);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Consolas", Font.PLAIN, 23));
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(389, 271, 283, 30);
		panel_1.add(passwordField);
		
		JLabel lblPalavrapasse = new JLabel("Palavra-passe:");
		lblPalavrapasse.setForeground(Color.BLACK);
		lblPalavrapasse.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblPalavrapasse.setBounds(129, 276, 216, 20);
		panel_1.add(lblPalavrapasse);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Janela_Login.class.getResource("/img/fundo.jpg")));
		lblNewLabel.setBounds(-3, -27, 840, 582);
		panel_1.add(lblNewLabel);
		
		JLabel label_27 = new JLabel("");
		label_27.setLabelFor(contentPane);
		label_27.setIcon(new ImageIcon(Janela_Login.class.getResource("/img/siga.PNG")));
		label_27.setBounds(-24, -58, 1242, 824);
		contentPane.add(label_27);
	
		
		



		
		setLocation(point.findScreenCenter(this));
	}
	
	
}
