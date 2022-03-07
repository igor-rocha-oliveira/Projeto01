/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class SalarioHora {
    public static void main(String args []){
        String aux;
        double salarioMensal, horaTrabalhada, valorHora;
        
        try{
            aux = JOptionPane.showInputDialog("Digite o valor do salario mensal do funcionario: ");
            salarioMensal = Double.parseDouble(aux);
            
            aux = JOptionPane.showInputDialog("Digite a hora trabalhada do funcionario: ");
            horaTrabalhada = Double.parseDouble(aux);
            
            valorHora = salarioMensal / horaTrabalhada;
            
            JOptionPane.showMessageDialog(null, "O funcionario ganha R$"+ new DecimalFormat(".##").format(valorHora) +" por hora!");
            
        } catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Houve um erro, digite apenas numeros!" + erro.toString());
        }
        
       
    }
    
}
