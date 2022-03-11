/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimos;

import javax.swing.JOptionPane;

public class SomaValoresLista {
    public static void main(String args []){
        String aux;
        int i, total = 0;
        int [] idade = {15, 46, 75, 34, 23};
        
        for(i = 0; i <= 4; i++){
            total = total + idade[i];
        }
        JOptionPane.showMessageDialog(null, "O valor da soma da lista de idade é igual a " + total +" anos!");
    }
}
