package controladores;

public class Acao {

	//Validar login
	public boolean validarLogin(String nomeUsuario, String senhaUsuario) {
		
		boolean existe = false;
		
		if((nomeUsuario.equals("admin")) && (senhaUsuario.equals("123"))) {
			existe = true;
		}
		
		return existe;
	}
	
	//Retornar o n�vel
	public int retornarNivel() {
		return 1;
	}
	
}