/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author malxg
 */
public class Endereco {
    private String rua;
    private String numero;
    private String cep;

    public Endereco(String rua, String numero, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String enderecoCompleto(){
        return "Rua: " + rua + " \nNúmero: " + numero + "\nCEP: " + cep;
    }
}
