package br.com.unipe.aluno_cambio.model;

public class Conversor {
	
	private double dolar;
	private double real;
	
	
	public Conversor() {}
	
	public Conversor(double dolar, double real) {
		super();
		this.dolar = dolar;
		this.real = real;
	}
	
	public double getDolar() {
		return dolar;
	}
	public void setDolar(double dolar) {
		this.dolar = dolar;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	
	

}
