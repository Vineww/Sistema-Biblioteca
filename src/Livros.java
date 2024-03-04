import java.time.LocalDate;
public class Livros {
	
	//Declarações
	public String 	   nomeLivro;
	public String 	   autorLivro;
	public LocalDate   dataPublicacao;
	public int    	   codLivro;
	public boolean     disponivel;
	
	
	//inicia um construtor
	public Livros() {
		
	//define livros como disponiveis
	disponivel = true;
	}
	
	//Métodos
	public boolean livroDisp() {
	return disponivel;
		}
	
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getAutorLivro() {
		return autorLivro;
	}
	public void setAutorLivro(String autorLivro) {
		this.autorLivro = autorLivro;
	}
	public int getCodLivro() {
		return codLivro;
	}
	public void setCodLivro(int codLivro) {
		this.codLivro = codLivro;
	}
	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
		}
	
	}

