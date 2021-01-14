package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ManipuladorArquivoUtil {

	public List<String> leitor(String path) throws IOException {

		List<String> listaMatricula = new ArrayList<String>();

		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		linha = buffRead.readLine();

		while (true) {
			if (linha != null) {

				listaMatricula.add(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();

		return listaMatricula;

	}

	public void escritor(String path, List<String> lista) throws IOException {
		
			
	        FileWriter arq = new FileWriter(path);
		    PrintWriter gravarArq = new PrintWriter(arq);
			 
		    for (int i = 0; i < lista.size(); i ++) {
		        gravarArq.printf(lista.get(i) + "%n");
		    }
		    
		    arq.close();
		
		
	}

}