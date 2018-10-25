package br.com.casadocodigo.livraria;

import java.util.ArrayList;
import java.util.List;

import br.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompras {

	private double total;
	private List<Produto> produtos;

	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<>();
	}

	public double getTotal() {
		return total;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void adiciona(Produto produto) {
		this.produtos.add(produto);
		total += produto.getValor();
	}

	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}
}
