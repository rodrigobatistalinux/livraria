package br.com.casadocodigo.casadoavaoocodigo.livraria.testes;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {
	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");

		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java O.O.");

		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8 Prático");

		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de Ruby");

		List<Livro> livros = Arrays.asList(javaoo, java8, ruby);

		/*
		 * Collections.sort(livros, new ComparadorPorNome());
		 * 
		 * Collections.sort(livros, new Comparator<Livro>() {
		 * 
		 * @Override public int compare(Livro l1, Livro l2) { return
		 * l1.getNome().compareTo(l2.getNome()); } });
		 * 
		 * livros.sort(new Comparator<Livro>() {
		 * 
		 * @Override public int compare(Livro l1, Livro l2) { return
		 * l1.getNome().compareTo(l2.getNome()); } });
		 * 
		 * livros.sort((Livro l1, Livro l2) -> { return
		 * l1.getNome().compareTo(l2.getNome()); });
		 * 
		 * livros.sort((l1, l2) -> l1.getNome().compareTo(l2.getNome()));
		 * 
		 * livros.sort(Comparator.comparing(l -> l.getNome()));
		 * 
		 * livros.sort(comparing(l -> l.getNome()));
		 */

		livros.sort(comparing(Livro::getNome));

		livros.forEach(l -> System.out.println(l.getNome()));

		/*
		 * List<Livro> filtrados = new ArrayList<Livro>();
		 * 
		 * for (Livro livro : livros) { if (livro.getNome().contains("Java")) {
		 * filtrados.add(livro); } }
		 * 
		 * System.out.println(); for (Livro livro : filtrados) {
		 * System.out.println(livro.getNome()); }
		 */

		System.out.println();

		@SuppressWarnings("unused")
		Stream<Livro> stream = livros.stream();

		livros.stream().filter(l -> l.getNome().contains("Java")).forEach(l -> System.out.println(l.getNome()));
	}
}
