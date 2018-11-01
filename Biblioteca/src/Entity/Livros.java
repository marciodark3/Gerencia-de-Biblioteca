package Entity;
/*
 * @autor :Marcio Alexandre Freire Sindeaux
 */
public class Livros {
	private int id;
	private String titulo;
	private String autor;
	private Integer qtdPaginas;
	private boolean emprestado;
	
	public Livros() {
		this.setEmprestado(false);
	}
	
	public Livros(String t,String a,int p,Integer id) {
		this.setAutor(a);
		this.setQtdPaginas(p);
		this.setTitulo(t);
		this.setId(id);
		this.setEmprestado(false);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public Integer getQtdPaginas() {
		return qtdPaginas;
	}
	public void setQtdPaginas(Integer qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public boolean getEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
