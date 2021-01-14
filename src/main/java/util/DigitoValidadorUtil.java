package util;

public class DigitoValidadorUtil {
	
	
	public String calculaConverterHexa(int n) {
	    int num = n, unid, dezena, centena,unidMilhar;
		
        
        unidMilhar = (num%10000)/1000;
        centena = (num%1000)/100;
        dezena = (num%100)/10;
        unid = num%10;
        
        unidMilhar*=5;
        centena*=4;
        dezena*=3;
        unid*=2;
        	        
        int resto = (unidMilhar+centena+dezena+unid)%16;
        
        return Integer.toHexString(resto).toUpperCase();
	}
	
	
	
	public boolean verificaDigitoValidador(String n, String digitoCorrente) {
		
		String digito = calculaConverterHexa(Integer.parseInt(n));
				
		return digito.equals(digitoCorrente);
	}
	

}
