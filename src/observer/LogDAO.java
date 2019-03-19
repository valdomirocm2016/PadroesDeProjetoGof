/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Valdomiro
 */
public class LogDAO {
    
    public void salvar(Log log) throws Exception{
        Connection conex= DriverManager.getConnection("jdbc:mysql://localhost/db_base","root","");
        Class.forName("com.mysql.jdbc.Driver");
        PreparedStatement ps= conex.prepareStatement("insert into tb_teste(tipo,titulo,valor) values(?,?,?)");
        ps.setString(1, log.getTipo());
        ps.setString(2, log.getTitulo());
        ps.setString(3, log.getValor());
        ps.execute();
    }
}
