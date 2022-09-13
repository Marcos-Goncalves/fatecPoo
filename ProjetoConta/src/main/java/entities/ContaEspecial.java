/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import javax.swing.JOptionPane;

/**
 *
 * @author malxg
 */
public class ContaEspecial  extends Conta{
    private double limite;
    
    public ContaEspecial (double limite){
        this.limite = limite;
    }
    
    public ContaEspecial(double limite, Cliente cliente){
        super(cliente);
        this.limite = limite;
    }
    
    @Override
    public boolean sacar(double valor){
        if(valor > saldo + limite){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
            return false;
        }
        saldo -= valor;
        return true;
    }
    
    @Override
    public String imprimeSaldo(){
        return "Limite: " + limite + "\n" + super.imprimeSaldo();
    }
    
    public double getLimite(){
        return limite;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
}
