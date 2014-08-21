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
import java.security.Key;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.UIManager;

import mz.co.lunguissa.Funcionalidades.point;

import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Janela_Login extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtUser;
	private JPasswordField txtSenha;
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
		
		point.users.add("programador");
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Janela_Login.class.getResource("/img/atendimento.png")));
		 UIManager.put("OptionPane.yesButtonText", "Sim");  
         UIManager.put("OptionPane.cancelButtonText", "Cancelar");  
         UIManager.put("OptionPane.noButtonText", "Não");  
         UIManager.put("OptionPane.okButtonText", "OK");  
	    Locale.setDefault(new Locale("pt","PT"));  
		addWindowListener(new WindowAdapter() {
			@Override
			  public void windowClosing(WindowEvent e) {  

			    BlockingGlassPane glass = new BlockingGlassPane();  
			    setGlassPane(glass);  
			    glass.setVisible(true);  
                int i = JOptionPane.showConfirmDialog(Janela_Login.this,"Tem certeza que deseja sair?", "Saída",JOptionPane.YES_NO_OPTION); 
              
                if (i == JOptionPane.YES_OPTION) {  
                    System.exit(0);  
                } else {  
                	glass.setVisible(false); 
                   setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }     } 
		});
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
		btnSeguinte.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int code=arg0.getKeyCode();
				if(code==KeyEvent.VK_ENTER){
				if(point.users.contains(txtUser.getText())){
					dispose();
					new Janela_Menu().setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(Janela_Login.this,"Usuario Invalido!!");
					}
				}
			}
		});
		
		btnSeguinte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(point.users.contains(txtUser.getText())){
				dispose();
				new Janela_Menu().setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(Janela_Login.this,"Usuario Invalido!!");
				}
			}
		});
		btnSeguinte.setFont(new Font("Consolas", Font.PLAIN, 18));
		btnSeguinte.setBackground(Color.WHITE);
		btnSeguinte.setBounds(477, 325, 195, 36);
		panel_1.add(btnSeguinte);
		
		JLabel lblNomeDoUtilizador = new JLabel("Nome do Utilizador:");
		lblNomeDoUtilizador.setForeground(Color.BLACK);
		lblNomeDoUtilizador.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNomeDoUtilizador.setBounds(128, 237, 245, 20);
		panel_1.add(lblNomeDoUtilizador);
		
		txtUser = new JTextField();
		txtUser.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int code=arg0.getKeyCode();
				if(code==KeyEvent.VK_ENTER){
				if(point.users.contains(txtUser.getText())){
					dispose();
					new Janela_Menu().setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(Janela_Login.this,"Usuario Invalido!!");
					}
				}
			}
		});
		
		txtUser.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtUser.setColumns(10);
		txtUser.setBackground(Color.WHITE);
		txtUser.setBounds(389, 230, 283, 30);
		panel_1.add(txtUser);
		
		txtSenha = new JPasswordField();
		txtSenha.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int code=arg0.getKeyCode();
				if(code==KeyEvent.VK_ENTER){
				if(point.users.contains(txtUser.getText())){
					dispose();
					new Janela_Menu().setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(Janela_Login.this,"Usuario Invalido!!");
					}
				}
			}
		});
		txtSenha.setFont(new Font("Consolas", Font.PLAIN, 23));
		txtSenha.setBackground(Color.WHITE);
		txtSenha.setBounds(389, 271, 283, 30);
		panel_1.add(txtSenha);
		
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
