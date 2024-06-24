package Exercícios;
import Exercícios.corrente;

public class Conta {
	class ContaCorrente { 
		static float dinheiroTotal; 
		float saldo; 
		String nome; 
		float verificaSaldo ( ) { 
			return saldo;
		} 
		void depositaValor (float valor){ 
			saldo = saldo + valor; 
			dinheiroTotal += valor; 
		} 
		void retiraValor (float valor) { 
			if (saldo>=valor) { 
				saldo=saldo-valor; 
				dinheiroTotal -= valor; 
				}
			}
		public static void info() {
			// TODO Auto-generated method stub
			
		}
		}

	public static void main(String[] args) {

		
	}

	public static void ContaCorrente() {
		// TODO Auto-generated method stub
		
	}

}

