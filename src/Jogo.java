package src;

import java.util.Scanner;

public class Jogo {
	// Declara��o das vari�veis 
	private Tabuleiro tabuleiro;
	private int rodada=1, vez= 1;
	private Jogador jogador1;
	private Jogador jogador2;
	 public Scanner entrada = new Scanner(System.in);
	// M�todo do Jogo para iniciar 
	
	public Jogo() {
		tabuleiro = new Tabuleiro();
		iniciarJogadores();
		while(Jogar());
	}
	
	// M�todo iniciar jogadores para escolher quem iniciar
	
	public void iniciarJogadores() {
		System.out.println("Quem vai ser o primeiro Jogador?");
		if(escolherJogador()==1)
			this.jogador1 = new Humano(1);
		else
			this.jogador1 = new Computador(1);
		System.out.println("###############################");
		
		if(escolherJogador()==2)
			this.jogador2 = new Humano(2);
		else
			this.jogador2 = new Computador(2);
	}
	
	// M�todo para escolher jogadores
	public int escolherJogador() {
		int opcao=0;
		do {
			System.out.println("1.Humano");
			System.out.println("2.Computador\n");
			System.out.print("Op��o:  ");
			opcao = entrada.nextInt();
			
			if(opcao!= 1 && opcao !=2)
				System.out.println("Op��o inv�lida! Tente novamente");
		}while(opcao !=1 && opcao !=2);
		
		return opcao;
	}
	
	// M�todo jogar
	
public boolean Jogar() {
	if(ganhou()==0) {
		System.out.println("******************************");
		System.out.println("\n Rodada"+rodada);
		System.out.println("� a vez do jogador "+ vez());
	
		if(vez()==1)
			jogador1.jogar(tabuleiro);
		else
			jogador2.jogar(tabuleiro);
	     
		if(tabuleiro.tabuleiroCompleto()) {
		System.out.println("Tabuleiro completo. Jogo empatado");
		  return false;
		}
		vez++;
		rodada++;
		
		return true;
	
	} else {
		if(ganhou()==-1)
			System.out.println("Jogador 1 ganhou!!!");
		else
			System.out.println("Jogador 2 ganhou !!!");
		return false;
	}

}

// M�todo vez 
  public int vez() {
	  if(vez%2==1)
		  return 1;
	  else
		  return 2;
  }
  
  // M�todo ganhou 
  public int ganhou() {
	  if(tabuleiro.checaLinhas()==1)
		  return 1;
	  if(tabuleiro.checaColunas()==1)
		  return 1;
	  if(tabuleiro.checaDiagonais()==1)
		  return 1;
	  
	  if(tabuleiro.checaLinhas()==-1)
		  return -1;
	  if(tabuleiro.checaColunas()==-1)
		  return -1;
	  if(tabuleiro.checaDiagonais()==-1)
		  return -1;
	  
	  return 0;
  }

}
