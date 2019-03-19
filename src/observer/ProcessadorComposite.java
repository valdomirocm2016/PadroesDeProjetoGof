/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import composite.*;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Valdomiro
 */
public class ProcessadorComposite implements Processador {
    
    private List<Processador> processadores;
    
    public ProcessadorComposite(List<Processador> processadores){
        this.processadores=processadores;
    }

    @Override
    public byte[] processaConteudo(byte[] bytes) throws IOException {
        for(Processador it:processadores){
           bytes= it.processaConteudo(bytes);
        }
        
        return bytes;
    }
    
}
