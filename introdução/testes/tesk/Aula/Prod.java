package Aula;

public class Prod {
	
	private int cod;
	private int gramas;
	private int estoque;
	private String nome;
	private double preço;	
	
    public String toString() {
        return "Produto{" +
                "codigo=" + cod +
                ", nome='" + nome + '\'' +
                ", preco=" + preço +
                ", estoque=" + estoque +
                '}';
        
    }
	public void prod() {
		
		
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public int getGramas() {
		return gramas;
	}


	public void setGramas(int gramas) {
		this.gramas = gramas;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreço() {
		return preço;
	}


	public void setPreço(double preço) {
		this.preço = preço;
	}

}
