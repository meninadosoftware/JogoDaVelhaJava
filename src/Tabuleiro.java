package src;

public class Tabuleiro {
	/** Declaração e inicia do tabuleiro */
	
	private int[][] tabuleiro = new int[3][3];
	
	/** Método do tabuleiro chama o método zerar tabuleiro*/
	
	public Tabuleiro() {
		zerarTabuleiro();
}
	// Método zerar tabuleiro verifica linha e coluna para zerar tabuleiro
	public  void zerarTabuleiro() {
		for(int linha=0; linha <3; linha++)
			for(int coluna=0 ; coluna<3; coluna++)
				tabuleiro[linha][coluna]=0;
	}
	
	// Método para exibir em tela o tabuleiro
	
	
	public void exibeTabuleiro() {
		System.out.println();
		for(int linha=0 ; linha<3 ; linha++) {
			for(int coluna=0 ; coluna<3 ; coluna++) {
				if(tabuleiro[linha][coluna]==-1) {
					System.out.print("X");
				}
			    if(tabuleiro[linha][coluna] == 1) {
				  System.out.print("O"); 
			   }
			   if(tabuleiro[linha][coluna]==0)  {
				   System.out.print("");
			   }
			   if(coluna ==0 || coluna == 1) {
				   System.out.print("|");
			   } 
			   
			   System.out.println();
			   
			}
			    
	   }
	}

	// Métodos get e setter para verificar tentativa de acordo com a escolha do jogador e exibir o tabuleiro
	
	 public int getPosicao(int[] tentativa){
	        return tabuleiro[tentativa[0]][tentativa[1]];
	  }

	 public void setPosicao(int[] tentativa, int jogador){
	        if(jogador == 1)
	            tabuleiro[tentativa[0]][tentativa[1]] = -1;
	        else
	            tabuleiro[tentativa[0]][tentativa[1]] = 1;
	        
	        exibeTabuleiro();
	    }
	 
	 //Método para checagem das linhas do tabuleiro 
	 
	public int checaLinhas() {
		for(int linha=0; linha<3 ; linha++) {
            if(tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]== -3)
				return -1;
			if(tabuleiro[linha][0]+ tabuleiro[linha][1]+ tabuleiro[linha][2]==3)
				return 1;
		}
		     return 0;
	}
	
	// Método para checagem das colunas do tabuleiro 
	
	public int checaColunas() {
		for(int coluna=0 ; coluna < 3 ; coluna++) {
			if(tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]==-3)
				return -1;
			if(tabuleiro[0][coluna]+ tabuleiro[1][coluna]+ tabuleiro[2][coluna]==3)
				return 1;
		}
		return 0;
			
	}
	
	// Método para checagem das diagonais do tabuleiro 
	public int checaDiagonais() {
		if(tabuleiro[0][0] + tabuleiro[1][1]  + 
				tabuleiro[2][2] ==-3)
	     return -1;
		if(tabuleiro[0][0] +  tabuleiro[1][1] +    tabuleiro[2][2]==3)
			return 1;
		if(tabuleiro[0][2] +  tabuleiro[1][1] + tabuleiro[2][0]==-3)
			return -1;
		if(tabuleiro[0][2] +  tabuleiro[1][1] + tabuleiro[2][0]==3)
			return 1;
		return 0;
	}
	
	// verificação completa do tabuleiro
    public boolean tabuleiroCompleto() {
        for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna<3 ; coluna++)
                if( tabuleiro[linha][coluna]==0 )
                    return false;
        return true;
    }
	
	
}
