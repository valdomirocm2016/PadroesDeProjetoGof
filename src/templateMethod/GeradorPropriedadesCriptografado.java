/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod;

import java.util.Map;

/**
 *
 * @author Valdomiro
 */
public class GeradorPropriedadesCriptografado extends GeradorArquivo{
    
    /*public byte[] processaPropriedadesCriptografado(Map<String,Object> propriedades) {
        String conteudo= geraConteudoPropriedades(propriedades);      
        return processaCriptografado(conteudo.getBytes());
    }*/
    @Override
     protected String gerarConteudo(Map<String,Object> propriedades){
         //GeraProperties
        StringBuilder propFileBuilder= new StringBuilder();
        for(String prop:propriedades.keySet()){
            propFileBuilder.append(prop+"="+propriedades.get(prop)+"\n");
            
        }
        return propFileBuilder.toString();
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
