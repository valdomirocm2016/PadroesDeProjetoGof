/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainsOfResponsability;

import composite.*;
import java.util.Map;

/**
 *
 * @author Valdomiro
 */
public class GeradorArquivoPropriedades extends GeradorArquivo{
    
    /*public byte[] processaPropriedadesCriptografado(Map<String,Object> propriedades) {
        String conteudo= geraConteudoPropriedades(propriedades);      
        return processaCriptografado(conteudo.getBytes());
    }*/
    public GeradorArquivoPropriedades(Processador processador){
        super(processador);
    }
    @Override
     protected String gerarConteudo(Map<String,Object> propriedades){
         //GeraProperties
        StringBuilder propFileBuilder= new StringBuilder();
        for(String prop:propriedades.keySet()){
            propFileBuilder.append(prop+"="+propriedades.get(prop)+"\n");
            
        }
        return propFileBuilder.toString();
    }
    
}
