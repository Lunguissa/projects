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
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;

import com.toedter.calendar.JDateChooser;

import java.util.Locale;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela_2 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtnumProcesso;
	private JTextField txtNome;
	private JTextField txtMorada;
	private JTextField txtAcompanhante;
	private JTextField txtgrauParentesco;
	private JTextField txtContactoAcompanhante;
	private JTextField textField;
	private JTable tblAnalises;

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
		
		txtnumProcesso = new JTextField();
		txtnumProcesso.setEditable(false);
		txtnumProcesso.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtnumProcesso.setColumns(10);
		txtnumProcesso.setBackground(Color.WHITE);
		txtnumProcesso.setBounds(362, 35, 216, 30);
		panel_1.add(txtnumProcesso);
		
		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtNome.setColumns(10);
		txtNome.setBackground(Color.WHITE);
		txtNome.setBounds(362, 76, 332, 30);
		panel_1.add(txtNome);
		
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
		
		txtMorada = new JTextField();
		txtMorada.setEditable(false);
		txtMorada.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtMorada.setColumns(10);
		txtMorada.setBackground(Color.WHITE);
		txtMorada.setBounds(362, 249, 332, 30);
		panel_1.add(txtMorada);
		
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
		
		final JComboBox cmbIdade = new JComboBox();
		cmbIdade.setEnabled(false);
		cmbIdade.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "< 1 m\u00EAs", "1-11m", "12m-5anos", "5-10anos", ">10 anos"}));
		cmbIdade.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cmbIdade.setBounds(360, 199, 218, 32);
		panel_1.add(cmbIdade);
		
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
		
		txtgrauParentesco = new JTextField();
		txtgrauParentesco.setEditable(false);
		txtgrauParentesco.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtgrauParentesco.setColumns(10);
		txtgrauParentesco.setBackground(Color.WHITE);
		txtgrauParentesco.setBounds(362, 378, 332, 30);
		panel_1.add(txtgrauParentesco);
		
		txtAcompanhante = new JTextField();
		txtAcompanhante.setEditable(false);
		txtAcompanhante.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtAcompanhante.setColumns(10);
		txtAcompanhante.setBackground(Color.WHITE);
		txtAcompanhante.setBounds(362, 332, 332, 30);
		panel_1.add(txtAcompanhante);
		
		JButton button = new JButton("Editar");
		button.setBackground(Color.WHITE);
		button.setBounds(443, 469, 115, 48);
		panel_1.add(button);
		
		JButton btnLimpar = new JButton("Limpar");
		
		btnLimpar.setEnabled(false);
		btnLimpar.setBackground(Color.WHITE);
		btnLimpar.setBounds(579, 469, 115, 48);
		panel_1.add(btnLimpar);
		
		final JComboBox cmbCidade = new JComboBox();
		cmbCidade.setEnabled(false);
		cmbCidade.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "Maputo Cidade", "Maputo Provincia", "Outros"}));
		cmbCidade.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cmbCidade.setBounds(360, 290, 218, 32);
		panel_1.add(cmbCidade);
		
		JLabel lblContactoAcompanhante = new JLabel("Contacto do Acompanhante:");
		lblContactoAcompanhante.setForeground(Color.BLACK);
		lblContactoAcompanhante.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblContactoAcompanhante.setBounds(69, 423, 283, 35);
		panel_1.add(lblContactoAcompanhante);
		
		txtContactoAcompanhante = new JTextField();
		txtContactoAcompanhante.setEditable(false);
		txtContactoAcompanhante.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtContactoAcompanhante.setColumns(10);
		txtContactoAcompanhante.setBackground(Color.WHITE);
		txtContactoAcompanhante.setBounds(362, 424, 332, 30);
		panel_1.add(txtContactoAcompanhante);
		
		JDateChooser txtData = new JDateChooser();
		txtData.setLocale(new Locale("pt", "PT"));
		txtData.setBounds(362, 117, 147, 35);
		panel_1.add(txtData);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Janela_2.class.getResource("/img/fundo.jpg")));
		lblNewLabel.setBounds(-3, -27, 840, 559);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		tabbedPane.addTab("Situação de Saude", null, panel_2, null);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setFont(new Font("Consolas", Font.PLAIN, 17));
		btnGravar.setEnabled(false);
		btnGravar.setBackground(Color.WHITE);
		btnGravar.setBounds(449, 447, 115, 48);
		panel_2.add(btnGravar);
		
		JButton bntLimpar1 = new JButton("Limpar");
		
		bntLimpar1.setFont(new Font("Consolas", Font.PLAIN, 17));
		bntLimpar1.setEnabled(false);
		bntLimpar1.setBackground(Color.WHITE);
		bntLimpar1.setBounds(578, 447, 115, 48);
		panel_2.add(bntLimpar1);
		
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
		
		final JComboBox cmbProveniencia = new JComboBox();
		cmbProveniencia.setEnabled(false);
		cmbProveniencia.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "Casa", "HG Mavalane", "HG Chamanculo", "HGJM", "HG Infulene", "CS Sa\u00FAde da Cidade", "CS da Prov\u00EDncia", "Gaza", "Inhambane", "Outras Prov\u00EDncias", "Clin\u00EDcas do HCM", "US Privadas"}));
		cmbProveniencia.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cmbProveniencia.setBounds(343, 113, 216, 32);
		panel_2.add(cmbProveniencia);
		
		final JComboBox cmbIsencao = new JComboBox();
		cmbIsencao.setEnabled(false);
		cmbIsencao.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "Transfer\u00EAncia do Estado", "Asma", "Dador de Sange", "Antigos  Combatentes", "Sem Recurso, Pessoal", "Outra"}));
		cmbIsencao.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cmbIsencao.setBounds(343, 63, 217, 32);
		panel_2.add(cmbIsencao);
		
		JButton button_6 = new JButton("Inserir");
		
		button_6.setEnabled(false);
		button_6.setFont(new Font("Consolas", Font.PLAIN, 17));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(592, 158, 101, 40);
		panel_2.add(button_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(343, 209, 350, 134);
		panel_2.add(scrollPane);
		
		tblAnalises = new JTable();
		tblAnalises.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"An\u00E1lises Pedidas"
			}
		));
		scrollPane.setViewportView(tblAnalises);
		
		final JComboBox cmbAnalisePedidas = new JComboBox();
		cmbAnalisePedidas.setEnabled(false);
		cmbAnalisePedidas.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma Opcao:", "HTZ", "HIV", "RX", "Urina", "Bioquimica", "Hemograma", "Outras"}));
		cmbAnalisePedidas.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cmbAnalisePedidas.setBounds(344, 161, 216, 32);
		panel_2.add(cmbAnalisePedidas);
		
		JLabel label_7 = new JLabel("Isen\u00E7\u00E3o de Pagamento:");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_7.setBounds(54, 69, 260, 22);
		panel_2.add(label_7);
		
		JLabel label_30 = new JLabel("New label");
		label_30.setLabelFor(panel_2);
		label_30.setIcon(new ImageIcon(Janela_2.class.getResource("/img/fundo.jpg")));
		label_30.setBounds(-14, -22, 975, 560);
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
		button_6.addActionListener(new ActionListener() {
			boolean exists =false;
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel modelo =(DefaultTableModel) tblAnalises.getModel();  
				for (int i = 0; i < modelo.getRowCount(); i++) {
					if(cmbAnalisePedidas.getSelectedItem().equals(modelo.getValueAt(i, 0)))
							{
						exists=true;
							}
				}
				if(exists==true)
					JOptionPane.showMessageDialog(null, "Pedido de Análise já existente na Tabela");
				if(exists==false)
				modelo.addRow(cmbAnalisePedidas.getSelectedObjects());
				
		}
	});
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtnumProcesso.setText(null);
				txtNome.setText(null);
				txtMorada.setText(null);
				txtAcompanhante.setText(null);
				txtgrauParentesco.setText(null);
				txtContactoAcompanhante.setText(null);
				cmbIdade.setSelectedIndex(0);
				cmbCidade.setSelectedIndex(0);
				
			}
		});
		bntLimpar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbIsencao.setSelectedIndex(0);
				cmbProveniencia.setSelectedIndex(0);
				cmbAnalisePedidas.setSelectedIndex(0);
				tblAnalises.setModel(new DefaultTableModel(
						new Object[][] {
							
						},
						new String[] {
							"An\u00E1lises Pedidas"
						}
					));
			}
		});
		setLocation(point.findScreenCenter(this));
	}
}
