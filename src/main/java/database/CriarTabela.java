/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {
     private final DatabaseConnector database;
     
     public CriarTabela(DatabaseConnector conector) {
        this.database = conector;
    }
     
    public void createTable() throws SQLException {
        boolean conectou = false;
        try {
            final String[] sql = database.readFile("TabelaOrcamento.sql");
            
            conectou = database.conectar();
            
       
            Statement consulta = database.criarConsulta();
            
            for (String sql1 : sql) {
                consulta.execute(sql1);  
            }
            
            System.out.println("Tabela criada!");
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if (conectou) {
                database.desconectar();
            }
        }
    } 
}
