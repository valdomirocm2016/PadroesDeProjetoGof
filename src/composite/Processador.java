/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.io.IOException;

/**
 *
 * @author Valdomiro
 */
public interface Processador {
    public byte[] processaConteudo(byte[] bytes) throws IOException;
}
