/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimos;

import java.io.*;

public class EntradaEOperadores {
    public static void main(String args []){
        String nome;
        DataInputStream dado;
        try{
            System.out.println("Digite seu nome");
            dado = new DataInputStream(System.in);
            nome = dado.readLine();
            System.out.println("Seu nome é: "+ nome);
        } catch(IOException erro){
            System.out.println("Houve um erro!");
        }
        
        
        
    }
    
}
