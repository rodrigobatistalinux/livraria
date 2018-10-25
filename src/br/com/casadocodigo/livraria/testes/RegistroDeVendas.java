package br.com.casadocodigo.livraria.testes;

import java.util.List;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class RegistroDeVendas {
	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");

		LivroFisico livroFisico = new LivroFisico(autor);
		livroFisico.setNome("Test-Driven Development");
		livroFisico.setValor(59.90);

		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);

		if (livroFisico.aplicaDescontoDe10Porcento()) {
			System.out.println("Valor agora é: " + livroFisico.getValor());
		}

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(livroFisico);
		carrinho.adiciona(ebook);

		System.out.println("Total " + carrinho.getTotal());

		List<Produto> produtos = carrinho.getProdutos();

		for (Produto produto : produtos) {
			System.out.println(produto.getValor());
		}
	}
}
