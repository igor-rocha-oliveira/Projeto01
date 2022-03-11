/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimos;

import javax.swing.JOptionPane;

public class QuantidadeDeAtrasos {
    public static void main(String args []){
        int falta = 0;
        
        while(falta <= 2){
            
            if (JOptionPane.showConfirmDialog(null, "Você faltou?","warning", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                falta ++;
                if(falta < 3){JOptionPane.showMessageDialog(null, "Você faltou "+falta+" vezes, se chegar a 3 Você é suspenso!");
                }else if(falta == 3){
                JOptionPane.showMessageDialog(null,"Você está suspenso!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Confiramada a Presença! voce tem "+falta+" faltas contadas!");
            }
        }
        
    }
}
