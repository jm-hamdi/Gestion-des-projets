package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pricipale extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pricipale frame = new pricipale();
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
	public pricipale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("administration");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				administration ad=new administration();
				ad.show();
				dispose();
			}
		});
		btnNewButton.setBounds(269, 91, 180, 37);
		contentPane.add(btnNewButton);
		
		JButton btnProfesseur = new JButton("professeur");
		btnProfesseur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_prof ad=new login_prof();
				ad.show();
				dispose();
			}
		});
		btnProfesseur.setBounds(269, 158, 180, 37);
		contentPane.add(btnProfesseur);
		
		JButton btnEtudiant = new JButton("etudiant");
		btnEtudiant.setBounds(269, 218, 180, 37);
		contentPane.add(btnEtudiant);
	}

}
