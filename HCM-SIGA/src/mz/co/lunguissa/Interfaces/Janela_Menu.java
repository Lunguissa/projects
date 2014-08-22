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

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.UIManager;

import mz.co.lunguissa.Funcionalidades.DateTextField;
import mz.co.lunguissa.Funcionalidades.ObservingTextField;
import mz.co.lunguissa.Funcionalidades.point;

import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import com.qt.datapicker.DatePicker;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.toedter.calendar.JDateChooser;

import javax.swing.JCheckBox;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Janela_Menu extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String data,horas,user;
	private Date dataSistema =new Date();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela_Menu frame = new Janela_Menu();
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
	public Janela_Menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Janela_Menu.class.getResource("/img/atendimento.png")));
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
                int i = JOptionPane.showConfirmDialog(Janela_Menu.this ,"Tem certeza que deseja sair?", "Saída",JOptionPane.YES_NO_OPTION); 
              
                if (i == JOptionPane.YES_OPTION) {  
                	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                	  new Janela_Login().setVisible(true); 
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
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 129, 838, 556);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Janela_Menu.class.getResource("/img/doctor225.png")));
		label.setBounds(439, 107, 191, 194);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Janela_Menu.class.getResource("/img/cadastro225.png")));
		label_1.setBounds(234, 107, 205, 205);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Janela_Menu.class.getResource("/img/reception225.png")));
		label_2.setBounds(10, 96, 225, 216);
		panel.add(label_2);
		
		JLabel lblData = new JLabel("18 de August de 2014");
		lblData.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblData.setBounds(255, 489, 170, 30);
		panel.add(lblData);
		
		JLabel label_4 = new JLabel("::");
		label_4.setFont(new Font("Consolas", Font.PLAIN, 14));
		label_4.setBounds(430, 489, 68, 30);
		panel.add(label_4);
		
		JLabelTimer lblHora = new JLabelTimer();

		lblHora.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblHora.setBounds(452, 489, 96, 30);
		panel.add(lblHora);
		
		JLabel lblUser = new JLabel("<dynamic>");
		lblUser.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblUser.setBounds(430, 515, 245, 30);
		panel.add(lblUser);
		
		JLabel label_7 = new JLabel("Nome do Utilizador:");
		label_7.setFont(new Font("Consolas", Font.PLAIN, 14));
		label_7.setBounds(255, 515, 170, 30);
		panel.add(label_7);
		
		JButton btnRecepo = new JButton("Recep\u00E7\u00E3o");
		btnRecepo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int code=arg0.getKeyCode();
				if(code==KeyEvent.VK_ENTER){
					new Janela_buscaprocesso().setVisible(true);
				}
			}
		});
		btnRecepo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Janela_buscaprocesso().setVisible(true);
			}
		});
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Janela_Menu.class.getResource("/img/administrator.png")));
		label_3.setBounds(639, 111, 191, 194);
		panel.add(label_3);
		btnRecepo.setFont(new Font("Consolas", Font.PLAIN, 20));
		btnRecepo.setBackground(Color.WHITE);
		btnRecepo.setBounds(10, 389, 215, 57);
		panel.add(btnRecepo);
		
		JButton btnTraigem = new JButton("Triagem");
		btnTraigem.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int code=arg0.getKeyCode();
				if(code==KeyEvent.VK_ENTER){
					new Janela_buscaprocessoTriagem().setVisible(true);
				}
			}
		});
		btnTraigem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Janela_buscaprocessoTriagem().setVisible(true);
			}
		});
		btnTraigem.setFont(new Font("Consolas", Font.PLAIN, 20));
		btnTraigem.setBackground(Color.WHITE);
		btnTraigem.setBounds(235, 389, 208, 57);
		panel.add(btnTraigem);
		
		JButton btnMedico = new JButton("M\u00E9dico");
		btnMedico.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				int code=arg0.getKeyCode();
				if(code==KeyEvent.VK_ENTER){
					new Janela_3().setVisible(true);
				}
			}
		});
		btnMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Janela_3().setVisible(true);
			}
		});
		btnMedico.setFont(new Font("Consolas", Font.PLAIN, 20));
		btnMedico.setBackground(Color.WHITE);
		btnMedico.setBounds(454, 389, 180, 57);
		panel.add(btnMedico);
		
		JButton btnAdministrao = new JButton("Administra\u00E7\u00E3o");
		btnAdministrao.setFont(new Font("Consolas", Font.PLAIN, 20));
		btnAdministrao.setBackground(Color.WHITE);
		btnAdministrao.setBounds(644, 389, 184, 57);
		panel.add(btnAdministrao);
		
		JLabel lblFundo = new JLabel("fundo");
		lblFundo.setBounds(-551, 0, 1961, 757);
		lblFundo.setIcon(new ImageIcon(Janela_Menu.class.getResource("/img/fundo.jpg")));
		panel.add(lblFundo);
		
		JLabel label_27 = new JLabel("");
		label_27.setLabelFor(contentPane);
		label_27.setIcon(new ImageIcon(Janela_Menu.class.getResource("/img/siga.PNG")));
		label_27.setBounds(-24, -58, 1242, 824);
		contentPane.add(label_27);
		 DateFormat dfmt = new SimpleDateFormat("d 'de' MMMM 'de' yyyy",new Locale("pt", "PT"));  
	     data=dfmt.format(dataSistema);
	     
	     lblData.setText(data);
	     
	     
	     SimpleDateFormat timeFormat = new SimpleDateFormat("HH'h':mm'm'");
	     horas=timeFormat.format(dataSistema);
	     lblHora.setText(horas);
	     //user=point.users.get(0);
	     lblUser.setText(point.users.get(0));
		
		setLocation(point.findScreenCenter(this));
	}
}
