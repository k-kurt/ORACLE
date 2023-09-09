package com.bytebank.modelo;

/**
 * Probando la documentacion javadoc
 * @version 1.0
 * @author genesis
 * 
 *
 */

public abstract class Cuenta {
	
    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;
    
    
    public Cuenta() {
    
    	
    }
    
    
    /**
     * este constructor necesita 2 parametros agencia y numero para instanciar la clase
     * Cuenta
     * @param agencia
     * @param numero
     */
    public Cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        Cuenta.total ++;
    }
    
    public abstract void deposita(double valor);
    
    

    
    /**
     * este metodo retira dinero de la cuenta y si ocurre un error 
     * devuelve una exception
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
          
    	if(this.saldo<valor) {
    		throw  new SaldoInsuficienteException("no tienes saldo");
    	}
    	this.saldo -= valor; 
    }
          
    public boolean transfiere(double valor, Cuenta destino) throws SaldoInsuficienteException {
        if(this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
    @Override
    public String toString() {
    
    	String cuenta="Numero: "+this.numero+" ,Agencia: "+this.agencia;
    	
    	return cuenta;
    }

    
//    public boolean esIgual(Cuenta cuenta) {
//    	return this.agencia==cuenta.getAgencia() && this.numero==cuenta.getNumero();
//    }
    
   @Override
    public boolean equals(Object obj) {
	   Cuenta cuenta=(Cuenta)obj;
	   System.out.println("hola");
	   return this.agencia==cuenta.getAgencia() && this.numero==cuenta.getNumero();
	   
    }
    
    
    
}
