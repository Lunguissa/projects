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
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;

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
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		tabbedPane.addTab("Informação do Doente", null, panel, null);
		
		JLabel label_5 = new JLabel("Senha:");
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_5.setBounds(99, 60, 85, 20);
		panel.add(label_5);
		
		textField = new JTextField();
		textField.setText("Teste");
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(360, 53, 216, 30);
		panel.add(textField);
		
		textField_5 = new JTextField();
		textField_5.setText("Teste");
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_5.setEnabled(false);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(360, 94, 332, 30);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("Teste");
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_6.setEnabled(false);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(360, 135, 332, 30);
		panel.add(textField_6);
		
		JLabel label_6 = new JLabel("Apelido:");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_6.setBounds(100, 131, 104, 35);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Nome:");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_7.setBounds(100, 99, 85, 20);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Idade:");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_8.setBounds(99, 217, 104, 35);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Sexo:");
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_9.setBounds(100, 181, 85, 20);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("Isen\u00E7\u00F5es :");
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_10.setBounds(100, 307, 141, 22);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("N\u00BA Recibo do Boletim:");
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_11.setBounds(101, 341, 252, 35);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("N\u00BA Recibo das An\u00E1lises:");
		label_12.setForeground(Color.BLACK);
		label_12.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_12.setBounds(102, 382, 267, 35);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("An\u00E1lises Pedidas:");
		label_13.setForeground(Color.BLACK);
		label_13.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_13.setBounds(101, 259, 252, 35);
		panel.add(label_13);
		
		textField_7 = new JTextField();
		textField_7.setText("Teste");
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_7.setEnabled(false);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(360, 382, 332, 30);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("Teste");
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_8.setEnabled(false);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(360, 341, 332, 30);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("Teste");
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_9.setEnabled(false);
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(360, 299, 216, 30);
		panel.add(textField_9);
		
		textField_13 = new JTextField();
		textField_13.setText("Teste");
		textField_13.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_13.setEnabled(false);
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(360, 258, 165, 30);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("Teste");
		textField_14.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_14.setEnabled(false);
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(360, 217, 165, 30);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("Teste");
		textField_15.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_15.setEnabled(false);
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(360, 176, 165, 30);
		panel.add(textField_15);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setIcon(new ImageIcon(Janela_3.class.getResource("/img/fundo.jpg")));
		label_14.setBounds(-3, -11, 972, 550);
		panel.add(label_14);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		tabbedPane.addTab("Situação de Saude", null, panel_3, null);
		
		JLabel label_15 = new JLabel("Resid\u00EAncia :");
		label_15.setForeground(Color.BLACK);
		label_15.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_15.setBounds(93, 245, 133, 20);
		panel_3.add(label_15);
		
		textField_16 = new JTextField();
		textField_16.setText("Teste");
		textField_16.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_16.setEnabled(false);
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(359, 156, 216, 30);
		panel_3.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("Teste");
		textField_17.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_17.setEnabled(false);
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(359, 197, 332, 30);
		panel_3.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setText("Teste");
		textField_18.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_18.setEnabled(false);
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBackground(Color.WHITE);
		textField_18.setBounds(359, 238, 332, 30);
		panel_3.add(textField_18);
		
		JLabel label_16 = new JLabel("Contacto Responsavel :");
		label_16.setForeground(Color.BLACK);
		label_16.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_16.setBounds(93, 317, 250, 35);
		panel_3.add(label_16);
		
		JLabel label_17 = new JLabel("Nome Responsavel :");
		label_17.setForeground(Color.BLACK);
		label_17.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_17.setBounds(93, 286, 228, 20);
		panel_3.add(label_17);
		
		JLabel label_18 = new JLabel("Proveni\u00EAncia :");
		label_18.setForeground(Color.BLACK);
		label_18.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_18.setBounds(93, 197, 183, 35);
		panel_3.add(label_18);
		
		JLabel label_19 = new JLabel("Tipo de Paciente :");
		label_19.setForeground(Color.BLACK);
		label_19.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_19.setBounds(94, 156, 252, 35);
		panel_3.add(label_19);
		
		textField_19 = new JTextField();
		textField_19.setText("Teste");
		textField_19.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_19.setEnabled(false);
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBackground(Color.WHITE);
		textField_19.setBounds(359, 279, 332, 30);
		panel_3.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("Teste");
		textField_20.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_20.setEnabled(false);
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBackground(Color.WHITE);
		textField_20.setBounds(359, 320, 332, 30);
		panel_3.add(textField_20);
		
		JLabel label_20 = new JLabel("New label");
		label_20.setIcon(new ImageIcon(Janela_3.class.getResource("/img/fundo.jpg")));
		label_20.setBounds(-3, -21, 975, 560);
		panel_3.add(label_20);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		tabbedPane.addTab("Parecer do Médico", null, panel_4, null);
		
		JButton button_1 = new JButton("Gravar");
		button_1.setFont(new Font("Consolas", Font.PLAIN, 17));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(600, 323, 144, 48);
		panel_4.add(button_1);
		
		JLabel label_21 = new JLabel("Coment\u00E1rios :");
		label_21.setForeground(Color.BLACK);
		label_21.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_21.setBounds(92, 59, 152, 35);
		panel_4.add(label_21);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(337, 59, 407, 167);
		panel_4.add(scrollPane);
		
		JLabel label_22 = new JLabel("Medicamento:");
		label_22.setForeground(Color.BLACK);
		label_22.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_22.setBounds(92, 254, 152, 35);
		panel_4.add(label_22);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "Paracetamol"}));
		comboBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		comboBox_3.setBounds(337, 254, 235, 32);
		panel_4.add(comboBox_3);
		
		textField_21 = new JTextField();
		textField_21.setText("20");
		textField_21.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_21.setColumns(10);
		textField_21.setBackground(Color.WHITE);
		textField_21.setBounds(662, 254, 82, 30);
		panel_4.add(textField_21);
		
		JLabel label_23 = new JLabel("Qnt:");
		label_23.setForeground(Color.BLACK);
		label_23.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_23.setBounds(600, 254, 52, 35);
		panel_4.add(label_23);
		
		JButton button_3 = new JButton("Desistiu");
		button_3.setFont(new Font("Consolas", Font.PLAIN, 17));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(428, 323, 144, 48);
		panel_4.add(button_3);
		
		JLabel label_24 = new JLabel("New label");
		label_24.setIcon(new ImageIcon(Janela_3.class.getResource("/img/fundo.jpg")));
		label_24.setBounds(0, -8, 975, 560);
		panel_4.add(label_24);
		
		JLabel label_27 = new JLabel("");
		label_27.setLabelFor(contentPane);
		label_27.setIcon(new ImageIcon(Janela_3.class.getResource("/img/siga.PNG")));
		label_27.setBounds(-24, -58, 1242, 824);
		contentPane.add(label_27);
		
		setLocation(point.findScreenCenter(this));
	}
}
