/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainsOfResponsability;

import composite.*;

/**
 *
 * @author Valdomiro
 */
public class ProcessaCriptografado extends Processador{
    
    public ProcessaCriptografado(Processador processador){
        super(processador);
    }
    public ProcessaCriptografado(){
        
    }
     @Override
      protected byte[] processaConteudo(byte[] bytes){
         byte[] newBytes = new byte[bytes.length];
        for(int i=0;i<bytes.length;i++){
            newBytes[i] = (byte)((bytes[i]+10)% Byte.MAX_VALUE);
            
        }
        return newBytes;
    }
    
}
