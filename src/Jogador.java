package src;

public abstract  class Jogador {
	// Declara��o das vari�veis 
	
	protected int[] tentativa = new int[2];
	protected  int jogador;
	
	// M�todo do jogador 
    public Jogador(int jogador) {
    	this.jogador = jogador;
    }
    // M�todo jogar 
    public abstract void jogar(Tabuleiro tabuleiro);
    
    // M�todo tentativa 
    
    public abstract void tentativa(Tabuleiro tabuleiro);
    
    
    // M�todo de checagem da tentativa
    
    public boolean checaTentativa(int[] tentativa, Tabuleiro tabuleiro) {
    	if(tabuleiro.getPosicao(tentativa) ==0)
    		return true;
    	else 
    		return false;
    }
}
