package presentation;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import metier.Projet;
import metier.gestionaire.gestionaireprojet;
import net.proteanit.sql.DbUtils;
import persistance.DaoProjet;

public class projet extends JFrame {

	private JPanel contentPane;
	private JTextField textid;
	private JTextField texttitre;
	private JTextField textetap;
	private JTable table;
	private String D;
	private String F;
	private String T;
	private Projet p=new Projet();
	private DaoProjet obj =new DaoProjet();
	private gestionaireprojet gp=new gestionaireprojet(obj,p);
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {	
				try {
					projet frame = new projet();
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
	public projet() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textid = new JTextField();
		textid.setBounds(119, 11, 86, 20);
		contentPane.add(textid);
		textid.setColumns(10);
		
		texttitre = new JTextField();
		texttitre.setBounds(119, 42, 86, 20);
		contentPane.add(texttitre);
		texttitre.setColumns(10);
		
		textetap = new JTextField();
		textetap.setBounds(119, 72, 86, 20);
		contentPane.add(textetap);
		textetap.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(20, 14, 73, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("titre");
		lblNewLabel_2.setBounds(20, 42, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("date de depart");
		lblNewLabel_3.setBounds(213, 14, 73, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("etepe");
		lblNewLabel_4.setBounds(20, 80, 123, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				p=new Projet(textid.getText(), id, 
						texttitre.getText(), F,D, textetap.getText(),T);
				System.out.print(p.getIdProf()+"     ");
				gp.ajou(p);
			}
		});
		btnNewButton.setBounds(497, 71, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("suprimer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p=new Projet(textid.getText(), id, 
						texttitre.getText(), F,D, textetap.getText(),T);
				gp.sup(p.getIdProjet());
			}
		});
		btnNewButton_1.setBounds(497, 127, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("modifier");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p=new Projet(textid.getText(), id, 
						texttitre.getText(), F,D, textetap.getText(),T);
				gp.modif(p);
			}
		});
		btnNewButton_2.setBounds(497, 182, 89, 23);
		contentPane.add(btnNewButton_2);
		
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
		
		JLabel lblNewLabel_5 = new JLabel("type");
		lblNewLabel_5.setBounds(213, 106, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		Object [] element =new Object[] {"janvier"," février", "mars", "avril", "mai", "juin"," juillet", "août", "septembre", "octobre", "novembre" ,"décembre"};
		JComboBox<String> comboBox = new JComboBox(element);
		comboBox.setBounds(289, 11, 97, 20);
		contentPane.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				e.getSource();
			D=(String) comboBox.getSelectedItem();
				
			}
		});
		Object [] element_1 =new Object[] {"janvier"," février", "mars", "avril", "mai", "juin"," juillet", "août", "septembre", "octobre", "novembre" ,"décembre"};
		
		JComboBox<String> comboBox_1 = new JComboBox(element_1);
		comboBox_1.setBounds(289, 57, 97, 20);
		contentPane.add(comboBox_1);
		
	comboBox_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				e.getSource();
				F=(String) comboBox_1.getSelectedItem();
			}
		});
		JLabel lblNewLabel_3_1 = new JLabel("date fin");
		lblNewLabel_3_1.setBounds(213, 60, 73, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnNewButton_3 = new JButton("precedent");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				projet_prof ad=new projet_prof();
				ad.show();
				dispose();
			}
		});
		btnNewButton_3.setBounds(497, 224, 89, 23);
		contentPane.add(btnNewButton_3);
		Object [] element_2 =new Object[] {"PFA","PFE","DOCTORAT"};
		JComboBox<String> comboBox_2 = new JComboBox(element_2);
		comboBox_2.setBounds(289, 102, 97, 22);
		contentPane.add(comboBox_2);
	comboBox_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				e.getSource();
				T=(String) comboBox_2.getSelectedItem();
			}
		});
	}
}
