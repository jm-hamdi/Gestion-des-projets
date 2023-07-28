package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import metier.Entreprise;
import metier.gestionaire.gestionaireentreprise;
import net.proteanit.sql.DbUtils;
import persistance.DaoEntrprise;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class entreprise extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private Entreprise entre; 
	private DaoEntrprise obj=new DaoEntrprise();
	private gestionaireentreprise ge=new gestionaireentreprise(obj, entre);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					entreprise frame = new entreprise();
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
	public entreprise() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(106, 75, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 119, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 169, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(106, 210, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(106, 267, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(106, 328, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(22, 78, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("raison sociale ");
		lblNewLabel_1.setBounds(22, 122, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("adresse");
		lblNewLabel_2.setBounds(22, 172, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("tele");
		lblNewLabel_3.setBounds(22, 213, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("mail");
		lblNewLabel_4.setBounds(22, 270, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("responsable");
		lblNewLabel_5.setBounds(22, 331, 74, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entre=new Entreprise(textField.getText(), textField_1.getText(),
						textField_2.getText(), textField_3.getText(), 
						textField_4.getText(), textField_5.getText());
				ge.ajou(entre);
			}
		});
		btnNewButton.setBounds(345, 74, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("modifier");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entre=new Entreprise(textField.getText(), textField_1.getText(),
						textField_2.getText(), textField_3.getText(), 
						textField_4.getText(), textField_5.getText());
				ge.modif(entre);
			}
		});
		btnNewButton_1.setBounds(345, 118, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("suprimer");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entre=new Entreprise(textField.getText(), textField_1.getText(),
						textField_2.getText(), textField_3.getText(), 
						textField_4.getText(), textField_5.getText());
				ge.sup(entre.getIdentreprise());
			}
		});
		btnNewButton_2.setBounds(345, 168, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("imprimer");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.imprimer(table);
			}
		});
		btnNewButton_3.setBounds(345, 220, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 402, 553, 182);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_4 = new JButton("initialiser");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.setModel(DbUtils.resultSetToTableModel(obj.afficher()));
			}
		});
		btnNewButton_4.setBounds(22, 373, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("precedent");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				administration pr=new administration();
				pr.show();
				dispose();
			}
		});
		btnNewButton_5.setBounds(345, 254, 89, 23);
		contentPane.add(btnNewButton_5);
	}

}
