/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import composite.*;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Valdomiro
 */
public abstract class GeradorArquivo {
    
    private Processador processador;
    private List<Observador> observadores;
    
    public GeradorArquivo(Processador processador){
        
        this.processador=processador;
        this.observadores= new ArrayList<Observador>();
        
    }
    
    public final void gerarArquivo(String nome, Map<String,Object> propriedades) throws IOException{
        //byte[] bytes=null;
       /* if(tipo.equals("PROPRIEDADES_CRIPTOGRAFADO")){
            ProcessaPropriedadesCriptografado p = new ProcessaPropriedadesCriptografado();
            
            
            bytes= p.processaPropriedadesCriptografado(propriedades);
        }else if(tipo.equals("XML_COMPACTADO")){
            ProcessaXmlCompactado pp= new ProcessaXmlCompactado();
            
            bytes=pp.processaXMLCompactado(propriedades);
            
        }else{
            System.out.println("Desconheço essa opção");
            return;
        }*/
       String conteudo= gerarConteudo(propriedades);
       byte[] bytes = processador.processaConteudo(conteudo.getBytes());
       
        FileOutputStream fileout= new FileOutputStream(nome);
        fileout.write(bytes);
        fileout.close();
        
        notificar(nome,conteudo);
    }
    public void notificar(String nomeArquivo,String conteudo){
        for(Observador obs:observadores){
            obs.novoArquivoGerado(nomeArquivo, conteudo);
        }
    }
    public void addObservador(Observador obs){
        this.observadores.add(obs);
    }
    /*public String gerarConteudo(Map<String,Object> propriedades){
        return "";
    }*/
    
    protected abstract String gerarConteudo(Map<String,Object> propriedades);
    
    
    
    
   
   
    
    
    
}
