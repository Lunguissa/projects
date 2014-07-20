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

public class Janela_1 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;

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
		setBounds(100, 100, 835, 691);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(2, 103, 823, 555);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("TAB1", null, panel_1, null);
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
		textField.setEditable(false);
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
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 20));
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
		
		JLabel label_5 = new JLabel("Isencoes:");
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_5.setBounds(101, 393, 104, 22);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("N Recibo do Boletim:");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_6.setBounds(101, 177, 252, 35);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("N Recibo das Analises:");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_7.setBounds(102, 218, 252, 35);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("Analises Pedidas:");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_8.setBounds(102, 345, 252, 35);
		panel_1.add(label_8);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
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
		comboBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		comboBox_2.setBounds(358, 344, 151, 32);
		panel_1.add(comboBox_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Janela_1.class.getResource("/img/fundo.jpg")));
		lblNewLabel.setBounds(-3, -11, 828, 550);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		tabbedPane.addTab("TAB2", null, panel_2, null);
		
		JButton button_2 = new JButton("Limpar");
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(590, 456, 115, 48);
		panel_2.add(button_2);
		
		JLabel label_19 = new JLabel("Senha:");
		label_19.setForeground(Color.BLACK);
		label_19.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_19.setBounds(99, 60, 85, 20);
		panel_2.add(label_19);
		
		textField_10 = new JTextField();
		textField_10.setText("Teste");
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(360, 53, 216, 30);
		panel_2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("Teste");
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_11.setColumns(10);
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(360, 94, 332, 30);
		panel_2.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("Teste");
		textField_12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_12.setColumns(10);
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(360, 135, 332, 30);
		panel_2.add(textField_12);
		
		JLabel label_20 = new JLabel("Apelido:");
		label_20.setForeground(Color.BLACK);
		label_20.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_20.setBounds(100, 131, 104, 35);
		panel_2.add(label_20);
		
		JLabel label_21 = new JLabel("Nome:");
		label_21.setForeground(Color.BLACK);
		label_21.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_21.setBounds(100, 99, 85, 20);
		panel_2.add(label_21);
		
		JLabel label_22 = new JLabel("Idade:");
		label_22.setForeground(Color.BLACK);
		label_22.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_22.setBounds(100, 303, 104, 35);
		panel_2.add(label_22);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		comboBox_6.setBounds(359, 388, 151, 32);
		panel_2.add(comboBox_6);
		
		JRadioButton radioButton_4 = new JRadioButton("Masculino");
		radioButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		radioButton_4.setBackground(Color.WHITE);
		radioButton_4.setBounds(360, 257, 109, 30);
		panel_2.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Feminino");
		radioButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		radioButton_5.setBackground(Color.WHITE);
		radioButton_5.setBounds(488, 257, 109, 30);
		panel_2.add(radioButton_5);
		
		JLabel label_23 = new JLabel("Sexo:");
		label_23.setForeground(Color.BLACK);
		label_23.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_23.setBounds(101, 267, 85, 20);
		panel_2.add(label_23);
		
		JLabel label_24 = new JLabel("Isencoes:");
		label_24.setForeground(Color.BLACK);
		label_24.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_24.setBounds(101, 393, 104, 22);
		panel_2.add(label_24);
		
		JLabel label_25 = new JLabel("N Recibo do Boletim:");
		label_25.setForeground(Color.BLACK);
		label_25.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_25.setBounds(101, 177, 252, 35);
		panel_2.add(label_25);
		
		JLabel label_26 = new JLabel("N Recibo das Analises:");
		label_26.setForeground(Color.BLACK);
		label_26.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_26.setBounds(102, 218, 252, 35);
		panel_2.add(label_26);
		
		JLabel label_29 = new JLabel("Analises Pedidas:");
		label_29.setForeground(Color.BLACK);
		label_29.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_29.setBounds(102, 345, 252, 35);
		panel_2.add(label_29);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		comboBox_7.setBounds(358, 298, 151, 32);
		panel_2.add(comboBox_7);
		
		textField_13 = new JTextField();
		textField_13.setText("Teste");
		textField_13.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(359, 217, 332, 30);
		panel_2.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("Teste");
		textField_14.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_14.setColumns(10);
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(360, 176, 332, 30);
		panel_2.add(textField_14);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		comboBox_8.setBounds(358, 344, 151, 32);
		panel_2.add(comboBox_8);
		
		JLabel label_30 = new JLabel("New label");
		label_30.setIcon(new ImageIcon(Janela_1.class.getResource("/img/fundo.jpg")));
		label_30.setBounds(-3, -11, 828, 550);
		panel_2.add(label_30);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		tabbedPane.addTab("TAB3", null, panel, null);
		
		JButton button_1 = new JButton("Limpar");
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(590, 456, 115, 48);
		panel.add(button_1);
		
		JLabel label_9 = new JLabel("Senha:");
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_9.setBounds(99, 60, 85, 20);
		panel.add(label_9);
		
		textField_5 = new JTextField();
		textField_5.setText("Teste");
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(360, 53, 216, 30);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("Teste");
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(360, 94, 332, 30);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("Teste");
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(360, 135, 332, 30);
		panel.add(textField_7);
		
		JLabel label_10 = new JLabel("Apelido:");
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_10.setBounds(100, 131, 104, 35);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Nome:");
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_11.setBounds(100, 99, 85, 20);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("Idade:");
		label_12.setForeground(Color.BLACK);
		label_12.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_12.setBounds(100, 303, 104, 35);
		panel.add(label_12);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		comboBox_3.setBounds(359, 388, 151, 32);
		panel.add(comboBox_3);
		
		JRadioButton radioButton_2 = new JRadioButton("Masculino");
		radioButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		radioButton_2.setBackground(Color.WHITE);
		radioButton_2.setBounds(360, 257, 109, 30);
		panel.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Feminino");
		radioButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		radioButton_3.setBackground(Color.WHITE);
		radioButton_3.setBounds(488, 257, 109, 30);
		panel.add(radioButton_3);
		
		JLabel label_13 = new JLabel("Sexo:");
		label_13.setForeground(Color.BLACK);
		label_13.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_13.setBounds(101, 267, 85, 20);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("Isencoes:");
		label_14.setForeground(Color.BLACK);
		label_14.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_14.setBounds(101, 393, 104, 22);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("N Recibo do Boletim:");
		label_15.setForeground(Color.BLACK);
		label_15.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_15.setBounds(101, 177, 252, 35);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("N Recibo das Analises:");
		label_16.setForeground(Color.BLACK);
		label_16.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_16.setBounds(102, 218, 252, 35);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("Analises Pedidas:");
		label_17.setForeground(Color.BLACK);
		label_17.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_17.setBounds(102, 345, 252, 35);
		panel.add(label_17);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		comboBox_4.setBounds(358, 298, 151, 32);
		panel.add(comboBox_4);
		
		textField_8 = new JTextField();
		textField_8.setText("Teste");
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(359, 217, 332, 30);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("Teste");
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_9.setColumns(10);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(360, 176, 332, 30);
		panel.add(textField_9);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		comboBox_5.setBounds(358, 344, 151, 32);
		panel.add(comboBox_5);
		
		JLabel label_18 = new JLabel("New label");
		label_18.setIcon(new ImageIcon(Janela_1.class.getResource("/img/fundo.jpg")));
		label_18.setBounds(-3, -11, 828, 550);
		panel.add(label_18);
		
		JLabel label_27 = new JLabel("");
		label_27.setLabelFor(contentPane);
		label_27.setIcon(new ImageIcon(Janela_1.class.getResource("/img/fundo.jpg")));
		label_27.setBounds(0, 0, 638, 146);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel("");
		label_28.setIcon(new ImageIcon(Janela_1.class.getResource("/img/logotipo3.jpg")));
		label_28.setBounds(590, -16, 297, 162);
		contentPane.add(label_28);
		
		setLocation(point.findScreenCenter(this));
	}
}
