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
public class TVTCL extends TV implements IControleRemoto{
    public final String MODELO = "TCL";
    
    public TVTCL (int tamanho){
        super(tamanho);
    }

    @Override
    public void mudarCanal(int canal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aumentarVolume(int volume) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void diminuirVolume(int volume) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ligar() {
        super.setLigada(true);
        System.out.println("Welcome...");
        return true;
    }

    @Override
    public boolean desligar() {
        super.setLigada(false);
        System.out.println("Bye bye...");
        return false;
    }
}
