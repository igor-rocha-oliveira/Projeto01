/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimos;

import javax.swing.JOptionPane;

public class FatorialNumero {
    public static void main(String args []){
        String aux;
        int cont,resultado = 1;
        
        try{
            aux = JOptionPane.showInputDialog("Digite um numero para saber seu fatorial");
            cont = Integer.parseInt(aux);
            
            for (int y = 1; y <= cont ; y++){
                resultado = resultado * y;
            }
            JOptionPane.showMessageDialog(null, "O fatorial de "+cont+" e igual a "+resultado);
        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Houve um erro! "+ erro);
        }
    }
    
}
