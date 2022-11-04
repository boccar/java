package app;

import java.util.Scanner;

public class Conta {

	public int numeroConta;
	protected String tipoConta; // cc, cp
	private String userName;
	private double saldo;
	private boolean oc;

	// 000000000000000000000000000
	
	Scanner sc = new Scanner(System.in);

	public Conta(int numeroConta, String tipoConta, String userName, double saldo, boolean oc) {
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.userName = userName;
		this.saldo = saldo;
		this.oc = oc;
	}

	// 0000000000000000000000000000

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isOc() {

		return oc;

	}

	public void setOc(boolean oc) {
		this.oc = oc;
	}

	// 000000000000000000000000000000000000000

	public void abrirConta(String tipoConta) {
		this.setOc(this.oc = true);
		this.setTipoConta(tipoConta);
		if (tipoConta == "cc") {
			this.setSaldo(saldo + 50);
		} else if (tipoConta == "cp") {
			this.setSaldo(saldo + 150);
		}
	}

	public void fecharConta() {
		this.setOc(oc = false);
		if (this.saldo == 0) {
			System.out.println("Sua conta foi fechada com sucesso");

		} else {
			System.out.println("Erro, voce não pode ter dinheiro na conta para fecha-la, voce tem: " + this.getSaldo());
		}
	}

	public void depositar(double s) {
		if (this.oc == true) {
			System.out.println("Quanto deseja depositar: ");
			
			this.setSaldo(this.saldo + s);
			System.out.println("Deposito realiazdo de: " + s);
		} else {
			System.out.println("Sua conta esta fechada");
		}
	}

	public void sacar(double saldo) {
		if (this.oc == true) {
			if (this.getSaldo() >= this.saldo) {
				this.setSaldo(this.saldo - saldo);
				System.out.println("Saque realizado de: " + saldo);
			} else {
				System.out.println("Seu saldo é inferior a 100");
			}
		} else {
			System.out.println("Sua conta esta fechada");
		}
	}

	public void pagarMensal() {
		if (this.getTipoConta() == "cc") {
			this.setSaldo(this.saldo - 12);
		} else if (this.getTipoConta() == "cp") {
			this.setSaldo(this.saldo - 20);
		}

	}

	public void status() {
		System.out.println("********************************");
		System.out.println("Numero da conta: " + this.getNumeroConta());
		System.out.println("O tipo da conta e: " + this.getTipoConta());
		System.out.println("O dono e: " + this.getUserName());
		System.out.println("O saldo e de: " + this.getSaldo());
		System.out.println("A situacao: " + this.isOc());

	}
}
