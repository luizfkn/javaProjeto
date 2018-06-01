package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class FormularioMenuADM extends JFrame {

	private JPanel contentPane;

	public FormularioMenuADM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Pedidos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(43, 127, 148, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Entrar Funcionario");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(43, 164, 148, 38);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("MENU HAMBURGUERIA");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblNewLabel.setBounds(39, 19, 148, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("Adicionar Estoque");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(43, 90, 148, 38);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Contratar");
		btnNewButton_4.setBounds(43, 54, 148, 38);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(43, 200, 148, 38);
		contentPane.add(btnNewButton_1);
	}
}
