package principal;

import java.io.IOException;

import service.Servico;

public class Principal {
  
	
	public static void main(String[] args) throws IOException {
		
	     Servico servico = new Servico();
		 
		 servico.gerarMatriculasComDVTXT();
		 servico.gerarMatriculasVerificadasTXT();
		 
		 System.out.println("FIM");
	
	}

}
