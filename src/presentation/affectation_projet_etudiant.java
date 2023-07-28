package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import metier.gestionaire.gestionaireAfectaion;
import net.proteanit.sql.DbUtils;
import persistance.DaoAfectation;
import persistance.DaoEtudiant;
import persistance.DaoProjet;
import persistance.connexion;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class affectation_projet_etudiant extends JFrame {

	private JPanel contentPane;
	private String  id;
	private JTextField textprojet;
	private JTextField textetudiant;
	private DaoProjet obj=new DaoProjet();
	private DaoEtudiant obj1=new DaoEtudiant();
	private JTable table_1;
	private DaoAfectation ob;
	private gestionaireAfectaion ga=new gestionaireAfectaion(ob);

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
				
					affectation_projet_etudiant frame = new affectation_projet_etudiant();
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
	public affectation_projet_etudiant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700,700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);	
		contentPane.setLayout(null);
		
		textprojet = new JTextField();
		textprojet.setBounds(157, 73, 86, 20);
		contentPane.add(textprojet);
		textprojet.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("id projet");
		lblNewLabel.setBounds(65, 76, 46, 14);
		contentPane.add(lblNewLabel);
		
		textetudiant = new JTextField();
		textetudiant.setBounds(442, 73, 86, 20);
		contentPane.add(textetudiant);
		textetudiant.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("id etudiant");
		lblNewLabel_1.setBounds(343, 76, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ga.isvalide(textprojet.getText(),id,textetudiant.getText());
				
			}
		});
		btnNewButton.setBounds(293, 173, 89, 23);
		contentPane.add(btnNewButton);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(36, 323, 409, 85);
	contentPane.add(scrollPane);
	
	JTable table = new JTable();
	scrollPane.setViewportView(table);
	
	JButton btnNewButton_1 = new JButton("projet");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			table.setModel(DbUtils.resultSetToTableModel(obj.afficher()));
		}
	});
	btnNewButton_1.setBounds(36, 289, 89, 23);
	contentPane.add(btnNewButton_1);
	
	
	
	JScrollPane scrollPane_1 = new JScrollPane();
	scrollPane_1.setBounds(36, 489, 409, 85);
	contentPane.add(scrollPane_1);
	
	table_1 = new JTable();
	scrollPane_1.setViewportView(table_1);
JButton btnNewButton_2 = new JButton("etudiant");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			table_1.setModel(DbUtils.resultSetToTableModel(obj1.afficher()));
		}
	});
	btnNewButton_2.setBounds(36, 432, 89, 23);
	contentPane.add(btnNewButton_2);
	}
}
