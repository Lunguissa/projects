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
import mz.co.lunguissa.Funcionalidades.point;

import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;

public class Janela_2 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtTesteas;
	private JTextField txtAgostinhoMavota;
	private JTextField textField_2;
	private JTextField txtMafalala;
	private JTextField txtCeleste;
	private JTextField txtMe;
	private JTextField textField_6;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela_2 frame = new Janela_2();
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
	public Janela_2() {
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
		
		JLabel lblNmeroDeProcesso = new JLabel("N\u00FAmero de Processo:");
		lblNmeroDeProcesso.setForeground(Color.BLACK);
		lblNmeroDeProcesso.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNmeroDeProcesso.setBounds(69, 42, 283, 20);
		panel_1.add(lblNmeroDeProcesso);
		
		txtTesteas = new JTextField();
		txtTesteas.setEditable(false);
		txtTesteas.setText("97654");
		txtTesteas.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtTesteas.setColumns(10);
		txtTesteas.setBackground(Color.WHITE);
		txtTesteas.setBounds(362, 35, 216, 30);
		panel_1.add(txtTesteas);
		
		txtAgostinhoMavota = new JTextField();
		txtAgostinhoMavota.setEditable(false);
		txtAgostinhoMavota.setText("Agostinho Mavota");
		txtAgostinhoMavota.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtAgostinhoMavota.setColumns(10);
		txtAgostinhoMavota.setBackground(Color.WHITE);
		txtAgostinhoMavota.setBounds(362, 76, 332, 30);
		panel_1.add(txtAgostinhoMavota);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.repaint();
		textField_2.setText("20/07/1991");
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(362, 117, 216, 30);
		panel_1.add(textField_2);
		
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
		txtMafalala.setEditable(false);
		txtMafalala.setText("Mafalala");
		txtMafalala.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtMafalala.setColumns(10);
		txtMafalala.setBackground(Color.WHITE);
		txtMafalala.setBounds(362, 249, 332, 30);
		panel_1.add(txtMafalala);
		
		JRadioButton radioButton = new JRadioButton("Feminino");
		radioButton.setEnabled(false);
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
		radioButton_1.setEnabled(false);
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
		txtMe.setEditable(false);
		txtMe.setText("M\u00E3e");
		txtMe.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtMe.setColumns(10);
		txtMe.setBackground(Color.WHITE);
		txtMe.setBounds(362, 378, 332, 30);
		panel_1.add(txtMe);
		
		txtCeleste = new JTextField();
		txtCeleste.setEditable(false);
		txtCeleste.setText("Celeste");
		txtCeleste.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtCeleste.setColumns(10);
		txtCeleste.setBackground(Color.WHITE);
		txtCeleste.setBounds(362, 332, 332, 30);
		panel_1.add(txtCeleste);
		
		JButton button = new JButton("Editar");
		button.setBackground(Color.WHITE);
		button.setBounds(443, 469, 115, 48);
		panel_1.add(button);
		
		JButton button_5 = new JButton("Limpar");
		button_5.setEnabled(false);
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(579, 469, 115, 48);
		panel_1.add(button_5);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "Maputo Cidade", "Maputo Provincia", "Outros"}));
		comboBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_4.setBounds(360, 290, 218, 32);
		panel_1.add(comboBox_4);
		
		JLabel lblContactoAcompanhante = new JLabel("Contacto do Acompanhante:");
		lblContactoAcompanhante.setForeground(Color.BLACK);
		lblContactoAcompanhante.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblContactoAcompanhante.setBounds(69, 423, 283, 35);
		panel_1.add(lblContactoAcompanhante);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setText("82545783");
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(362, 424, 332, 30);
		panel_1.add(textField_6);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Janela_2.class.getResource("/img/fundo.jpg")));
		lblNewLabel.setBounds(-3, -27, 840, 559);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		tabbedPane.addTab("Situação de Saude", null, panel_2, null);
		
		JButton button_2 = new JButton("Editar");
		button_2.setFont(new Font("Consolas", Font.PLAIN, 17));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(309, 448, 115, 48);
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("Gravar");
		button_3.setFont(new Font("Consolas", Font.PLAIN, 17));
		button_3.setEnabled(false);
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(441, 448, 115, 48);
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("Limpar");
		button_4.setFont(new Font("Consolas", Font.PLAIN, 17));
		button_4.setEnabled(false);
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(570, 448, 115, 48);
		panel_2.add(button_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(343, 354, 350, 30);
		panel_2.add(textField);
		
		JLabel label_2 = new JLabel("N\u00BA Recibo das An\u00E1lises:");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_2.setBounds(54, 354, 267, 35);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("An\u00E1lises Pedidas:");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_3.setBounds(54, 158, 252, 35);
		panel_2.add(label_3);
		
		JLabel label_6 = new JLabel("Proveni\u00EAncia :");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_6.setBounds(55, 113, 183, 35);
		panel_2.add(label_6);
		
		JCheckBox checkBox = new JCheckBox("HTZ");
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 14));
		checkBox.setBounds(343, 170, 144, 30);
		panel_2.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Urina");
		checkBox_1.setFont(new Font("Consolas", Font.PLAIN, 14));
		checkBox_1.setBounds(496, 172, 144, 30);
		panel_2.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("RX");
		checkBox_2.setFont(new Font("Consolas", Font.PLAIN, 14));
		checkBox_2.setBounds(496, 217, 144, 30);
		panel_2.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("HIV");
		checkBox_3.setFont(new Font("Consolas", Font.PLAIN, 14));
		checkBox_3.setBounds(343, 217, 144, 30);
		panel_2.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("Hemograma");
		checkBox_4.setFont(new Font("Consolas", Font.PLAIN, 14));
		checkBox_4.setBounds(343, 264, 144, 30);
		panel_2.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Bioquimica");
		checkBox_5.setFont(new Font("Consolas", Font.PLAIN, 14));
		checkBox_5.setBounds(496, 262, 144, 30);
		panel_2.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("Outras");
		checkBox_6.setFont(new Font("Consolas", Font.PLAIN, 14));
		checkBox_6.setBounds(343, 307, 144, 30);
		panel_2.add(checkBox_6);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "Casa", "HG Mavalane", "HG Chamanculo", "HGJM", "HG Infulene", "CS Sa\u00FAde da Cidade", "CS da Prov\u00EDncia", "Gaza", "Inhambane", "Outras Prov\u00EDncias", "Clin\u00EDcas do HCM", "US Privadas"}));
		comboBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_2.setBounds(339, 109, 216, 32);
		panel_2.add(comboBox_2);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "Transfer\u00EAncia do Estado", "Asma", "Dador de Sange", "Antigos  Combatentes", "Sem Recurso, Pessoal", "Outra"}));
		comboBox_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_5.setBounds(338, 63, 217, 32);
		panel_2.add(comboBox_5);
		
		JLabel label_7 = new JLabel("Isen\u00E7\u00E3o de Pagamento:");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_7.setBounds(54, 69, 260, 22);
		panel_2.add(label_7);
		
		JLabel label_30 = new JLabel("New label");
		label_30.setLabelFor(panel_2);
		label_30.setIcon(new ImageIcon(Janela_2.class.getResource("/img/fundo.jpg")));
		label_30.setBounds(-3, -21, 975, 560);
		panel_2.add(label_30);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		tabbedPane.addTab("Associar Senha", null, panel, null);
		
		JButton button_1 = new JButton("Associar Doente A Senha");
		button_1.setFont(new Font("Consolas", Font.PLAIN, 17));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(419, 33, 247, 43);
		panel.add(button_1);
		
		JLabel label_4 = new JLabel("Senha :");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_4.setBounds(102, 41, 104, 35);
		panel.add(label_4);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Escolha a Senha:", "A1", "B1"}));
		comboBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_3.setBounds(208, 34, 186, 42);
		panel.add(comboBox_3);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon(Janela_2.class.getResource("/img/fundo.jpg")));
		label_5.setBounds(-3, -11, 975, 550);
		panel.add(label_5);
		
		JLabel label_27 = new JLabel("");
		label_27.setLabelFor(contentPane);
		label_27.setIcon(new ImageIcon(Janela_2.class.getResource("/img/siga.PNG")));
		label_27.setBounds(-24, -58, 1242, 824);
		contentPane.add(label_27);
		
		setLocation(point.findScreenCenter(this));
	}
}
