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

public class Janela_1 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_5;

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
		setBounds(100, 100, 931, 691);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(2, 97, 928, 561);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Informação do Doente", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton button = new JButton("Limpar");
		button.setBackground(Color.WHITE);
		button.setBounds(590, 456, 115, 48);
		panel_1.add(button);
		
		JLabel label = new JLabel("Senha:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Consolas", Font.PLAIN, 20));
		label.setBounds(99, 60, 85, 20);
		panel_1.add(label);
		
		textField = new JTextField();
		textField.setText("Teste");
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(360, 53, 216, 30);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Teste");
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(360, 94, 332, 30);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Teste");
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(360, 135, 332, 30);
		panel_1.add(textField_2);
		
		JLabel label_1 = new JLabel("Apelido:");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_1.setBounds(100, 131, 104, 35);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Nome:");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_2.setBounds(100, 99, 85, 20);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Idade:");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_3.setBounds(100, 303, 104, 35);
		panel_1.add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Transfer\u00EAncia", "Pessoal", "Outras"}));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox.setBounds(359, 388, 151, 32);
		panel_1.add(comboBox);
		
		JRadioButton radioButton = new JRadioButton("Masculino");
		radioButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		radioButton.setBackground(Color.WHITE);
		radioButton.setBounds(360, 257, 109, 30);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Feminino");
		radioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		radioButton_1.setBackground(Color.WHITE);
		radioButton_1.setBounds(488, 257, 109, 30);
		panel_1.add(radioButton_1);
		
		JLabel label_4 = new JLabel("Sexo:");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_4.setBounds(101, 267, 85, 20);
		panel_1.add(label_4);
		
		JLabel lblIsenes = new JLabel("Isen\u00E7\u00F5es :");
		lblIsenes.setForeground(Color.BLACK);
		lblIsenes.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblIsenes.setBounds(101, 393, 141, 22);
		panel_1.add(lblIsenes);
		
		JLabel lblNReciboDo = new JLabel("N\u00BA Recibo do Boletim:");
		lblNReciboDo.setForeground(Color.BLACK);
		lblNReciboDo.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNReciboDo.setBounds(101, 177, 252, 35);
		panel_1.add(lblNReciboDo);
		
		JLabel lblNReciboDas = new JLabel("N\u00BA Recibo das An\u00E1lises:");
		lblNReciboDas.setForeground(Color.BLACK);
		lblNReciboDas.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNReciboDas.setBounds(102, 218, 267, 35);
		panel_1.add(lblNReciboDas);
		
		JLabel lblAnlisesPedidas = new JLabel("An\u00E1lises Pedidas:");
		lblAnlisesPedidas.setForeground(Color.BLACK);
		lblAnlisesPedidas.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblAnlisesPedidas.setBounds(102, 345, 252, 35);
		panel_1.add(lblAnlisesPedidas);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"< 1 m\u00EAs", "1-11m", "12m-5anos", "5-10anos", ">10 anos"}));
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_1.setBounds(358, 298, 151, 32);
		panel_1.add(comboBox_1);
		
		textField_3 = new JTextField();
		textField_3.setText("Teste");
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(359, 217, 332, 30);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("Teste");
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(360, 176, 332, 30);
		panel_1.add(textField_4);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"HTZ", "HIV", "hemograma", "urina", "RX", "bioqu\u00EDmica"}));
		comboBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_2.setBounds(358, 344, 151, 32);
		panel_1.add(comboBox_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Janela_1.class.getResource("/img/fundo.jpg")));
		lblNewLabel.setBounds(-3, -11, 972, 550);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		tabbedPane.addTab("Situação de Saude", null, panel_2, null);
		
		JButton button_2 = new JButton("Limpar");
		button_2.setFont(new Font("Consolas", Font.PLAIN, 17));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(590, 456, 115, 48);
		panel_2.add(button_2);
		
		JLabel lblResidenci = new JLabel("Resid\u00EAncia :");
		lblResidenci.setForeground(Color.BLACK);
		lblResidenci.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblResidenci.setBounds(98, 163, 133, 20);
		panel_2.add(lblResidenci);
		
		textField_10 = new JTextField();
		textField_10.setText("Teste");
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(359, 156, 216, 30);
		panel_2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("Teste");
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_11.setColumns(10);
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(359, 197, 332, 30);
		panel_2.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("Teste");
		textField_12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_12.setColumns(10);
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(359, 238, 332, 30);
		panel_2.add(textField_12);
		
		JLabel lblContactoResponsavel = new JLabel("Contacto Responsavel :");
		lblContactoResponsavel.setForeground(Color.BLACK);
		lblContactoResponsavel.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblContactoResponsavel.setBounds(98, 238, 250, 35);
		panel_2.add(lblContactoResponsavel);
		
		JLabel lblProviniencia = new JLabel("Nome Responsavel :");
		lblProviniencia.setForeground(Color.BLACK);
		lblProviniencia.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblProviniencia.setBounds(98, 204, 228, 20);
		panel_2.add(lblProviniencia);
		
		JLabel lblProviniencia_1 = new JLabel("Proveni\u00EAncia :");
		lblProviniencia_1.setForeground(Color.BLACK);
		lblProviniencia_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblProviniencia_1.setBounds(98, 284, 183, 35);
		panel_2.add(lblProviniencia_1);
		
		JLabel lblTipoDePaciente = new JLabel("Tipo de Paciente :");
		lblTipoDePaciente.setForeground(Color.BLACK);
		lblTipoDePaciente.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblTipoDePaciente.setBounds(96, 326, 252, 35);
		panel_2.add(lblTipoDePaciente);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Teste"}));
		comboBox_7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_7.setBounds(356, 279, 151, 32);
		panel_2.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Teste"}));
		comboBox_8.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_8.setBounds(356, 325, 151, 32);
		panel_2.add(comboBox_8);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setFont(new Font("Consolas", Font.PLAIN, 17));
		btnGravar.setBackground(Color.WHITE);
		btnGravar.setBounds(461, 456, 115, 48);
		panel_2.add(btnGravar);
		
		JLabel label_30 = new JLabel("New label");
		label_30.setLabelFor(panel_2);
		label_30.setIcon(new ImageIcon(Janela_1.class.getResource("/img/fundo.jpg")));
		label_30.setBounds(-3, -21, 975, 560);
		panel_2.add(label_30);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		tabbedPane.addTab("Associar Senha", null, panel, null);
		
		JButton btnA = new JButton("Associar Doente A Senha");
		btnA.setFont(new Font("Consolas", Font.PLAIN, 17));
		btnA.setBackground(Color.WHITE);
		btnA.setBounds(419, 33, 247, 43);
		panel.add(btnA);
		
		JLabel lblSenha = new JLabel("Senha :");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblSenha.setBounds(102, 41, 104, 35);
		panel.add(lblSenha);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"A1", "B1"}));
		comboBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_4.setBounds(208, 34, 186, 42);
		panel.add(comboBox_4);
		
		
		JLabel label_18 = new JLabel("New label");
		label_18.setIcon(new ImageIcon(Janela_1.class.getResource("/img/fundo.jpg")));
		label_18.setBounds(-3, -11, 975, 550);
		panel.add(label_18);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		tabbedPane.addTab("Parecer do Médico", null, panel_3, null);
		
		JButton btnGravar_1 = new JButton("Gravar");
		btnGravar_1.setFont(new Font("Consolas", Font.PLAIN, 17));
		btnGravar_1.setBackground(Color.WHITE);
		btnGravar_1.setBounds(600, 323, 144, 48);
		panel_3.add(btnGravar_1);
		
		JLabel lblComentarios = new JLabel("Coment\u00E1rios :");
		lblComentarios.setForeground(Color.BLACK);
		lblComentarios.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblComentarios.setBounds(92, 59, 152, 35);
		panel_3.add(lblComentarios);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(337, 59, 407, 167);
		panel_3.add(scrollPane);
		
		JTextPane txtpnComents = new JTextPane();
		txtpnComents.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtpnComents.setText("Coments!!");
		scrollPane.setViewportView(txtpnComents);
		
		JLabel lblMedico = new JLabel("Medicamento:");
		lblMedico.setForeground(Color.BLACK);
		lblMedico.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblMedico.setBounds(92, 254, 152, 35);
		panel_3.add(lblMedico);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Paracetamol"}));
		comboBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		comboBox_3.setBounds(337, 254, 235, 32);
		panel_3.add(comboBox_3);
		
		textField_5 = new JTextField();
		textField_5.setText("20");
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(662, 254, 82, 30);
		panel_3.add(textField_5);
		
		JLabel lblQnt = new JLabel("Qnt:");
		lblQnt.setForeground(Color.BLACK);
		lblQnt.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblQnt.setBounds(600, 254, 52, 35);
		panel_3.add(lblQnt);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setIcon(new ImageIcon(Janela_1.class.getResource("/img/fundo.jpg")));
		label_9.setBounds(0, -8, 975, 560);
		panel_3.add(label_9);
		
		JLabel label_27 = new JLabel("");
		label_27.setLabelFor(contentPane);
		label_27.setIcon(new ImageIcon(Janela_1.class.getResource("/img/test1.PNG")));
		label_27.setBounds(-73, -44, 1003, 194);
		contentPane.add(label_27);
		
		setLocation(point.findScreenCenter(this));
	}
}
