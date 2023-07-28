package presentation;

import java.awt.EventQueue;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import metier.Departement;
import metier.gestionaire.gestionairedepartement;
import net.proteanit.sql.DbUtils;
import persistance.DaoDepartement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class départements extends JFrame {

	private JPanel contentPane;
	private JTextField textid;
	private JTextField textnom;
	private JTextField textmail;
	private JTextField textchef;
	private JTextField textmembre;
	private JTable table;
	private Departement depar;
	private DaoDepartement obj=new DaoDepartement();
	private gestionairedepartement gd=new gestionairedepartement(obj,depar);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					départements frame = new départements();
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
	public départements() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textid = new JTextField();
		textid.setBounds(210, 55, 86, 20);
		contentPane.add(textid);
		textid.setColumns(10);
		
		textnom = new JTextField();
		textnom.setBounds(210, 96, 86, 20);
		contentPane.add(textnom);
		textnom.setColumns(10);
		
		textmail = new JTextField();
		textmail.setBounds(210, 151, 86, 20);
		contentPane.add(textmail);
		textmail.setColumns(10);
		
		textchef = new JTextField();
		textchef.setBounds(210, 204, 86, 20);
		contentPane.add(textchef);
		textchef.setColumns(10);
		
		textmembre = new JTextField();
		textmembre.setBounds(210, 259, 86, 20);
		contentPane.add(textmembre);
		textmembre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(122, 61, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("nom");
		lblNewLabel_1.setBounds(122, 102, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("mail");
		lblNewLabel_2.setBounds(122, 157, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("chef");
		lblNewLabel_3.setBounds(122, 211, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("membre");
		lblNewLabel_4.setBounds(122, 265, 60, 14);
		contentPane.add(lblNewLabel_4);
		
		
		JButton btnNewButton = new JButton("ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depar =new Departement(textid.getText(), textnom.getText(), 
				textmail.getText(), textchef.getText(), textmembre.getText());
	
				gd.ajou(depar);
				
			}
		});
		btnNewButton.setBounds(497, 71, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("suprimer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depar =new Departement(textid.getText(), textnom.getText(), 
						textmail.getText(), textchef.getText(), textmembre.getText());
				gd.sup(depar.getIddepartement());
			}
		});
		btnNewButton_1.setBounds(497, 127, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("modifier");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depar =new Departement(textid.getText(), textnom.getText(), 
						textmail.getText(), textchef.getText(), textmembre.getText());
				gd.modif(depar);
			}
		});
		btnNewButton_2.setBounds(497, 182, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("imprimer");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.imprimerDepar(table);
			}
		});
		btnNewButton_3.setBounds(497, 239, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(74, 326, 512, 190);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_4 = new JButton("initialiser");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.setModel(DbUtils.resultSetToTableModel(obj.afficherDepar()));
			}
		});
		btnNewButton_4.setBounds(74, 301, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("precedent");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				administration pr=new administration();
				pr.show();
				dispose();
			}
		});
		btnNewButton_5.setBounds(497, 273, 89, 23);
		contentPane.add(btnNewButton_5);
	}
}
