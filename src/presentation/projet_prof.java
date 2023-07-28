package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class projet_prof extends JFrame {

	private JPanel contentPane;
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
					projet_prof frame = new projet_prof();
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
	public projet_prof() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("creer un neauvou projet");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				projet ad=new projet();
				ad.setId(getId());
			
				ad.show();
				dispose();
			}
		});
		btnNewButton.setBounds(133, 137, 253, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("affecter un projet");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				affectation_projet_etudiant fen=new affectation_projet_etudiant();
				fen.setId(getId());
				fen.show();
				dispose();
			}
		});
		btnNewButton_1.setBounds(133, 171, 253, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("precedent");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricipale ad=new pricipale();
				ad.show();
				dispose();
			}
		});
		btnNewButton_2.setBounds(451, 160, 89, 23);
		contentPane.add(btnNewButton_2);
	}

}
