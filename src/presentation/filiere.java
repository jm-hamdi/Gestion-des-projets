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

import metier.Filiére;
import metier.gestionaire.gestionairfiliere;
import net.proteanit.sql.DbUtils;
import persistance.DaoDepartement;
import persistance.DaoFiliere;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class filiere extends JFrame {

	private JPanel contentPane;
	private JTextField textid;
	private JTextField textdep;
	private JTextField textnom;
	private JTextField textatt;
	private JTextField textcor;
	private JTable table;
	private DaoFiliere obj=new DaoFiliere();
	private Filiére filier;
	private gestionairfiliere gf= new gestionairfiliere(obj, filier);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					filiere frame = new filiere();
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
	public filiere() {
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
		
		textdep = new JTextField();
		textdep.setBounds(210, 96, 86, 20);
		contentPane.add(textdep);
		textdep.setColumns(10);
		
		textnom = new JTextField();
		textnom.setBounds(210, 151, 86, 20);
		contentPane.add(textnom);
		textnom.setColumns(10);
		
		textatt = new JTextField();
		textatt.setBounds(210, 204, 86, 20);
		contentPane.add(textatt);
		textatt.setColumns(10);
		
		textcor = new JTextField();
		textcor.setBounds(210, 259, 86, 20);
		contentPane.add(textcor);
		textcor.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(59, 61, 123, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("id-departement");
		lblNewLabel_1.setBounds(59, 102, 123, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("nom");
		lblNewLabel_2.setBounds(59, 157, 123, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("departement_dattache ");
		lblNewLabel_3.setBounds(59, 211, 123, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("coordonateur ");
		lblNewLabel_4.setBounds(59, 265, 123, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filier=new Filiére(textid.getText(), textdep.getText(), 
						textnom.getText(), textatt.getText(), textcor.getText());
				gf.ajou(filier);
			}
		});
		btnNewButton.setBounds(497, 71, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("suprimer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filier=new Filiére(textid.getText(), textdep.getText(), 
						textnom.getText(), textatt.getText(), textcor.getText());
		gf.sup(filier.getIdfiliére());
			}
		});
		btnNewButton_1.setBounds(497, 127, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("modifier");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filier=new Filiére(textid.getText(), textdep.getText(), 
						textnom.getText(), textatt.getText(), textcor.getText());
		gf.modif(filier);
			}
		});
		btnNewButton_2.setBounds(497, 182, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("imprimer");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.imprimer(table);
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
				table.setModel(DbUtils.resultSetToTableModel(obj.afficher()));
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
		btnNewButton_5.setBounds(497, 276, 89, 23);
		contentPane.add(btnNewButton_5);
	}
}
