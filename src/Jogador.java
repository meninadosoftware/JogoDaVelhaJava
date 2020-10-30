package src;

public abstract  class Jogador {
	// Declaração das variáveis 
	
	protected int[] tentativa = new int[2];
	protected  int jogador;
	
	// Método do jogador 
    public Jogador(int jogador) {
    	this.jogador = jogador;
    }
    // Método jogar 
    public abstract void jogar(Tabuleiro tabuleiro);
    
    // Método tentativa 
    
    public abstract void tentativa(Tabuleiro tabuleiro);
    
    
    // Método de checagem da tentativa
    
    public boolean checaTentativa(int[] tentativa, Tabuleiro tabuleiro) {
    	if(tabuleiro.getPosicao(tentativa) ==0)
    		return true;
    	else 
    		return false;
    }
}
