package Interfaces;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class RegDoente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the frame.
	 */
	public RegDoente() {
		setResizable(false);
		setTitle("Tela Registro de Paciente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(205, 133, 63));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 102));
		panel_1.setBounds(26, 31, 719, 555);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(35, 27, 85, 20);
		panel_1.add(lblSenha);
		lblSenha.setForeground(new Color(0, 0, 0));
		lblSenha.setFont(new Font("Consolas", Font.PLAIN, 20));

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNome.setBounds(35, 68, 85, 20);
		panel_1.add(lblNome);

		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 204));
		textField.setText("Teste");
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(346, 61, 332, 30);
		panel_1.add(textField);

		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 204));
		textField_1.setText("Teste");
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(346, 20, 216, 30);
		panel_1.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 204));
		textField_2.setText("Teste");
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(346, 102, 332, 30);
		panel_1.add(textField_2);

		JLabel lblApelido = new JLabel("Apelido:");
		lblApelido.setForeground(Color.BLACK);
		lblApelido.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblApelido.setBounds(35, 102, 104, 35);
		panel_1.add(lblApelido);

		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 255, 204));
		textField_3.setText("Teste");
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(346, 313, 332, 30);
		panel_1.add(textField_3);

		JLabel lblIsencoes = new JLabel("Isencoes:");
		lblIsencoes.setForeground(Color.BLACK);
		lblIsencoes.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblIsencoes.setBounds(35, 237, 104, 20);
		panel_1.add(lblIsencoes);

		textField_4 = new JTextField();
		textField_4.setBackground(new Color(255, 255, 204));
		textField_4.setText("Teste");
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(346, 272, 332, 30);
		panel_1.add(textField_4);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setForeground(Color.BLACK);
		lblSexo.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblSexo.setBounds(35, 190, 85, 20);
		panel_1.add(lblSexo);

		JLabel lblNRecibo = new JLabel("N Recibo do Boletim:");
		lblNRecibo.setForeground(Color.BLACK);
		lblNRecibo.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNRecibo.setBounds(35, 272, 252, 35);
		panel_1.add(lblNRecibo);

		JLabel lblNReciboDas = new JLabel("N Recibo das Analises:");
		lblNReciboDas.setForeground(Color.BLACK);
		lblNReciboDas.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNReciboDas.setBounds(35, 313, 252, 35);
		panel_1.add(lblNReciboDas);

		JLabel lblAnalisesPedidas = new JLabel("Analises Pedidas:");
		lblAnalisesPedidas.setForeground(Color.BLACK);
		lblAnalisesPedidas.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblAnalisesPedidas.setBounds(35, 355, 252, 35);
		panel_1.add(lblAnalisesPedidas);

		JLabel lblComentariosDoMedico = new JLabel("Comentarios do Medico:");
		lblComentariosDoMedico.setForeground(Color.BLACK);
		lblComentariosDoMedico.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblComentariosDoMedico.setBounds(35, 427, 252, 35);
		panel_1.add(lblComentariosDoMedico);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane
				.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(346, 397, 332, 114);
		panel_1.add(scrollPane);

		JTextPane txtpnTeste = new JTextPane();
		txtpnTeste.setBackground(new Color(255, 255, 204));
		txtpnTeste.setText("teste");
		txtpnTeste.setFont(new Font("Consolas", Font.PLAIN, 16));
		scrollPane.setViewportView(txtpnTeste);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setForeground(Color.BLACK);
		lblIdade.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblIdade.setBounds(35, 144, 104, 35);
		panel_1.add(lblIdade);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "<1 Mes",
				"1-11m", "12m-5 Anos", "5-10 Anos", ">10 Anos" }));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		comboBox.setBounds(346, 143, 151, 32);
		panel_1.add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {
				"Masculino", "Feminino" }));
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		comboBox_1.setBounds(346, 186, 151, 32);
		panel_1.add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {
				"Transferencia", "Pessoal", "Outras*" }));
		comboBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		comboBox_2.setBounds(346, 229, 151, 32);
		panel_1.add(comboBox_2);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "HTZ",
				"HIV", "Hemograma", "Urina", "RX", "Bioquimica" }));
		comboBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		comboBox_3.setBounds(346, 354, 151, 32);
		panel_1.add(comboBox_3);

		JButton btnRegistrar = new JButton("Limpar");
		btnRegistrar.setBackground(new Color(255, 255, 102));
		btnRegistrar.setBounds(151, 597, 115, 45);
		panel.add(btnRegistrar);

		JButton button = new JButton("Registrar");
		button.setBackground(new Color(255, 255, 153));
		button.setBounds(26, 597, 115, 45);
		panel.add(button);

		JLabel lblTelaDeRegistro = new JLabel("Tela de Registro de Pacientes");
		lblTelaDeRegistro.setForeground(new Color(255, 255, 102));
		lblTelaDeRegistro.setBackground(new Color(255, 255, 204));
		lblTelaDeRegistro.setFont(new Font("Consolas", Font.PLAIN, 18));
		lblTelaDeRegistro.setBounds(270, 0, 428, 33);
		panel.add(lblTelaDeRegistro);

		setLocation(findScreenCenter());
	}

	private Point findScreenCenter() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension mySize = getSize();
		Point fin = new Point(0, 0);

		fin.x = (screenSize.width - mySize.width) / 2;
		fin.y = (screenSize.height - mySize.height) / 2;

		return fin;
	}
}
