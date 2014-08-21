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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
import java.awt.Toolkit;

public class Janela_buscaencontrada extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String numero="numero";
	private String data,horas,user;
	private Date dataSistema =new Date();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela_buscaencontrada frame = new Janela_buscaencontrada();
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
	public Janela_buscaencontrada() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Janela_buscaencontrada.class.getResource("/img/atendimento.png")));
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
                int i = JOptionPane.showConfirmDialog(Janela_buscaencontrada.this ,"Deseja voltar ao Menu Principal?", "Saída",JOptionPane.YES_NO_OPTION); 
              
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
		
		JLabel lblUser = new JLabel("<dynamic>");
		lblUser.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblUser.setBounds(462, 514, 245, 30);
		panel_1.add(lblUser);
		
		JLabel label_1 = new JLabel("Nome do Utilizador:");
		label_1.setFont(new Font("Consolas", Font.PLAIN, 14));
		label_1.setBounds(287, 514, 170, 30);
		panel_1.add(label_1);
		
		JLabel lblData = new JLabel("2 de August de 2014");
		lblData.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblData.setBounds(287, 488, 170, 30);
		panel_1.add(lblData);
		
		JLabel label_3 = new JLabel("::");
		label_3.setFont(new Font("Consolas", Font.PLAIN, 14));
		label_3.setBounds(462, 488, 68, 30);
		panel_1.add(label_3);
		
		JLabelTimer lblHora = new JLabelTimer();
		lblHora.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblHora.setBounds(484, 488, 96, 30);
		panel_1.add(lblHora);
	
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Janela_buscaencontrada.class.getResource("/img/fundo.jpg")));
		lblNewLabel.setBounds(-3, -27, 840, 582);
		panel_1.add(lblNewLabel);
		
		JLabel label_27 = new JLabel("");
		label_27.setLabelFor(contentPane);
		label_27.setIcon(new ImageIcon(Janela_buscaencontrada.class.getResource("/img/siga.PNG")));
		label_27.setBounds(-24, -58, 1242, 824);
		
		contentPane.add(label_27);
		

		
		 DateFormat dfmt = new SimpleDateFormat("d 'de' MMMM 'de' yyyy",new Locale("pt", "PT"));  
	     data=dfmt.format(dataSistema);
	     lblData.setText(data);
	     
	     SimpleDateFormat timeFormat = new SimpleDateFormat("HH'h':mm'm'");
	     horas=timeFormat.format(dataSistema);
	     lblHora.setText(horas);
	     user=point.users.get(0);
	     lblUser.setText(point.users.get(0));
		setLocation(point.findScreenCenter(this));
	}
}
