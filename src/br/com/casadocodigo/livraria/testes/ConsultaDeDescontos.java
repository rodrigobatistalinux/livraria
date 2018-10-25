package br.com.casadocodigo.livraria.testes;

public class ConsultaDeDescontos {
	public static void main(String[] args) {

		GerenciadorDeCupons gerenciadorDeCupons = new GerenciadorDeCupons();

		Double desconto = gerenciadorDeCupons.validaCupom("CUP74");

		if (desconto != null) {
			System.out.println("Cupom de desconto válido.");
			System.out.println("Valor " + desconto);
		} else {
			System.out.println("Esse cupom não existe.");
		}
	}
}
