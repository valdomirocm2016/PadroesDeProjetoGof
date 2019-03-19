/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        
        List<Processador> processador= new ArrayList<Processador>();
        processador.add(new ProcessaCriptografado());
        processador.add(new ProcessaCompactado());
        
        List<Processador> processador2= new ArrayList<Processador>();
        processador2.add(new ProcessaCompactado());
        processador2.add(new ProcessaCriptografado());
        
        List<Processador> processador3= new ArrayList<Processador>();
        processador3.add(new ProcessaDefault());
        processador3.add(new ProcessaCompactado());
        
        
        
        
        GeradorArquivo gerador= new GeradorArquivoPropriedades(new ProcessadorComposite(processador));
        gerador.gerarArquivo("..\\PadroesProjeto\\src\\arquivosGerados\\prop1.zip", mapa);
        
        GeradorArquivo gerador2 = new GeradorArquivoXml(new ProcessadorComposite(processador2));
        gerador.gerarArquivo("..\\PadroesProjeto\\src\\arquivosGerados\\Xml1.txt", mapa);
        
        GeradorArquivo ger= new GeradorArquivoPropriedades(new ProcessadorComposite(processador3));
        ger.gerarArquivo("..\\PadroesProjeto\\src\\arquivosGerados\\default.zip", mapa);
        
    }
    
}
