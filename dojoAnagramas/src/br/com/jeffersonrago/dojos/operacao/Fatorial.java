package br.com.jeffersonrago.dojos.operacao;

public class Fatorial implements Operacao{

	private int numero = 0;
	private Long valor;
	private Long fatorial;	

	public Fatorial(Long valor){
		this.valor = valor;
	}
	
	@Override
	public Fatorial executa() {
		fatorial(valor);
		return this;		
	}
	
	private void fatorial(Long valor){
		if(numero == 0){
			numero = valor.intValue();
		}
		
		if(numero > 1){
			fatorial = valor * (numero -1);
			numero--;
			fatorial(fatorial);
		}
	}

	@Override
	public String toString(){
		return fatorial.toString();
	}
	
}
