package Interfaces;
/*
 * @autor :Marcio Alexandre Freire Sindeaux
 */
import Entity.Livros;

public interface OperacaoDeBancoDeDados {
	
	public abstract void cadastrarLivro();
	public abstract void mostrarLivrosCadastrados();
	public abstract void mostrarLivrosEmprestados();
	public abstract void mostrarLivrosLivres();
	public abstract void emprestarLivro();
	public abstract String procurarEmprestimo(Livros livro);
	public abstract Livros buscarLivroPorId(Integer Id);
}
