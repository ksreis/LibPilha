package Kreis.PilhaInt;

public class PilhaInt {
		  private int[] pilha;
		  private int topo;

		  public PilhaInt(int capacidade) {
		    this.pilha = new int[capacidade];
		    this.topo = -1;
		  }

		  public void empilhar(int valor) {
		    if (this.topo == this.pilha.length - 1) {
		      throw new RuntimeException("Pilha cheia!");
		    }
		    this.topo++;
		    this.pilha[this.topo] = valor;
		  }

		  public int desempilhar() {
		    if (this.topo == -1) {
		      throw new RuntimeException("Pilha vazia!");
		    }
		    int valor = this.pilha[this.topo];
		    this.topo--;
		    return valor;
		  }

		  public int tamanho() {
		    return this.topo + 1;
		  }

		  public boolean vazia() {
		    return this.topo == -1;
		  }

		  public int topo() {
		    if (this.topo == -1) {
		      throw new RuntimeException("Pilha vazia!");
		    }
		    return this.pilha[this.topo];
		  }
}
