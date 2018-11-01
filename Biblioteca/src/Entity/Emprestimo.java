package Entity;
import java.util.Date;

public class Emprestimo {
	private Livros livro;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	private Pessoa pessoa;
	public Emprestimo() {
		this.setDataEmprestimo(new Date());
	}
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public Livros getLivro() {
		return livro;
	}
	public void setLivro(Livros livro) {
		this.livro = livro;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
