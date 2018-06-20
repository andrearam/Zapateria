/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapateria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author
 */
public class Conexion {

    public Connection conexion;
    public Statement st;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/zapateria", "root", "1234");
            st = conexion.createStatement();
        } catch (ClassNotFoundException | SQLException e) {

        }
    }

}
