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

public class Janela_buscaprocessoTriagem extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String numero="numero";
	private JTextField textField;
	private String data,horas,user;
	private Date dataSistema =new Date();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela_buscaprocessoTriagem frame = new Janela_buscaprocessoTriagem();
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
	public Janela_buscaprocessoTriagem() {
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
                int i = JOptionPane.showConfirmDialog(Janela_buscaprocessoTriagem.this ,"Deseja voltar ao Menu Principal?", "Saída",JOptionPane.YES_NO_OPTION); 
              
                if (i == JOptionPane.YES_OPTION) {  
                	 dispose();  
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
		
		point.users.add("Usuario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		JButton btnSeguinte = new JButton("Seguinte");
		btnSeguinte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSeguinte.setFont(new Font("Consolas", Font.PLAIN, 17));
		btnSeguinte.setBackground(Color.WHITE);
		btnSeguinte.setBounds(449, 259, 155, 37);
		panel_1.add(btnSeguinte);
		
		JLabel lblNmeroDeProcesso = new JLabel("N\u00FAmero do Processo:");
		lblNmeroDeProcesso.setForeground(Color.BLACK);
		lblNmeroDeProcesso.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNmeroDeProcesso.setBounds(60, 225, 245, 20);
		panel_1.add(lblNmeroDeProcesso);
		
		JLabel lblData = new JLabel("2 de August de 2014");
		lblData.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblData.setBounds(292, 488, 170, 30);
		panel_1.add(lblData);
		
		JLabel label_2 = new JLabel("::");
		label_2.setFont(new Font("Consolas", Font.PLAIN, 14));
		label_2.setBounds(467, 488, 68, 30);
		panel_1.add(label_2);
		
		JLabel lblUser = new JLabel("Abel Fabiao");
		lblUser.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblUser.setBounds(467, 514, 245, 30);
		panel_1.add(lblUser);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(321, 218, 283, 30);
		panel_1.add(textField);
		
		JLabel label_4 = new JLabel("Nome do Utilizador:");
		label_4.setFont(new Font("Consolas", Font.PLAIN, 14));
		label_4.setBounds(292, 514, 170, 30);
		panel_1.add(label_4);
		
		JLabel lblHora = new JLabel("20:15");
		lblHora.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblHora.setBounds(489, 488, 96, 30);
		panel_1.add(lblHora);
	
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Janela_buscaprocessoTriagem.class.getResource("/img/fundo.jpg")));
		lblNewLabel.setBounds(-3, -27, 840, 582);
		panel_1.add(lblNewLabel);
		
		JLabel label_27 = new JLabel("");
		label_27.setLabelFor(contentPane);
		label_27.setIcon(new ImageIcon(Janela_buscaprocessoTriagem.class.getResource("/img/siga.PNG")));
		label_27.setBounds(-24, -58, 1242, 824);
		contentPane.add(label_27);
		
		 DateFormat dfmt = new SimpleDateFormat("d 'de' MMMM 'de' yyyy",new Locale("pt", "PT"));  
	     data=dfmt.format(dataSistema);
	     lblData.setText(data);
	     
	     
	     SimpleDateFormat timeFormat = new SimpleDateFormat("HH'h':mm'm'");
	     horas=timeFormat.format(dataSistema);
	     lblHora.setText(horas);
	    // user=point.users.get(0);
	     lblUser.setText("Usuario");
		setLocation(point.findScreenCenter(this));
	}
}
