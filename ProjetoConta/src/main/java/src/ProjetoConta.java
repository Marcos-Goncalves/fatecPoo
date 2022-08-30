/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package src;

import entities.Conta;
import javax.swing.JOptionPane;

/**
 *
 * @author malxg
 */
public class ProjetoConta {

    public static void main(String[] args) {
        Conta conta = new Conta(0.0);
        String opcoes = "";
        String[] menu = new String[]{"Depositar", "Sacar", "Saldo", "Sair"};

        conta.setCliente(JOptionPane.showInputDialog("Digite o nome de usuário"));

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
                    JOptionPane.showMessageDialog(null, conta.imprimeSaldo());
                    break;
                }
                case "Sair": {
                    JOptionPane.showMessageDialog(null, "Até mais!");
                }
            } 
        }while (!opcoes.equals("Sair"));
    }
}
