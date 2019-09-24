/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Willian
 */
public interface IControleRemoto {
    // - INTERFACE possui apenas a assinatura (declaração) dos
    //metodos - e a implementaçao dos metodos estará
    //nas classes que assinarem o contrato com a minha interface
    // - OBRIGATORIAMENTE todos os metodos declarados na INTERFACE
    //deverao ser implementados nas classes que assinaram os 
    //metodos.
    
    public void mudarCanal(int canal);
    public void aumentarVolume(int volume);
    public void diminuirVolume(int volume);
    public boolean ligar();
    public boolean desligar();
    
    
}
