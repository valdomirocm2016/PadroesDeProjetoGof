/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Valdomiro
 */
public class LogService implements Observador {

    @Override
    public void novoArquivoGerado(String n, String c) {
        System.out.println("Novo Arquivo gerado nome: "+n+" Conteudo "+c);
    }
    
}
