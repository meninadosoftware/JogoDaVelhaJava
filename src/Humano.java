package src;

import java.util.Scanner;

public  class Humano extends Jogador {

	// declara��es de vari�veis
	
	public Scanner entrada = new Scanner(System.in);
	
	// M�todo para criar o jogador humano 
	public Humano(int jogador) {
		super(jogador);
		this.jogador = jogador;
		System.out.println("Jogador 'Humano' criado!");
	}
	// M�todo para humano jogar no tabuleiro
	
	@Override
	public void jogar(Tabuleiro tabuleiro) {
		tentativa(tabuleiro);
		tabuleiro.setPosicao(tentativa, jogador);
		
	}
	// M�todo da tentativa humano




	@Override
	public void tentativa(Tabuleiro tabuleiro) {
		do {
			do {
			 System.out.print("Linha:");
			 tentativa[0]= entrada.nextInt();
			   if(tentativa[0]>3 || tentativa[0]<1)
				   System.out.println("Linha inv�lida.� 1,2 ou 3");
			   
			 
			}while(tentativa[0]>3 || tentativa[0]<1);
			do {
				System.out.print("Coluna:");
				tentativa[1]= entrada.nextInt();
				if(tentativa[1]>3 || tentativa[1]<1)
					System.out.println("Coluna inv�lida.� 1,2 ou 3");	
				
			}while(tentativa[1]>3 || tentativa[1]<1);
				tentativa[0]--;
			    tentativa[1]--;
			    if(!checaTentativa(tentativa, tabuleiro))
			    	System.out.println("Local marcado . Tente outro");
		}while(!checaTentativa(tentativa, tabuleiro));
		
	}

	
	
}


