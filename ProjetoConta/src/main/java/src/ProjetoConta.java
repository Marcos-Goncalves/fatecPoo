/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package src;

import entities.Cliente;
import entities.Conta;
import entities.Endereco;
import javax.swing.JOptionPane;

/**
 *
 * @author malxg
 */
public class ProjetoConta {

    public static void main(String[] args) {
        Conta conta;
        String opcoes = "";
        String[] menu = new String[]{"Depositar", "Sacar", "Saldo", "Sair"};

//        PASSANDO DADOS PELO CONSTRUTOR
//        Cliente cliente = new Cliente(JOptionPane.showInputDialog("Digite o nome de usuário"),JOptionPane.showInputDialog("Digite o CPF"),
//                new Endereco(JOptionPane.showInputDialog("Digite a rua: "), JOptionPane.showInputDialog("Digite o numero: "), JOptionPane.showInputDialog("Digite o cep: ")));

//            VIA SET.ENDERECO
//           Cliente cliente = new Cliente(JOptionPane.showInputDialog("Digite o nome de usuário"),JOptionPane.showInputDialog("Digite o CPF"));
//           cliente.setEndereco(new Endereco (JOptionPane.showInputDialog("Digite a rua: "), JOptionPane.showInputDialog("Digite o numero: "), JOptionPane.showInputDialog("Digite o CEP: ")));

        conta = new Conta(new Cliente(JOptionPane.showInputDialog("Digite o nome de usuário"),JOptionPane.showInputDialog("Digite o CPF"), 
                new Endereco (JOptionPane.showInputDialog("Digite a rua: "), JOptionPane.showInputDialog("Digite o numero: "), JOptionPane.showInputDialog("Digite o CEP: "))));

        do {
            opcoes = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Menu", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);

            switch (opcoes) {
                case "Depositar": {
                    conta.depositar(Double.parseDouble(JOptionPane.showInputDialog("Valor de depósito")));
                    break;
                }
                case "Sacar": {
                    conta.sacar(Double.parseDouble(JOptionPane.showInputDialog("Valor de saque")));
                    break;
                }
                case "Saldo": {
                    JOptionPane.showMessageDialog(null, conta.imprimeSaldo(true));
                    break;
                }
                case "Sair": {
                    JOptionPane.showMessageDialog(null, "Até mais!");
                }
            } 
        }while (!opcoes.equals("Sair"));
    }
}
