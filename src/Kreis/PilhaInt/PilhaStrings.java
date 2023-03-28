package Kreis.PilhaInt;

public class PilhaStrings {
	  private No<String> topo;

	  public void empilhar(String valor) {
	    No<String> novoNo = new No<>(valor);
	    novoNo.setProximo(topo);
	    topo = novoNo;
	  }

	  public String desempilhar() {
	    if (vazia()) {
	      throw new RuntimeException("Pilha vazia!");
	    }
	    String valor = topo.getValor();
	    topo = topo.getProximo();
	    return valor;
	  }

	  public int tamanho() {
	    int tamanho = 0;
	    No<String> noAtual = topo;
	    while (noAtual != null) {
	      tamanho++;
	      noAtual = noAtual.getProximo();
	    }
	    return tamanho;
	  }

	  public boolean vazia() {
	    return topo == null;
	  }

	  public String topo() {
	    if (vazia()) {
	      throw new RuntimeException("Pilha vazia!");
	    }
	    return topo.getValor();
	  }
	}

	class No<T> {
	  private T valor;
	  private No<T> proximo;

	  public No(T valor) {
	    this.valor = valor;
	    this.proximo = null;
	  }

	  public T getValor() {
	    return valor;
	  }

	  public void setValor(T valor) {
	    this.valor = valor;
	  }

	  public No<T> getProximo() {
	    return proximo;
	  }

	  public void setProximo(No<T> proximo) {
	    this.proximo = proximo;
	  }
	}