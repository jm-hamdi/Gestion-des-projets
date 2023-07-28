package presentation;

import java.awt.EventQueue;


import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

import metier.Departement;
import metier.Etudiant;
import metier.gestionaire.gestionaireEtudiant;
import metier.gestionaire.gestionairedepartement;
import net.proteanit.sql.DbUtils;
import persistance.DaoDepartement;
import persistance.DaoEtudiant;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class etudiant extends JFrame {

	private JPanel contentPane;
	private JTextField textid;
	private JTextField textnom;
	private JTextField textmail;
	private JTextField textfiliere;
	private JTextField textniveau;
	private JTable table;
	private Etudiant et;
	private DaoEtudiant obj=new DaoEtudiant();
	private gestionaireEtudiant gd=new gestionaireEtudiant(obj,et);
	private JTextField textproj;
	private JTextField textprenom;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					etudiant frame = new etudiant();
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
	public etudiant() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textid = new JTextField();
		textid.setBounds(210, 11, 86, 20);
		contentPane.add(textid);
		textid.setColumns(10);
		
		textnom = new JTextField();
		textnom.setBounds(210, 72, 86, 20);
		contentPane.add(textnom);
		textnom.setColumns(10);
		
		textmail = new JTextField();
		textmail.setBounds(210, 128, 86, 20);
		contentPane.add(textmail);
		textmail.setColumns(10);
		
		textfiliere = new JTextField();
		textfiliere.setBounds(210, 158, 86, 20);
		contentPane.add(textfiliere);
		textfiliere.setColumns(10);
		
		textniveau = new JTextField();
		textniveau.setBounds(210, 203, 86, 20);
		contentPane.add(textniveau);
		textniveau.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(122, 14, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("nom");
		lblNewLabel_1.setBounds(122, 75, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("mail");
		lblNewLabel_2.setBounds(122, 131, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("filiere");
		lblNewLabel_3.setBounds(122, 161, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("niveau");
		lblNewLabel_4.setBounds(122, 206, 60, 14);
		contentPane.add(lblNewLabel_4);
		
		
		JButton btnNewButton = new JButton("ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				et =new Etudiant(textid.getText(), textnom.getText(), textprenom.getText(),
						textmail.getText(),textfiliere.getText(),textniveau.getText());
			
			
						gd.ajou(et);
				
			}
		});
		btnNewButton.setBounds(497, 71, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("suprimer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				et =new Etudiant(textid.getText(),textnom.getText(), textprenom.getText(), textmail.getText(),textfiliere.getText(),textniveau.getText());
			
			
						gd.sup(et.getIdetudiant());
			}
		});
		btnNewButton_1.setBounds(497, 127, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("modifier");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				et =new Etudiant(textid.getText(), textnom.getText(), textprenom.getText(), textmail.getText(),textfiliere.getText(),textniveau.getText());
			
						gd.modif(et);
						
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
		
		textproj = new JTextField();
		textproj.setBounds(210, 41, 86, 20);
		contentPane.add(textproj);
		textproj.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("id_projet");
		lblNewLabel_5.setBounds(122, 44, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textprenom = new JTextField();
		textprenom.setBounds(210, 103, 86, 20);
		contentPane.add(textprenom);
		textprenom.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("prenom");
		lblNewLabel_6.setBounds(122, 106, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_5 = new JButton("csv");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser=new JFileChooser("C:/");
				int choice=chooser.showDialog(null, "Send");
				if(choice==JFileChooser.APPROVE_OPTION) {
					File file=chooser.getSelectedFile();
					JOptionPane.showMessageDialog(null,file.getAbsolutePath(),"success",JOptionPane.INFORMATION_MESSAGE);
				
				String content=file.getAbsolutePath();
				gd.exel(content);
				}
				else {	JOptionPane.showMessageDialog(null,"no file","erro",JOptionPane.ERROR_MESSAGE);}
			}
		});
		btnNewButton_5.setBounds(497, 40, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("precedent");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				administration pr=new administration();
				pr.show();
				dispose();
			}
		});
		btnNewButton_6.setBounds(497, 275, 89, 23);
		contentPane.add(btnNewButton_6);
	}
}
