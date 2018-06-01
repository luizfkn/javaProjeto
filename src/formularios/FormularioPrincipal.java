package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Acao;

import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 272, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHamburgueria = new JLabel("Hamburgueria");
		lblHamburgueria.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblHamburgueria.setBounds(55, 11, 125, 17);
		contentPane.add(lblHamburgueria);
		
		JLabel lblLogin = new JLabel("Usu\u00E1rio");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLogin.setBounds(98, 49, 71, 27);
		contentPane.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(55, 87, 137, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(98, 125, 71, 27);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(55, 163, 137, 27);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nomeUsuario = textField.getText();
				String senhaUsuario = passwordField.getText();
				Acao a = new Acao();
				//Método para validar
				boolean valida = a.validarLogin(nomeUsuario, senhaUsuario);
				
				//Verificar se o usuário é válido ou não
				if(valida == true) {
					
				dispose();
				
				FormularioMenuADM fma = new FormularioMenuADM();
				fma.setLocationRelativeTo(null);
				fma.setVisible(true);
				
				
				}else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
				}
				
			
				
					
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(24, 202, 102, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnNewButton_1.setBounds(138, 202, 102, 39);
		contentPane.add(btnNewButton_1);
	}
}
