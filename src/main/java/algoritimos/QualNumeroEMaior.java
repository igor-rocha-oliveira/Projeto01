/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimos;

import javax.swing.JOptionPane;

public class QualNumeroEMaior {
    public static void main(String args []){
        String aux;
        int n1, n2, maior;
        
        try{
            aux = JOptionPane.showInputDialog("Digite o primeiro valor");
            n1 = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Digite o segundo valor");
            n2 = Integer.parseInt(aux);

            if (n1 < n2){
                maior = n2;
            } else{
                maior = n1;
            }
            JOptionPane.showMessageDialog(null,"O maior valor entre os dois é "+ maior);
    
        } catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null,"Houve um erro!"+ erro);
        }   
    }
}
