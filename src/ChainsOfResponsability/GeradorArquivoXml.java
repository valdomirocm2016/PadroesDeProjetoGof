/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainsOfResponsability;

import composite.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Valdomiro
 */
public class GeradorArquivoXml extends GeradorArquivo {
    
    /*public byte[] processaXMLCompactado(Map<String,Object> propriedades) throws IOException{
        //GeraXML
        String conteudo= geraConteudoXML(propriedades);
        return processaCompactacao(conteudo.getBytes());     
    }*/
    public GeradorArquivoXml(Processador processador){
        super(processador);
    }
    @Override
    protected String gerarConteudo(Map<String,Object> propriedades){
        StringBuilder propFileBuilder = new StringBuilder();
            propFileBuilder.append("<properties>");
            for(String prop: propriedades.keySet()){
                propFileBuilder.append("<"+prop+">"+propriedades.get(prop)+"</"+prop+">");
            }
            propFileBuilder.append("</propriedades>");
            return propFileBuilder.toString();
    }
    
}
