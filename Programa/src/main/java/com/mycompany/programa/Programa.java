/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programa;

import entities.Conta;
import entities.Notas;
import entities.Pessoa;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author malxg
 */
public class Programa {

    public static void main(String[] args) {
        
 //Primeiros passos
//        System.out.println("Hello World!");
//        System.out.println("Olá Mundo!");
//        JOptionPane.showMessageDialog(null, 
//                    "Olá mundo!"
//                );


//Testando DoWhile
//        do {
//            int idade;
//            idade = Integer.parseInt(
//                    JOptionPane.showInputDialog("Qual a sua idade?"));
//
//            if(idade >= 18){
//                JOptionPane.showMessageDialog(null, "Você pode votar e dirigir!");
//            }else if(idade >= 16){
//                JOptionPane.showMessageDialog(null, "Você só pode votar!");
//            }else{
//                JOptionPane.showMessageDialog(null, "Você não pode nem votar nem dirigir!");
//            }
//            
//         }while("s".equals(JOptionPane.
//                 showInputDialog("Deseja continuar? (s)")));

//_______________________________________________________________________________________________

//Tabuada
//         int numero;
//         numero = Integer.parseInt(
//                 JOptionPane.showInputDialog("Escolha a tabuada desejada:")
//         );
//         
//         System.out.println("Tabuada do "+numero+":");
//         
//         for(int i=1; i<10; i++){
//             System.out.println(i+"x"+numero+"="+(i*numero));
//         }

//_______________________________________________________________________________________________

//Média Disciplina
//            Notas prova;
//            prova = new Notas();
//            
//            prova.p1 = Double.parseDouble(
//                 JOptionPane.showInputDialog("Sua nota da P1:")
//            );
//            prova.p2 = Double.parseDouble(
//                 JOptionPane.showInputDialog("Sua nota da P2:")
//            );
//            
//            double media  = prova.media();
//                  
//            JOptionPane.showMessageDialog(null, "Sua média é : "+media);

//_______________________________________________________________________________________________

    //Aula 02 - Introdução a OO
               //Criando a entidade Pessoa.
               
//               Pessoa pessoa = new Pessoa();
//               
//               pessoa.setNome("Marcos");
//               pessoa.setCpf("123.456.789");
//               
//               System.out.println(pessoa.getNome());
//               System.out.println(pessoa.getCpf());
               
//_______________________________________________________________________________________________               
     
    //exercício conta bancaria
    
    Conta conta = new Conta(0.0);
    Scanner sc = new Scanner(System.in);
    
    conta.setCliente("Marcos Gonçalves");
    System.out.println(conta.getCliente());
    
        System.out.println("Quanto deseja depositar?");
        conta.depositar(sc.nextDouble());
        System.out.println(conta.imprimeSaldo());
        
        System.out.println("Quanto deseja sacar?");
        conta.sacar(sc.nextDouble());
        System.out.println(conta.imprimeSaldo());
}
}
