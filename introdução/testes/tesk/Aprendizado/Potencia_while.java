package Aprendizado;

import java.util.Scanner;  // chamado para usar o scanner

public class Potencia_while{  // citação da classe

	private static Scanner sc;

	public static void main(String[] args) {  // Definicção como classe main do programa

    	int i = 0;
    	while(i>=0) {
sc = new Scanner (System.in);
int a = sc.nextInt();
int b = a;
int c = a*b;  //Potencia sendo executada
i=c;
System.out.println(c);  // mostra o resultado no terminal

    	}
	}

}
// Bug de numeros negativos não parando o ciclo