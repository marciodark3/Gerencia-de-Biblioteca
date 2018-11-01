package Controller;
/*
 * @autor :Marcio Alexandre Freire Sindeaux
 */
import java.util.Scanner;
import dataList.Database;

public class Gerenciador {
	/*
	 * "db" é como se fosse o banco de dados
	 */
	public static Database db = new Database();
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		Integer opc = 0;
		do {
			System.out.println("[1] - Cadastrar um livro no banco de dados");
			System.out.println("[2] - Listar livros cadastrados");
			System.out.println("[3] - Mostrar livros emprestados");
			System.out.println("[4] - Mostrar livros livres");
			System.out.println("[5] - Emprestar Livro");
			System.out.println("[0] - Sair do sistema");
			opc = entrada.nextInt();
			switch(opc) {
			case 0 :
				/*
				 * Nada acontece, o caso foi tratado para não entrar no defaul.
				 */
			break;
			case 1:
				db.cadastrarLivro();
			break;
			case 2:
				db.mostrarLivrosCadastrados();
			break;
			case 3:
				db.mostrarLivrosEmprestados();
			break;
			case 4:
				db.mostrarLivrosLivres();
			break;
			case 5:
				db.emprestarLivro();
			break;
			default:
			break;
			}
			
		}while(opc != 0);
	}

	
}
