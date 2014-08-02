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

public class Janela_3 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtTesteas;
	private JTextField txtAgostinhoMavota;
	private DateTextField textField_2;
	private JTextField txtMaputo;
	private JTextField txtMafalala;
	private JTextField txtCeleste;
	private JTextField txtMe;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField txtMasculino;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela_3 frame = new Janela_3();
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
	public Janela_3() {
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
		txtTesteas.setEnabled(false);
		txtTesteas.setText("97654");
		txtTesteas.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTesteas.setColumns(10);
		txtTesteas.setBackground(Color.WHITE);
		txtTesteas.setBounds(362, 35, 216, 30);
		panel_1.add(txtTesteas);
		
		txtAgostinhoMavota = new JTextField();
		txtAgostinhoMavota.setEditable(false);
		txtAgostinhoMavota.setEnabled(false);
		txtAgostinhoMavota.setText("Agostinho Mavota");
		txtAgostinhoMavota.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtAgostinhoMavota.setColumns(10);
		txtAgostinhoMavota.setBackground(Color.WHITE);
		txtAgostinhoMavota.setBounds(362, 76, 332, 30);
		panel_1.add(txtAgostinhoMavota);
		
		textField_2 = new DateTextField();
		textField_2.setEnabled(false);
		textField_2.repaint();
		textField_2.setText("20/07/1991");
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
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
		
		txtMaputo = new JTextField();
		txtMaputo.setEditable(false);
		txtMaputo.setEnabled(false);
		txtMaputo.setText("Maputo");
		txtMaputo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtMaputo.setColumns(10);
		txtMaputo.setBackground(Color.WHITE);
		txtMaputo.setBounds(361, 290, 332, 30);
		panel_1.add(txtMaputo);
		
		txtMafalala = new JTextField();
		txtMafalala.setEditable(false);
		txtMafalala.setEnabled(false);
		txtMafalala.setText("Mafalala");
		txtMafalala.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtMafalala.setColumns(10);
		txtMafalala.setBackground(Color.WHITE);
		txtMafalala.setBounds(362, 249, 332, 30);
		panel_1.add(txtMafalala);
		
		JLabel label = new JLabel("Sexo:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Consolas", Font.PLAIN, 20));
		label.setBounds(69, 168, 283, 20);
		panel_1.add(label);
		
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
		txtMe.setEnabled(false);
		txtMe.setText("M\u00E3e");
		txtMe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtMe.setColumns(10);
		txtMe.setBackground(Color.WHITE);
		txtMe.setBounds(362, 378, 332, 30);
		panel_1.add(txtMe);
		
		txtCeleste = new JTextField();
		txtCeleste.setEditable(false);
		txtCeleste.setEnabled(false);
		txtCeleste.setText("Celeste");
		txtCeleste.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtCeleste.setColumns(10);
		txtCeleste.setBackground(Color.WHITE);
		txtCeleste.setBounds(362, 332, 332, 30);
		panel_1.add(txtCeleste);
		
		txtMasculino = new JTextField();
		txtMasculino.setText("Masculino");
		txtMasculino.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtMasculino.setEnabled(false);
		txtMasculino.setEditable(false);
		txtMasculino.setColumns(10);
		txtMasculino.setBackground(Color.WHITE);
		txtMasculino.setBounds(362, 158, 216, 30);
		panel_1.add(txtMasculino);
		
		textField_8 = new JTextField();
		textField_8.setText(">14");
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_8.setEnabled(false);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(362, 203, 216, 30);
		panel_1.add(textField_8);
		
		JLabel lblContactoAcompanhante = new JLabel("Contacto do Acompanhante:");
		lblContactoAcompanhante.setForeground(Color.BLACK);
		lblContactoAcompanhante.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblContactoAcompanhante.setBounds(69, 423, 283, 35);
		panel_1.add(lblContactoAcompanhante);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setEnabled(false);
		textField_6.setText("82545783");
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(362, 424, 332, 30);
		panel_1.add(textField_6);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Janela_3.class.getResource("/img/fundo.jpg")));
		lblNewLabel.setBounds(-3, -27, 840, 559);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		tabbedPane.addTab("Situação de Saude", null, panel_2, null);
		
		JLabel lblProviniencia_1 = new JLabel("Proveni\u00EAncia :");
		lblProviniencia_1.setForeground(Color.BLACK);
		lblProviniencia_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblProviniencia_1.setBounds(120, 174, 183, 35);
		panel_2.add(lblProviniencia_1);
		
		JLabel lblIsenoDePagamento = new JLabel("Isen\u00E7\u00E3o de Pagamento:");
		lblIsenoDePagamento.setForeground(Color.BLACK);
		lblIsenoDePagamento.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblIsenoDePagamento.setBounds(119, 130, 260, 22);
		panel_2.add(lblIsenoDePagamento);
		
		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		textField_7.setText("555511744");
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(403, 355, 332, 30);
		panel_2.add(textField_7);
		
		JLabel label_3 = new JLabel("N\u00BA Recibo das An\u00E1lises:");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_3.setBounds(120, 356, 267, 35);
		panel_2.add(label_3);
		
		JLabel label_2 = new JLabel("An\u00E1lises Pedidas:");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_2.setBounds(119, 219, 252, 35);
		panel_2.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setText("Teste");
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(404, 124, 216, 30);
		panel_2.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setText("Teste");
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(404, 174, 216, 30);
		panel_2.add(textField_3);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(404, 229, 331, 115);
		panel_2.add(scrollPane_3);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		scrollPane_3.setViewportView(textPane_3);
		
		JLabel label_30 = new JLabel("New label");
		label_30.setLabelFor(panel_2);
		label_30.setIcon(new ImageIcon(Janela_3.class.getResource("/img/fundo.jpg")));
		label_30.setBounds(-3, -21, 975, 560);
		panel_2.add(label_30);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		tabbedPane.addTab("Parecer do Médico", null, panel, null);
		
		JButton button_1 = new JButton("Gravar");
		button_1.setFont(new Font("Consolas", Font.PLAIN, 17));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(600, 469, 144, 48);
		panel.add(button_1);
		
		JLabel label_4 = new JLabel("Coment\u00E1rios :");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_4.setBounds(92, 59, 152, 35);
		panel.add(label_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(337, 59, 441, 167);
		panel.add(scrollPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Consolas", Font.PLAIN, 16));
		scrollPane.setViewportView(textPane_1);
		
		JLabel lblMedicamentos = new JLabel("Medicamentos:");
		lblMedicamentos.setForeground(Color.BLACK);
		lblMedicamentos.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblMedicamentos.setBounds(92, 254, 152, 35);
		panel.add(lblMedicamentos);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "Paracetamol"}));
		comboBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		comboBox_3.setBounds(337, 254, 210, 32);
		panel.add(comboBox_3);
		
		textField = new JTextField();
		textField.setText("20");
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(608, 254, 72, 30);
		panel.add(textField);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setFont(new Font("Consolas", Font.PLAIN, 14));
		btnInserir.setBackground(Color.WHITE);
		btnInserir.setBounds(689, 254, 89, 31);
		panel.add(btnInserir);
		
		JLabel label_6 = new JLabel("Qnt:");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_6.setBounds(557, 254, 52, 35);
		panel.add(label_6);
		
		JLabel lblDiagnsticos = new JLabel("Diagn\u00F3sticos:");
		lblDiagnsticos.setForeground(Color.BLACK);
		lblDiagnsticos.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblDiagnsticos.setBounds(92, 409, 152, 35);
		panel.add(lblDiagnsticos);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(455, 297, 323, 91);
		panel.add(scrollPane_2);
		
		JTextPane textPane_2 = new JTextPane();
		scrollPane_2.setViewportView(textPane_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(337, 297, 117, 91);
		panel.add(scrollPane_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Consolas", Font.PLAIN, 16));
		scrollPane_1.setViewportView(textPane);
		
		JButton button_3 = new JButton("Desistiu");
		button_3.setFont(new Font("Consolas", Font.PLAIN, 17));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(428, 469, 144, 48);
		panel.add(button_3);
		
		JCheckBox chckbxDiagnstico = new JCheckBox("Diagn\u00F3stico 1");
		chckbxDiagnstico.setFont(new Font("Consolas", Font.PLAIN, 14));
		chckbxDiagnstico.setBounds(337, 409, 144, 30);
		panel.add(chckbxDiagnstico);
		
		JCheckBox chckbxDiagnstico_1 = new JCheckBox("Diagn\u00F3stico 2");
		chckbxDiagnstico_1.setFont(new Font("Consolas", Font.PLAIN, 14));
		chckbxDiagnstico_1.setBounds(497, 409, 144, 30);
		panel.add(chckbxDiagnstico_1);
		
		JCheckBox chckbxDiagnstico_2 = new JCheckBox("Diagn\u00F3stico 3");
		chckbxDiagnstico_2.setFont(new Font("Consolas", Font.PLAIN, 14));
		chckbxDiagnstico_2.setBounds(650, 409, 144, 30);
		panel.add(chckbxDiagnstico_2);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon(Janela_3.class.getResource("/img/fundo.jpg")));
		label_7.setBounds(0, -8, 975, 560);
		panel.add(label_7);
		
		JLabel label_27 = new JLabel("");
		label_27.setLabelFor(contentPane);
		label_27.setIcon(new ImageIcon(Janela_3.class.getResource("/img/siga.PNG")));
		label_27.setBounds(-24, -58, 1242, 824);
		contentPane.add(label_27);
		
		setLocation(point.findScreenCenter(this));
	}
}
