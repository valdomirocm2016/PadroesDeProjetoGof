/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Valdomiro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Map<String,Object> mapa= new HashMap();
        mapa.put("Nome", "Valdomiro");
        mapa.put("Idade", "x");
        GeradorArquivo gerador= new GeradorPropriedadesCriptografado();
        gerador.gerarArquivo("..\\PadroesProjeto\\src\\arquivosGerados\\Criptografado.txt", mapa);
        
        GeradorArquivo gerador2 = new GeradorXmlCompactado();
        gerador.gerarArquivo("..\\PadroesProjeto\\src\\arquivosGerados\\Xml.zip", mapa);
        
        /*GeradorArquivo ger= new GeradorArquivo();
        ger.gerarArquivo("c:\\Gerador\\Xml.zip", mapa);*/
        
    }
    
}
