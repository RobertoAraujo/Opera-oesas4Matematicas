package br.gov.ac.sefaz.claases.app;

import br.gov.ac.sefaz.claases.DatasCo;

public class AplicacaoData {

	public static void main(String[] args) {
		
		DatasCo date = new DatasCo();
		date.dia= 21;
		date.mes = "Novembro";
		date.ano = 2021;
		
		System.out.println("Data e " + date.dia+"/"+date.mes+"/"+date.ano);

	}

}
