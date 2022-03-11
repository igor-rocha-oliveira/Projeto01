/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimos;

import javax.swing.JOptionPane;

public class ImprimirValores {
    public static void main(String args []){
        String aux;
        int n1, n2, i;
        
        try{
            aux = JOptionPane.showInputDialog("Digite um valor inicial");
            n1 = Integer.parseInt(aux);
                        
            aux = JOptionPane.showInputDialog("Digite o valor final");
            n2 = Integer.parseInt(aux);
            
            if (n1 < n2){
                for (i = n1; i < n2; i ++){
                    JOptionPane.showMessageDialog(null, "A sequência é:\n"+ i);
                }
            }
            else{ 
                for (i = n1; i < n2; i --){
                   JOptionPane.showMessageDialog(null, "A sequência é:\n"+ i);
                }
            }
            
        } catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Houve um erro" +erro);
        }
    }
}
