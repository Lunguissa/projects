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
import java.util.Date;
import java.util.Locale;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;

public class Janela_1 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtTesteas;
	private JTextField txtAgostinhoMavota;
	private JTextField txtMafalala;
	private JTextField txtCeleste;
	private JTextField txtMe;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela_1 frame = new Janela_1();
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
	public Janela_1() {
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(25, 130, 837, 556);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Informação do Doente", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton button = new JButton("Limpar");
		button.setBackground(Color.WHITE);
		button.setBounds(579, 469, 115, 48);
		panel_1.add(button);
		
		JLabel lblNmeroDeProcesso = new JLabel("N\u00FAmero de Processo:");
		lblNmeroDeProcesso.setForeground(Color.BLACK);
		lblNmeroDeProcesso.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNmeroDeProcesso.setBounds(69, 42, 283, 20);
		panel_1.add(lblNmeroDeProcesso);
		
		txtTesteas = new JTextField();
		txtTesteas.setText("97654");
		txtTesteas.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTesteas.setColumns(10);
		txtTesteas.setBackground(Color.WHITE);
		txtTesteas.setBounds(362, 35, 216, 30);
		panel_1.add(txtTesteas);
		
		txtAgostinhoMavota = new JTextField();
		txtAgostinhoMavota.setText("Agostinho Mavota");
		txtAgostinhoMavota.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtAgostinhoMavota.setColumns(10);
		txtAgostinhoMavota.setBackground(Color.WHITE);
		txtAgostinhoMavota.setBounds(362, 76, 332, 30);
		panel_1.add(txtAgostinhoMavota);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setForeground(Color.BLACK);
		lblDataDeNascimento.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblDataDeNascimento.setBounds(69, 117, 283, 35);
		panel_1.add(lblDataDeNascimento);
		
		JLabel lblNomeDoDoente = new JLabel("Nome do Doente:");
		lblNomeDoDoente.setForeground(Color.BLACK);
		lblNomeDoDoente.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNomeDoDoente.setBounds(69, 83, 283, 20);
		panel_1.add(lblNomeDoDoente);
		
		JLabel lblNReciboDo = new JLabel("Morada:");
		lblNReciboDo.setForeground(Color.BLACK);
		lblNReciboDo.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNReciboDo.setBounds(68, 249, 284, 35);
		panel_1.add(lblNReciboDo);
		
		JLabel lblNReciboDas = new JLabel("Cidade:");
		lblNReciboDas.setForeground(Color.BLACK);
		lblNReciboDas.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNReciboDas.setBounds(69, 290, 283, 35);
		panel_1.add(lblNReciboDas);
		
		txtMafalala = new JTextField();
		txtMafalala.setText("Mafalala");
		txtMafalala.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtMafalala.setColumns(10);
		txtMafalala.setBackground(Color.WHITE);
		txtMafalala.setBounds(362, 249, 332, 30);
		panel_1.add(txtMafalala);
		
		JRadioButton radioButton = new JRadioButton("Feminino");
		buttonGroup.add(radioButton);
		radioButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		radioButton.setBackground(Color.WHITE);
		radioButton.setBounds(490, 158, 109, 30);
		panel_1.add(radioButton);
		
		JLabel label = new JLabel("Sexo:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Consolas", Font.PLAIN, 20));
		label.setBounds(69, 168, 283, 20);
		panel_1.add(label);
		
		JRadioButton radioButton_1 = new JRadioButton("Masculino");
		buttonGroup.add(radioButton_1);
		radioButton_1.setSelected(true);
		radioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		radioButton_1.setBackground(Color.WHITE);
		radioButton_1.setBounds(362, 158, 109, 30);
		panel_1.add(radioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "< 1 m\u00EAs", "1-11m", "12m-5anos", "5-10anos", ">10 anos"}));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox.setBounds(360, 199, 218, 32);
		panel_1.add(comboBox);
		
		JLabel label_1 = new JLabel("Idade:");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_1.setBounds(69, 203, 283, 35);
		panel_1.add(label_1);
		
		JLabel lblNomeDoAcompanhante = new JLabel("Nome do Acompanhante:");
		lblNomeDoAcompanhante.setForeground(Color.BLACK);
		lblNomeDoAcompanhante.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNomeDoAcompanhante.setBounds(69, 331, 283, 35);
		panel_1.add(lblNomeDoAcompanhante);
		
		JLabel lblGrauDeParentesco = new JLabel("Grau de Parentesco:");
		lblGrauDeParentesco.setForeground(Color.BLACK);
		lblGrauDeParentesco.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblGrauDeParentesco.setBounds(69, 377, 283, 35);
		panel_1.add(lblGrauDeParentesco);
		
		txtMe = new JTextField();
		txtMe.setText("M\u00E3e");
		txtMe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtMe.setColumns(10);
		txtMe.setBackground(Color.WHITE);
		txtMe.setBounds(362, 378, 332, 30);
		panel_1.add(txtMe);
		
		txtCeleste = new JTextField();
		txtCeleste.setText("Celeste");
		txtCeleste.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtCeleste.setColumns(10);
		txtCeleste.setBackground(Color.WHITE);
		txtCeleste.setBounds(362, 332, 332, 30);
		panel_1.add(txtCeleste);
		
		JLabel lblContactoAcompanhante = new JLabel("Contacto do Acompanhante:");
		lblContactoAcompanhante.setForeground(Color.BLACK);
		lblContactoAcompanhante.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblContactoAcompanhante.setBounds(69, 423, 283, 35);
		panel_1.add(lblContactoAcompanhante);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setLocale(new Locale("pt", "PT"));
		dateChooser.setBounds(362, 117, 147, 35);
		panel_1.add(dateChooser);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "Maputo Cidade", "Maputo Provincia", "Outros"}));
		comboBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_3.setBounds(360, 293, 218, 32);
		panel_1.add(comboBox_3);
		
		textField_6 = new JTextField();
		textField_6.setText("82545783");
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(362, 424, 332, 30);
		panel_1.add(textField_6);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Janela_1.class.getResource("/img/fundo.jpg")));
		lblNewLabel.setBounds(-3, -27, 840, 559);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		tabbedPane.addTab("Situação de Saude", null, panel_2, null);
		
		JButton button_2 = new JButton("Limpar");
		button_2.setFont(new Font("Consolas", Font.PLAIN, 17));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(570, 453, 115, 48);
		panel_2.add(button_2);
		
		JLabel lblProviniencia_1 = new JLabel("Proveni\u00EAncia :");
		lblProviniencia_1.setForeground(Color.BLACK);
		lblProviniencia_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblProviniencia_1.setBounds(76, 115, 183, 35);
		panel_2.add(lblProviniencia_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "Transfer\u00EAncia do Estado", "Asma", "Dador de Sange", "Antigos  Combatentes", "Sem Recurso, Pessoal", "Outra"}));
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_1.setBounds(359, 65, 217, 32);
		panel_2.add(comboBox_1);
		
		JLabel lblIsenoDePagamento = new JLabel("Isen\u00E7\u00E3o de Pagamento:");
		lblIsenoDePagamento.setForeground(Color.BLACK);
		lblIsenoDePagamento.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblIsenoDePagamento.setBounds(75, 71, 260, 22);
		panel_2.add(lblIsenoDePagamento);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "Casa", "HG Mavalane", "HG Chamanculo", "HGJM", "HG Infulene", "CS Sa\u00FAde da Cidade", "CS da Prov\u00EDncia", "Gaza", "Inhambane", "Outras Prov\u00EDncias", "Clin\u00EDcas do HCM", "US Privadas"}));
		comboBox_7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_7.setBounds(360, 111, 216, 32);
		panel_2.add(comboBox_7);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(359, 339, 350, 30);
		panel_2.add(textField_7);
		
		JLabel label_3 = new JLabel("N\u00BA Recibo das An\u00E1lises:");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_3.setBounds(76, 339, 267, 35);
		panel_2.add(label_3);
		
		JLabel label_2 = new JLabel("An\u00E1lises Pedidas:");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_2.setBounds(75, 160, 252, 35);
		panel_2.add(label_2);
		
		JCheckBox chckbxHtz = new JCheckBox("HTZ");
		chckbxHtz.setFont(new Font("Consolas", Font.PLAIN, 14));
		chckbxHtz.setBounds(359, 165, 144, 30);
		panel_2.add(chckbxHtz);
		
		JCheckBox chckbxUrina = new JCheckBox("Urina");
		chckbxUrina.setFont(new Font("Consolas", Font.PLAIN, 14));
		chckbxUrina.setBounds(512, 167, 144, 30);
		panel_2.add(chckbxUrina);
		
		JCheckBox chckbxHiv = new JCheckBox("HIV");
		chckbxHiv.setFont(new Font("Consolas", Font.PLAIN, 14));
		chckbxHiv.setBounds(359, 212, 144, 30);
		panel_2.add(chckbxHiv);
		
		JCheckBox chckbxRx = new JCheckBox("RX");
		chckbxRx.setFont(new Font("Consolas", Font.PLAIN, 14));
		chckbxRx.setBounds(512, 212, 144, 30);
		panel_2.add(chckbxRx);
		
		JCheckBox chckbxHemograma = new JCheckBox("Hemograma");
		chckbxHemograma.setFont(new Font("Consolas", Font.PLAIN, 14));
		chckbxHemograma.setBounds(359, 259, 144, 30);
		panel_2.add(chckbxHemograma);
		
		JCheckBox chckbxBioquimica = new JCheckBox("Bioquimica");
		chckbxBioquimica.setFont(new Font("Consolas", Font.PLAIN, 14));
		chckbxBioquimica.setBounds(512, 257, 144, 30);
		panel_2.add(chckbxBioquimica);
		
		JCheckBox chckbxOutras = new JCheckBox("Outras");
		chckbxOutras.setFont(new Font("Consolas", Font.PLAIN, 14));
		chckbxOutras.setBounds(359, 302, 144, 30);
		panel_2.add(chckbxOutras);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setFont(new Font("Consolas", Font.PLAIN, 17));
		btnGravar.setBackground(Color.WHITE);
		btnGravar.setBounds(441, 453, 115, 48);
		panel_2.add(btnGravar);
		
		JLabel label_30 = new JLabel("New label");
		label_30.setLabelFor(panel_2);
		label_30.setIcon(new ImageIcon(Janela_1.class.getResource("/img/fundo.jpg")));
		label_30.setBounds(-3, -21, 975, 560);
		panel_2.add(label_30);
		
		JLabel label_27 = new JLabel("");
		label_27.setLabelFor(contentPane);
		label_27.setIcon(new ImageIcon(Janela_1.class.getResource("/img/siga.PNG")));
		label_27.setBounds(-24, -58, 1242, 824);
		contentPane.add(label_27);
		
		setLocation(point.findScreenCenter(this));
	}
}
