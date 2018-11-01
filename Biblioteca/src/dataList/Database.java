package dataList;
/*
 * @autor :Marcio Alexandre Freire Sindeaux
 */
import Interfaces.OperacaoDeBancoDeDados;
import Entity.Livros;
import Entity.Pessoa;
import Entity.Emprestimo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@SuppressWarnings("resource")
public class Database implements OperacaoDeBancoDeDados{
	
	public static List<Livros> livros = new ArrayList<Livros>();
	public static List<Pessoa> pessoas = new ArrayList<Pessoa>();
	public static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	
	@Override
	public void cadastrarLivro(){
		Livros l = new Livros();
		System.out.println("Digite o nome do Livro : ");
		l.setTitulo(new Scanner(System.in).nextLine());
		System.out.println("Digite o Autor do livro : ");
		l.setAutor(new Scanner(System.in).nextLine());
		System.out.println("Digite aquantidade de Paginas");
		l.setQtdPaginas(new Scanner(System.in).nextInt());
		int p = livros.size() + 1;
		l.setId(p);
		livros.add(l);
	}
	
	@Override
	public void mostrarLivrosCadastrados(){
		if(livros.size() > 0 ) {
			for(Livros l: livros) {
				System.out.println("Nome : " + l.getTitulo() + "\nAutor : " + l.getAutor()
									+ "\nNumero de Paginas : " + l.getQtdPaginas() 
									+ "\nIdentificador : " + l.getId() + "\n\n\n");
			}
		}else {
			System.out.println("Nenhum Livro Cadastrado\n");
		}
		
	}
	@Override
	public void mostrarLivrosEmprestados() {
		int cont = 0;
		for(Livros l: livros) {
			cont++;
			if(l.getEmprestado() == true) {
				System.out.print("Nome : " + l.getTitulo() + "\nAutor : " + l.getAutor()
				+ "\nNumero de Paginas : " + l.getQtdPaginas() 
				+ "\nIdentificador : " + l.getId() + "\nEmprestado para : ");
				System.out.println(procurarEmprestimo(l));
				System.out.println("\n");
				
			}
		}
		if(cont < 0) {
			System.out.println("Nenhum Livro Emprestado\n");
		}
	}
	@Override
	public void mostrarLivrosLivres() {
		int p=0;
		for(Livros l: livros) {
			p++;
			if(l.getEmprestado() == false) {
				System.out.print("Nome : " + l.getTitulo() + "\nAutor : " + l.getAutor()
				+ "\nNumero de Paginas : " + l.getQtdPaginas() 
				+ "\nIdentificador : " + l.getId() + "\nEmprestado para : ");
				System.out.println(procurarEmprestimo(l));
				System.out.println("\n");
				
			}
		}
		if(p == 0){
			System.out.println("Nenhum livro livre");
		}
		
	}
	@Override
	public void emprestarLivro() {
		System.out.println("Digite o codigo do livro");
		int identfy = new Scanner(System.in).nextInt();
		Livros l = buscarLivroPorId(identfy);
		try {
			if(l.getEmprestado() == false) {
				l.setEmprestado(true);
				System.out.println("Digite O nome da pessoa :");
				Pessoa p = new Pessoa();
				p.setNome(new Scanner(System.in).nextLine());
				System.out.println("Digite a idade da pessoa : ");
				p.setIdade(new Scanner(System.in).nextInt());
				System.out.println("Digite o Telefone para contato");
				p.setTelefone(new Scanner(System.in).nextLine());
				System.out.println("Digite o CPF da pessoa");
				p.setCpf(new Scanner(System.in).nextLine());
				pessoas.add(p);
				Emprestimo e = new Emprestimo();
				e.setLivro(l);
				e.setPessoa(p);
				System.out.println("==========================================\n        Livro emprestado com sucesso\n\n");
			}else {
				System.out.println("Infelismente o Livro esta emprestado");
			}
		}catch(NullPointerException e) {
			System.out.println("Livro não Encontrado");
		}
		
		
		
		
	}
	@Override
	public Livros buscarLivroPorId(Integer id) {
		if(livros.size() > 0 ) {
			for(Livros l: livros) {
				if(l.getId() == id) {
					return(l);
				}
			}
		}else {
			System.out.println("Nenhum Livro Cadastrado");
			return null;
		}
		return null;
	}
	public String procurarEmprestimo(Livros livro) {
		for(Emprestimo e: emprestimos) {
			if(e.getLivro().equals(livro)) {
				return(e.getPessoa().getNome());
			}
		}
		return ("Ninguem");
	}


}
