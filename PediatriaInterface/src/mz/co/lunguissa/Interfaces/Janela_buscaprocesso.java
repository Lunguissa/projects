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

public class Janela_buscaprocesso extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String numero="numero";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela_buscaprocesso frame = new Janela_buscaprocesso();
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
	public Janela_buscaprocesso() {
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
		
		JButton btnSeguinte = new JButton("OK");
		btnSeguinte.setFont(new Font("Consolas", Font.PLAIN, 17));
		btnSeguinte.setBackground(Color.WHITE);
		btnSeguinte.setBounds(367, 405, 113, 30);
		panel_1.add(btnSeguinte);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(309, 175, 242, 199);
		panel_1.add(scrollPane);
		
		JTextPane txtpnOPacienteCom = new JTextPane();
		txtpnOPacienteCom.setEditable(false);
		txtpnOPacienteCom.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtpnOPacienteCom.setText("O paciente com o N\u00FAmero de Processo: \n"+numero+" \nj\u00E1 est\u00E1 registrado! Actualize os dados que forem necess\u00E1rios.");
		scrollPane.setViewportView(txtpnOPacienteCom);
	
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Janela_buscaprocesso.class.getResource("/img/fundo.jpg")));
		lblNewLabel.setBounds(-3, -27, 840, 559);
		panel_1.add(lblNewLabel);
		
		JLabel label_27 = new JLabel("");
		label_27.setLabelFor(contentPane);
		label_27.setIcon(new ImageIcon(Janela_buscaprocesso.class.getResource("/img/siga.PNG")));
		label_27.setBounds(-24, -58, 1242, 824);
		contentPane.add(label_27);
		
		setLocation(point.findScreenCenter(this));
	}
}
