/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimos;

import javax.swing.JOptionPane;
import java.util.Random;

public class ChuteUmNumero {
    public static void main(String args []){
        String aux;
        int escolha, qualq;
        boolean tentativa = true;
        Random gerador = new Random();
        
        
        try{
            while(tentativa == true){
                aux = JOptionPane.showInputDialog("Digite um  numero entre 0 e 10");
                escolha = Integer.parseInt(aux);
                qualq = gerador.nextInt(11);

                if (escolha == qualq){
                    JOptionPane.showMessageDialog(null, "Você Acertou!!");
                    tentativa = false;
                } else if(escolha > qualq){
                    JOptionPane.showMessageDialog(null, "Você errou, O numero "+ qualq+" é menor que "+ escolha);
                }else{
                    JOptionPane.showMessageDialog(null, "Você errou, O numero "+ qualq +" é maior que "+ escolha);

                }
            }
        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Houve um erro, digite apenas numeros! "+ erro);
        }
        
    }
}
