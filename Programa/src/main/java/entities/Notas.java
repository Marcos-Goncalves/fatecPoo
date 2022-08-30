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
public class Notas {
    
    public double p1;
    public double p2;
    public double p3;
    
    public double media() {
        double media = (2*p1+3*p2)/5;
        
        if(media < 6.0){
                p3 = Double.parseDouble(
                 JOptionPane.showInputDialog("Sua nota da P3:")
                );
                
                if(p1<p2){
                    media = (2*p3+3*p2)/5;
                }else{
                    media = (2*p1+3*p3)/5;
                }
            }
        
        return media;
    }
}
