/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainsOfResponsability;

import composite.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Valdomiro
 */
public class ProcessaCompactado extends Processador {
    
    public ProcessaCompactado(Processador processador){
        super(processador);
    }
    public ProcessaCompactado(){
        
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
