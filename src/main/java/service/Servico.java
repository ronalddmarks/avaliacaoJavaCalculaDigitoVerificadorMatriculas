package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import constant.URL;
import util.DigitoValidadorUtil;
import util.ManipuladorArquivoUtil;

public class Servico {

	public String calcularDigitovalidador(String n) {

		DigitoValidadorUtil digitoValidador = new DigitoValidadorUtil();
		
		String digito = digitoValidador.calculaConverterHexa(Integer.parseInt(n));

		return n + "-" + digito;

	}

	public boolean verificaDigitoValidador(String n) {

		DigitoValidadorUtil digitoValidador = new DigitoValidadorUtil();
		
		String[] output = n.split("\\-");
	
		boolean resultado = digitoValidador.verificaDigitoValidador(output[0],output[1]);
		
		return resultado;
		

	}
	
	public List<String> geraMatriculaComDV () throws IOException {
		
		ManipuladorArquivoUtil manipuladorArquivo = new ManipuladorArquivoUtil();
		
		String path = URL.MATRICULA_SEM_DV;
		
		List<String> listaDeMatriculas = new ArrayList<String>();
		listaDeMatriculas = manipuladorArquivo.leitor(path);
		
        List<String> listaMatriculasComDV = new ArrayList<String>();
        
    	for (int i = 0; i < listaDeMatriculas.size(); i++) {
			listaMatriculasComDV.add(calcularDigitovalidador(listaDeMatriculas.get(i)));
		}
    	
		return listaMatriculasComDV;
		
	}
	
	public List<String> verificarMatriculas () throws IOException{
		
		ManipuladorArquivoUtil manipuladorArquivo = new ManipuladorArquivoUtil();		
		List<String> listaMatriculasComDV = new ArrayList<String>();
		List<String> listaMatriculasComDVVerificada = new ArrayList<String>();
		
		String path = URL.MATRICULA_PARA_VERIFICAR;
		
		listaMatriculasComDV = manipuladorArquivo.leitor(path);
		
		for (int i = 0; i < listaMatriculasComDV.size(); i++) {
			boolean resultado = verificaDigitoValidador(listaMatriculasComDV.get(i));
			if (resultado) {
				listaMatriculasComDVVerificada.add(listaMatriculasComDV.get(i) + " verdadeiro");				
			}else {
				listaMatriculasComDVVerificada.add(listaMatriculasComDV.get(i) + " falso");	
				
			}
		}
				
		return listaMatriculasComDVVerificada;
				
	}
	
	public void gerarMatriculasComDVTXT () throws IOException {
		ManipuladorArquivoUtil manipuladorArquivo = new ManipuladorArquivoUtil();	
		
		String path = URL.GERAR_MATRICULA_COM_DV_TXT;
		manipuladorArquivo.escritor(path, geraMatriculaComDV());
	}
	
	
	public void gerarMatriculasVerificadasTXT () throws IOException {
		ManipuladorArquivoUtil manipuladorArquivo = new ManipuladorArquivoUtil();	
		
		String path = URL.GERAR_MATRICULA_VERIFICADAS_TXT;
		manipuladorArquivo.escritor(path, verificarMatriculas());
	}
	
	
	
	
	
	

}
