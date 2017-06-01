package br.com.jeffersonrago.dojos;

import br.com.jeffersonrago.dojos.operacao.Anagramas;
import br.com.jeffersonrago.dojos.operacao.Fatorial;
import br.com.jeffersonrago.dojos.operacao.Operacao;

public class TestaAnagramas {
	
	public static void main(String[] args) {
		String valor= "biro";
		
		Operacao operacaoFatorial = new Fatorial(new Long(valor.length())).executa();	
		System.out.println("Total de possibilidades: "+operacaoFatorial.toString());
		Operacao operacaoAnagramas = new Anagramas(valor).executa();
		System.out.println("Anograma: "+operacaoAnagramas.toString());
	}

}
