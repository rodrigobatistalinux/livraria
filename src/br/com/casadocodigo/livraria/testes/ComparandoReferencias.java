package br.com.casadocodigo.livraria.testes;

import br.com.casadocodigo.livraria.Autor;

public class ComparandoReferencias {
	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123-456-789-10");

		Autor autor2 = new Autor();
		autor2.setNome("Rodrigo Turini");
		autor2.setEmail("rodrigo.turini@caelum.com.br");
		autor2.setCpf("123-456-789-10");

		if (autor == autor2) {
			System.out.println("Iguais, mesmo autor!");
		} else {
			System.out.println("heim!? Por que diferentes?");
		}
	}
}
