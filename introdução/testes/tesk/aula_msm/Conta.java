package aula_msm;
public class Conta {
	
	private int num;
	private int tp;
	private String nom;

	private double saldo;
	private float limite;
	private double sacar;
	private double depositar;
	private double consultar;

	


		public Conta(int num, String nom, int tp, double saldo, float limite, double sacar, double//
				depositar, double consultar, double tranferi) {
			
			this.num = num;
			this.tp = tp;
			this.nom = nom;
			this.saldo = saldo;
			this.limite = limite;
			this.consultar = consultar;
			this.depositar = depositar;
			this.sacar = sacar;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			if(num>=0)
				this.num = num;
				else 
					this.num = 0;
			this.num = num;
		}


		public int getTp() {
			return tp;
		}


		public void setTp(int tp) {
			if (tp == 1 || tp == 2)
			this.tp = tp;
			else
				this.tp = 0;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}
		

		public float getLimite() {
			return limite;
		}


		public void setLimite(float limite) {
			this.limite = limite;
		}


		public double getSaldo() {
			return saldo;
		}


		public void setSaldo(float saldo) {
			if (saldo>=(limite*(-1)))
			this.saldo = saldo;
			else
				this.saldo = limite*(-1);
		}

		public double getSacar() {
			return sacar;
		}

		public void setSacar(double sacar) {
			saldo = saldo - sacar;
			this.sacar = sacar;
		}

		public double getDepositar() {
			return depositar;
		}

		public void setDepositar(double depositar) {
			this.depositar = depositar;
		}

		public double getConsultar() {
			consultar = saldo - sacar + depositar;
			return consultar;
		}

		public void setConsultar(double consultar) {
			this.consultar = consultar;
		}


	}
