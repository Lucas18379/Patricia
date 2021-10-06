/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patricia_;

/**
 *
 * @author Lucas
 */
public class Patricia_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Patricia arvore = new Patricia();
        arvore.inserir("bear");
        arvore.inserir("bell");
        arvore.inserir("bid");
        arvore.inserir("bull");
        arvore.inserir("buy");
        arvore.inserir("sell");
        arvore.inserir("stock");
        arvore.inserir("stop");   
        //daqui pra cima o exemplo fica identico ao enunciado em relacão as divisões/niveis da arvores
        //com as palvras que adicionei bateu com o desenho que fiz
        arvore.inserir("stomp");
        arvore.inserir("stopped");
        arvore.inserir("start");
        arvore.inserir("string");
        arvore.inserir("strong");
        arvore.inserir("beard");
        arvore.inserir("ball");
        ////////////////////
        System.out.println("\n-----palavras: -----");
        arvore.exibir();
        System.out.println("\n-----nivel a nivel: -----");
        arvore.niveis();
    }
    
}
