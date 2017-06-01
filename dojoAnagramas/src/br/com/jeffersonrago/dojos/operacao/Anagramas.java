package br.com.jeffersonrago.dojos.operacao;

public class Anagramas implements Operacao {
	
	private String paraAnagrama;
	private StringBuilder anagramas = new StringBuilder();
	
	public Anagramas(String paraAnagrama){
		this.paraAnagrama = paraAnagrama;
	}

	@Override
	public Operacao executa() {
		processaAnagrama("", paraAnagrama);
		return this;
	}
	
	private void processaAnagrama(String prefixo, String palavra){
		if(palavra.length() <= 1){
			anagramas.append(prefixo + palavra+",");
		}else{
			for(int i=0;i< palavra.length(); i++){
				String parte1 = palavra.substring(i,i+1);
				String parte2 = palavra.substring(0,i);
				String parte3 = palavra.substring(i+1);				
				processaAnagrama(prefixo + parte1, parte2 + parte3);
			}
		}
	}
	
	@Override
	public String toString(){
		return anagramas.toString().substring(0, anagramas.toString().length()-1);
	}
}
