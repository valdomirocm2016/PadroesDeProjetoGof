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
public class ProcessaDefault extends Processador{
    public ProcessaDefault(Processador processador){
        super(processador);
    }
    public ProcessaDefault(){
        
    }
    @Override
    protected byte[]processaConteudo(byte[] conteudo) throws IOException{
        return conteudo;
    }
}
