/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author malxg
 */
public class Conta {

    private Cliente cliente;
    protected double saldo;
    
    public Conta(Cliente cliente){
        this.cliente = cliente;
    }
    
    public Conta() {
        saldo = 0.0;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }

    public String imprimeSaldo() {
        return "Saldo: " + saldo;
    }
    
    public String imprimeSaldo(boolean comCliente){
        if(comCliente){
            return "Cliente: "+ cliente.dadosCompleto() + "\n" + imprimeSaldo();
        } 
        return imprimeSaldo();
    }
}
