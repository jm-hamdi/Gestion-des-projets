package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class administration extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					administration frame = new administration();
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
	public administration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("prof");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				professeur pr=new professeur();
				pr.show();
				dispose();
			}
		});
		btnNewButton.setBounds(154, 11, 153, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("etudiant");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etudiant pr=new etudiant();
				pr.show();
				dispose();
			}
		});
		btnNewButton_1.setBounds(154, 56, 153, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("departement");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				départements pr=new départements();
				pr.show();
				dispose();
			}
		});
		btnNewButton_2.setBounds(154, 98, 153, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("entreprise");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entreprise pr=new entreprise();
				pr.show();
				dispose();
			}
		});
		btnNewButton_3.setBounds(154, 143, 153, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("filiere");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filiere pr=new filiere();
				pr.show();
				dispose();
			}
		});
		btnNewButton_4.setBounds(154, 188, 153, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("labo");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				laboratoire pr=new laboratoire();
				pr.show();
				dispose();
			}
		});
		btnNewButton_5.setBounds(154, 222, 153, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("precedent");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricipale pr=new pricipale();
				pr.show();
				dispose();
			}
		});
		btnNewButton_6.setBounds(335, 222, 89, 23);
		contentPane.add(btnNewButton_6);
	}

}
