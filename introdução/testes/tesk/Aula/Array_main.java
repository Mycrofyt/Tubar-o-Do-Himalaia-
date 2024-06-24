package Aula;
import java.util.Scanner;


public class Array_main {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		Prod[] produtos;
		int qtde;
		System.out.println("informe a quantidade de produtos: ");
		qtde = sc.nextInt();
		produtos = new Prod[qtde];
		
		for(int i=0;i<qtde;i++) {
			
			produtos[i] = new Prod();
			
			System.out.println("informe o codigo: ");
			produtos[i].setCod(sc.nextInt());
			sc.nextLine();
			
			System.out.println("informe o peso (g): ");
			produtos[i].setGramas(sc.nextInt());
			sc.nextLine();
			
			System.out.println("informe o numero de unidades estocadas: ");
			produtos[i].setEstoque(sc.nextInt());
			sc.nextLine();
			
			System.out.println("informe o nome: ");
			produtos[i].setNome(sc.next());
			sc.nextLine();
			
			System.out.println("informe o preço: ");
			produtos[i].setPreço(sc.nextDouble());
			sc.nextLine();
			
			}
		
	sc.close();
	System.out.println("\n****Lista de produtos****");
	for(int i=0; i<produtos.length;i++) {
		System.out.println(produtos[i]);
		}
	
	}

}
