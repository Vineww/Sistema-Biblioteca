import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Biblioteca {
	public static void main(String args[]) {
		//cria lista com todos os livros
		List<Livros> listaLivros = new ArrayList<>();
		
		//cria lista com todos os alunos
		List<Alunos> listaAlunos = new ArrayList<>();
		
		//Instância dos livros
		Livros livro1 = new Livros();
		Livros livro2 = new Livros();
		Livros livro3 = new Livros();
		Livros livro4 = new Livros();
		
		//Populando instância do livro1
		livro1.setNomeLivro("O Senhor dos Aneis");
		livro1.setAutorLivro("J. R. R. Tolkien");
		livro1.setDataPublicacao(LocalDate.of(1954, 6, 29));
		livro1.setCodLivro(1);
		listaLivros.add(livro1);
		
		//Populando instância do livro2
		livro2.setNomeLivro("Dom Casmurro");
		livro2.setAutorLivro("Machado de Assis");
		livro2.setDataPublicacao(LocalDate.of(1899, 3, 2));
		livro2.setCodLivro(2);
		listaLivros.add(livro2);
		
		//Populando instância do livro3
		livro3.setNomeLivro("1984");
		livro3.setAutorLivro("George Orwell");
		livro3.setDataPublicacao(LocalDate.of(1949, 6, 8));
		livro3.setCodLivro(3);
		listaLivros.add(livro3);
				
		//Populando instância do livro4
		livro4.setNomeLivro("Java para iniciantes");
		livro4.setAutorLivro("Herbert Schildt");
		livro4.setDataPublicacao(LocalDate.of(2015, 1, 1));
		livro4.setCodLivro(4);
		listaLivros.add(livro4);
		
		//instânia dos alunos
		Alunos aluno1 = new Alunos();
		Alunos aluno2 = new Alunos();
		
		//populando instância aluno1
		aluno1.setNomeAluno("Vinicius Vicari");
		aluno1.setCodAluno(2124925);
		aluno1.setCursoAluno("Ciencias da computacao");
		aluno1.setUnidadeAluno("Unidade Independencia");
		listaAlunos.add(aluno1);

		//populando instância aluno2
		aluno2.setNomeAluno("Nome exemplo");
		aluno2.setCodAluno(5294212);
		aluno2.setCursoAluno("Marketing digital");
		aluno2.setUnidadeAluno("Unidade Central");
		listaAlunos.add(aluno2);

		//Declaração obj gestão
		Gestao gestao1 = new Gestao();
		
		//chamar funcao Gestao
		gestao1.exibeInfo();
		
		//receber input do usuario
		Scanner myObj = new Scanner(System.in); 
		
		//receber opção usuário
		int numB = myObj.nextInt();
		
		//gestao1.recebeNum(0, listaLivros);
		gestao1.recebeNum(numB, listaLivros, listaAlunos);

	}
}
