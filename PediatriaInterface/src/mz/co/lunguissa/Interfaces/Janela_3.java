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

public class Janela_3 extends JFrame {

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
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_13;
	private JTextField textField_14;

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
		
		JLabel label = new JLabel("Senha:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Consolas", Font.PLAIN, 20));
		label.setBounds(99, 60, 85, 20);
		panel_1.add(label);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setText("Teste");
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(360, 53, 216, 30);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setText("Teste");
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(360, 94, 332, 30);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
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
		label_3.setBounds(99, 217, 104, 35);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Sexo:");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_4.setBounds(100, 181, 85, 20);
		panel_1.add(label_4);
		
		JLabel lblIsenes = new JLabel("Isen\u00E7\u00F5es :");
		lblIsenes.setForeground(Color.BLACK);
		lblIsenes.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblIsenes.setBounds(100, 307, 141, 22);
		panel_1.add(lblIsenes);
		
		JLabel lblNReciboDo = new JLabel("N\u00BA Recibo do Boletim:");
		lblNReciboDo.setForeground(Color.BLACK);
		lblNReciboDo.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNReciboDo.setBounds(101, 341, 252, 35);
		panel_1.add(lblNReciboDo);
		
		JLabel lblNReciboDas = new JLabel("N\u00BA Recibo das An\u00E1lises:");
		lblNReciboDas.setForeground(Color.BLACK);
		lblNReciboDas.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNReciboDas.setBounds(102, 382, 267, 35);
		panel_1.add(lblNReciboDas);
		
		JLabel lblAnlisesPedidas = new JLabel("An\u00E1lises Pedidas:");
		lblAnlisesPedidas.setForeground(Color.BLACK);
		lblAnlisesPedidas.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblAnlisesPedidas.setBounds(101, 259, 252, 35);
		panel_1.add(lblAnlisesPedidas);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setText("Teste");
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(360, 382, 332, 30);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setEditable(false);
		textField_4.setText("Teste");
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(360, 341, 332, 30);
		panel_1.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setText("Teste");
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(360, 299, 216, 30);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		textField_7.setText("Teste");
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(360, 258, 165, 30);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEnabled(false);
		textField_8.setText("Teste");
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(360, 217, 165, 30);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEnabled(false);
		textField_9.setText("Teste");
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(360, 176, 165, 30);
		panel_1.add(textField_9);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Janela_3.class.getResource("/img/fundo.jpg")));
		lblNewLabel.setBounds(-3, -11, 972, 550);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		tabbedPane.addTab("Situação de Saude", null, panel_2, null);
		
		JLabel lblResidenci = new JLabel("Resid\u00EAncia :");
		lblResidenci.setForeground(Color.BLACK);
		lblResidenci.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblResidenci.setBounds(93, 245, 133, 20);
		panel_2.add(lblResidenci);
		
		textField_10 = new JTextField();
		textField_10.setEnabled(false);
		textField_10.setEditable(false);
		textField_10.setText("Teste");
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(359, 156, 216, 30);
		panel_2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEnabled(false);
		textField_11.setEditable(false);
		textField_11.setText("Teste");
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_11.setColumns(10);
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(359, 197, 332, 30);
		panel_2.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEnabled(false);
		textField_12.setEditable(false);
		textField_12.setText("Teste");
		textField_12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_12.setColumns(10);
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(359, 238, 332, 30);
		panel_2.add(textField_12);
		
		JLabel lblContactoResponsavel = new JLabel("Contacto Responsavel :");
		lblContactoResponsavel.setForeground(Color.BLACK);
		lblContactoResponsavel.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblContactoResponsavel.setBounds(93, 317, 250, 35);
		panel_2.add(lblContactoResponsavel);
		
		JLabel lblProviniencia = new JLabel("Nome Responsavel :");
		lblProviniencia.setForeground(Color.BLACK);
		lblProviniencia.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblProviniencia.setBounds(93, 286, 228, 20);
		panel_2.add(lblProviniencia);
		
		JLabel lblProviniencia_1 = new JLabel("Proveni\u00EAncia :");
		lblProviniencia_1.setForeground(Color.BLACK);
		lblProviniencia_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblProviniencia_1.setBounds(93, 197, 183, 35);
		panel_2.add(lblProviniencia_1);
		
		JLabel lblTipoDePaciente = new JLabel("Tipo de Paciente :");
		lblTipoDePaciente.setForeground(Color.BLACK);
		lblTipoDePaciente.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblTipoDePaciente.setBounds(94, 156, 252, 35);
		panel_2.add(lblTipoDePaciente);
		
		textField_13 = new JTextField();
		textField_13.setEnabled(false);
		textField_13.setText("Teste");
		textField_13.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(359, 279, 332, 30);
		panel_2.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEnabled(false);
		textField_14.setText("Teste");
		textField_14.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(359, 320, 332, 30);
		panel_2.add(textField_14);
		
		JLabel label_30 = new JLabel("New label");
		label_30.setLabelFor(panel_2);
		label_30.setIcon(new ImageIcon(Janela_3.class.getResource("/img/fundo.jpg")));
		label_30.setBounds(-3, -21, 975, 560);
		panel_2.add(label_30);
		
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
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "Paracetamol"}));
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
		
		JButton btnDesistiu = new JButton("Desistiu");
		btnDesistiu.setFont(new Font("Consolas", Font.PLAIN, 17));
		btnDesistiu.setBackground(Color.WHITE);
		btnDesistiu.setBounds(428, 323, 144, 48);
		panel_3.add(btnDesistiu);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setIcon(new ImageIcon(Janela_3.class.getResource("/img/fundo.jpg")));
		label_9.setBounds(0, -8, 975, 560);
		panel_3.add(label_9);
		
		JLabel label_27 = new JLabel("");
		label_27.setLabelFor(contentPane);
		label_27.setIcon(new ImageIcon(Janela_3.class.getResource("/img/test1.PNG")));
		label_27.setBounds(-73, -44, 1003, 194);
		contentPane.add(label_27);
		
		setLocation(point.findScreenCenter(this));
	}
}
