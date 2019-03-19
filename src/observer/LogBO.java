/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valdomiro
 */
public class LogBO implements Observador{

    @Override
    public void novoArquivoGerado(String n, String c) {
        LogDAO logDao= new LogDAO();
        Log log = new Log("Arquvivo",n,c);
        try {
            logDao.salvar(log);
        } catch (Exception ex) {
            Logger.getLogger(LogBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
}
