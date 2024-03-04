import java.util.Scanner; 
import java.util.List;

public class Gestao {
	public static void exibeInfo() {
		
    //Mostra opcoes
	System.out.println("Bem-vindo(a) ao sistema de biblioteca, escolha uma opcao: "
			+ "\n aperte 1 para: ver livros "
			+ "\n aperte 2 para: ver alunos "
			+ "\n apere  3 para: alocar livro"
			+ "\n aperte qualquer outra tecla para sair do sistema");
	}
	
	public static void recebeNum(int num, List<Livros> livros, List<Alunos> alunos) {
	//Lógica do programa
	switch (num) {
	case 1: {
		
		//exibe todos livros
		for(Livros livro: livros) {
			System.out.println("==========================================================");
			System.out.println("Nome: "               + livro.getNomeLivro());
			System.out.println("Autor: "              + livro.getAutorLivro());
			System.out.println("Data de Publicação: " + livro.getDataPublicacao());
			System.out.println("Código: "             + livro.getCodLivro());
			if(livro.livroDisp()) {
				
			System.out.print("Livro disponivel!" + "\n");	
			
			}else {
			
			System.out.println("Livro indisponivel" + "\n");
			}
			
			System.out.println("==========================================================");
			
			}
			
			break;
		}
	
	case 2: {
		
		//exibe alunos
		for(Alunos aluno: alunos) {
			System.out.println("===========================================================");
			System.out.println("Nome: "    + aluno.getNomeAluno());
			System.out.println("Unidade: " + aluno.getUnidadeAluno());
			System.out.println("Codigo: "  + aluno.getCodAluno());
			System.out.println("Curso: "   + aluno.getCursoAluno());
			System.out.println("===========================================================");
			
		}
		
		break;
	}
	
	case 3: {
	
	//pega livro emprestado
    Scanner lerCodAlun = new Scanner(System.in);
	System.out.println("Digite seu codigo de aluno: ");
	int codAl = lerCodAlun.nextInt();
	
	Scanner lerCodLivr = new Scanner(System.in);
	System.out.println("Digite o codigo do livro: ");
	int codLiv = lerCodLivr.nextInt();
	
	Alunos aluno = null;
	for(Alunos alu : alunos) { //itera sobre todos os elementos da lista Livros
		if(alu.getCodAluno() == codAl) {
			aluno = alu;
			break;
			
		}
		
	Livros livro = null;
	for(Livros liv : livros) {
		if(liv.getCodLivro() == codLiv) {
			livro = liv;
			break;
		}
		
	if(aluno != null && livro != null && livro.livroDisp()) {
		System.out.println("Livro alocado com sucesso para o aluno");
	}	
		
	}
	
	}
	
	}
	
	
	default:
		
		System.out.println("Muito obrigado por usar nosso sistema!");
		
			}
		}
	}
