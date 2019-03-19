/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Valdomiro
 */
public class GeradorXmlCompactado extends GeradorArquivo {
    
    /*public byte[] processaXMLCompactado(Map<String,Object> propriedades) throws IOException{
        //GeraXML
        String conteudo= geraConteudoXML(propriedades);
        return processaCompactacao(conteudo.getBytes());     
    }*/
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
    @Override
    protected byte[] processaConteudo(byte[] bytes) throws IOException{
        //Compactar
            ByteArrayOutputStream byteout = new ByteArrayOutputStream();
            ZipOutputStream out = new ZipOutputStream(byteout);
            out.putNextEntry(new ZipEntry("internal"));
            out.write(bytes);
            out.closeEntry();
            out.close();
            return byteout.toByteArray();
    }
}
