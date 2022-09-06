/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author malxg
 */
public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;
    
    public Cliente(){}
    
    public Cliente(String nome, String cpf, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public Cliente(String nome){
        this.nome = nome;
    }
    
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String dadosCompleto(){
        return nome + "\nCPF: " + cpf + "\n" + endereco.enderecoCompleto();
    }
}
