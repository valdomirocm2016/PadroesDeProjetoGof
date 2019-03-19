/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import java.io.IOException;

/**
 *
 * @author Valdomiro
 */
public class ProcessaDefault implements Processador{
    
    @Override
    public byte[]processaConteudo(byte[] conteudo) throws IOException{
        return conteudo;
    }
}
