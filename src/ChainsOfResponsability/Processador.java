/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainsOfResponsability;

import composite.*;
import java.io.IOException;

/**
 *
 * @author Valdomiro
 */
public abstract class Processador {
    
    private Processador proximoProcessador;
    public Processador(){
        this.proximoProcessador=null;
    }
    public Processador(Processador proximoProcessador){
        this.proximoProcessador=proximoProcessador;
    }
    public byte[] processaCadeia(byte[] bytes) throws IOException{
        bytes=processaConteudo(bytes);
        if(proximoProcessador != null){
            bytes=proximoProcessador.processaCadeia(bytes);
        }
        return bytes;
    }
    protected abstract byte[] processaConteudo(byte[] bytes) throws IOException;
}
