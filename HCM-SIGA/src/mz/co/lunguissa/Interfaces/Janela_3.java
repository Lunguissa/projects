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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;

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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Janela_3 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtnumProcesso;
	private JTextField txtNome;
	private DateTextField txtData;
	private JTextField txtCidade;
	private JTextField txtMorada;
	private JTextField txtNomeAcompanhante;
	private JTextField txtGrauParentesco;
	private JTextField txtContactoAcompanhante;
	private JTextField txtNRAnalises;
	private JTextField textField;
	private JTextField txtIsencao;
	private JTextField txtProveniencia;
	private JTextField txtSexo;
	private JTextField txtIdade;
	private JTable table;
	private JTable tblAnalises;

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
		 UIManager.put("OptionPane.yesButtonText", "Sim");  
         UIManager.put("OptionPane.cancelButtonText", "Cancelar");  
         UIManager.put("OptionPane.noButtonText", "Não");  
         UIManager.put("OptionPane.okButtonText", "OK");  
	    Locale.setDefault(new Locale("pt","PT"));  
		addWindowListener(new WindowAdapter() {
			@Override
			  public void windowClosing(WindowEvent e) {  
			
                int i = JOptionPane.showConfirmDialog(Janela_3.this ,"Deseja voltar ao Menu Principal?", "Saída",JOptionPane.YES_NO_OPTION); 
              
                if (i == JOptionPane.YES_OPTION) {  
                	 dispose();  
  
                } else {  
                   setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }     } 
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		txtnumProcesso.setEnabled(false);
		txtnumProcesso.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtnumProcesso.setColumns(10);
		txtnumProcesso.setBackground(Color.WHITE);
		txtnumProcesso.setBounds(362, 35, 216, 30);
		panel_1.add(txtnumProcesso);
		
		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setEnabled(false);
		txtNome.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtNome.setColumns(10);
		txtNome.setBackground(Color.WHITE);
		txtNome.setBounds(362, 76, 332, 30);
		panel_1.add(txtNome);
		
		txtData = new DateTextField();
		txtData.setEnabled(false);
		txtData.repaint();
		txtData.setText("");
		txtData.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtData.setColumns(10);
		txtData.setBackground(Color.WHITE);
		txtData.setBounds(362, 117, 216, 30);
		panel_1.add(txtData);
		
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
		
		txtCidade = new JTextField();
		txtCidade.setEditable(false);
		txtCidade.setEnabled(false);
		txtCidade.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtCidade.setColumns(10);
		txtCidade.setBackground(Color.WHITE);
		txtCidade.setBounds(361, 290, 332, 30);
		panel_1.add(txtCidade);
		
		txtMorada = new JTextField();
		txtMorada.setEditable(false);
		txtMorada.setEnabled(false);
		txtMorada.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtMorada.setColumns(10);
		txtMorada.setBackground(Color.WHITE);
		txtMorada.setBounds(362, 249, 332, 30);
		panel_1.add(txtMorada);
		
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
		
		txtGrauParentesco = new JTextField();
		txtGrauParentesco.setEditable(false);
		txtGrauParentesco.setEnabled(false);
		txtGrauParentesco.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtGrauParentesco.setColumns(10);
		txtGrauParentesco.setBackground(Color.WHITE);
		txtGrauParentesco.setBounds(362, 378, 332, 30);
		panel_1.add(txtGrauParentesco);
		
		txtNomeAcompanhante = new JTextField();
		txtNomeAcompanhante.setEditable(false);
		txtNomeAcompanhante.setEnabled(false);
		txtNomeAcompanhante.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtNomeAcompanhante.setColumns(10);
		txtNomeAcompanhante.setBackground(Color.WHITE);
		txtNomeAcompanhante.setBounds(362, 332, 332, 30);
		panel_1.add(txtNomeAcompanhante);
		
		txtSexo = new JTextField();
		txtSexo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtSexo.setEnabled(false);
		txtSexo.setEditable(false);
		txtSexo.setColumns(10);
		txtSexo.setBackground(Color.WHITE);
		txtSexo.setBounds(362, 158, 216, 30);
		panel_1.add(txtSexo);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtIdade.setEnabled(false);
		txtIdade.setEditable(false);
		txtIdade.setColumns(10);
		txtIdade.setBackground(Color.WHITE);
		txtIdade.setBounds(362, 203, 216, 30);
		panel_1.add(txtIdade);
		
		JLabel lblContactoAcompanhante = new JLabel("Contacto do Acompanhante:");
		lblContactoAcompanhante.setForeground(Color.BLACK);
		lblContactoAcompanhante.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblContactoAcompanhante.setBounds(69, 423, 283, 35);
		panel_1.add(lblContactoAcompanhante);
		
		txtContactoAcompanhante = new JTextField();
		txtContactoAcompanhante.setEditable(false);
		txtContactoAcompanhante.setEnabled(false);
		txtContactoAcompanhante.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtContactoAcompanhante.setColumns(10);
		txtContactoAcompanhante.setBackground(Color.WHITE);
		txtContactoAcompanhante.setBounds(362, 424, 332, 30);
		panel_1.add(txtContactoAcompanhante);
		
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
		
		txtNRAnalises = new JTextField();
		txtNRAnalises.setEnabled(false);
		txtNRAnalises.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtNRAnalises.setEditable(false);
		txtNRAnalises.setColumns(10);
		txtNRAnalises.setBackground(Color.WHITE);
		txtNRAnalises.setBounds(403, 355, 332, 30);
		panel_2.add(txtNRAnalises);
		
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
		
		txtIsencao = new JTextField();
		txtIsencao.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtIsencao.setEnabled(false);
		txtIsencao.setEditable(false);
		txtIsencao.setColumns(10);
		txtIsencao.setBackground(Color.WHITE);
		txtIsencao.setBounds(404, 124, 216, 30);
		panel_2.add(txtIsencao);
		
		txtProveniencia = new JTextField();
		txtProveniencia.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtProveniencia.setEnabled(false);
		txtProveniencia.setEditable(false);
		txtProveniencia.setColumns(10);
		txtProveniencia.setBackground(Color.WHITE);
		txtProveniencia.setBounds(404, 174, 216, 30);
		panel_2.add(txtProveniencia);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(404, 229, 331, 115);
		panel_2.add(scrollPane_3);
		
		tblAnalises = new JTable();
		tblAnalises.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"An\u00E1lise Pedidas"
			}
		));
		scrollPane_3.setViewportView(tblAnalises);
		
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
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(337, 297, 441, 94);
		panel.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Nome do Medicamento", "Quantidade"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(140);
		scrollPane_1.setViewportView(table);
		
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
