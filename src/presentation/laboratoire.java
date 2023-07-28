package presentation;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import metier.Laboratoire;
import metier.gestionaire.gestionairelab;
import net.proteanit.sql.DbUtils;
import persistance.DaoLaboratoire;

@SuppressWarnings("serial")
public class laboratoire extends JFrame {

	private JPanel contentPane;
	private JTextField textid;
	private JTextField textemail;
	private JTextField textnom;
	private JTextField textresp;
	private JTextField textmbr;
	private JTable table;
	private Laboratoire Lab;
	private DaoLaboratoire obj =new DaoLaboratoire();
	private gestionairelab gl=new gestionairelab(obj, Lab);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					laboratoire frame = new laboratoire();
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
	public laboratoire() {
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
		
		textemail = new JTextField();
		textemail.setBounds(210, 151, 86, 20);
		contentPane.add(textemail);
		textemail.setColumns(10);
		
		textnom = new JTextField();
		textnom.setBounds(210, 96, 86, 20);
		contentPane.add(textnom);
		textnom.setColumns(10);
		
		textresp = new JTextField();
		textresp.setBounds(210, 204, 86, 20);
		contentPane.add(textresp);
		textresp.setColumns(10);
		
		textmbr = new JTextField();
		textmbr.setBounds(210, 259, 86, 20);
		contentPane.add(textmbr);
		textmbr.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(59, 61, 123, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("email");
		lblNewLabel_1.setBounds(59, 154, 123, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("nom");
		lblNewLabel_2.setBounds(59, 99, 123, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("responsable");
		lblNewLabel_3.setBounds(59, 211, 123, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("membre");
		lblNewLabel_4.setBounds(59, 265, 123, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lab=new Laboratoire(textid.getText(), textnom.getText(), 
					textemail.getText()	, textresp.getText(), textmbr.getText());
				gl.ajou(Lab);
			}
		});
		btnNewButton.setBounds(497, 71, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("suprimer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lab=new Laboratoire(textid.getText(), textnom.getText(), 
						textemail.getText()	, textresp.getText(), textmbr.getText());
				gl.sup(Lab.getIdlaboratoire());
			}
		});
		btnNewButton_1.setBounds(497, 127, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("modifier");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lab=new Laboratoire(textid.getText(), textnom.getText(), 
						textemail.getText()	, textresp.getText(), textmbr.getText());
			gl.modif(Lab);
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
		btnNewButton_5.setBounds(497, 277, 89, 23);
		contentPane.add(btnNewButton_5);
	}
}
