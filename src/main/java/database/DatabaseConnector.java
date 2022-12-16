/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;

public class DatabaseConnector {

    private Connection conexao;

    public boolean conectar() {
        try {
            String url = "jdbc:sqlite:database.db";
            this.conexao = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

        System.out.println("Conectado!");
        return true;
    }

    ;
    
    public boolean desconectar() {
        try {
            if (this.conexao.isClosed() == false) {
                this.conexao.close();
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
        System.out.println("Desconectado!");
        return true;
    }

    ;
    
    public Statement criarConsulta() {
        try {
            return this.conexao.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }
    
    public PreparedStatement prepararConsulta(String sql){
        try {
            return this.conexao.prepareStatement(sql, 0);
        } catch (SQLException e){
            return null;
        }
    }

    public Connection getConexao() {
        return this.conexao;
    }

    public String[] readFile(final String fileName) {
        try {
            File file = new File(fileName);
            FileInputStream fileInput = new FileInputStream(file);
            InputStreamReader inputReader = new InputStreamReader(fileInput, "UTF-8");
            BufferedReader bufferReader = new BufferedReader(inputReader);
            String linha;
            StringBuilder stringBuffer = new StringBuilder();

            while ((linha = bufferReader.readLine()) != null) {
                if ((!linha.startsWith("--")) && (!linha.startsWith("/*")) && (!linha.trim().equals(""))) {
                   stringBuffer.append(linha); 
                }
            }
            
            bufferReader.close();
            
            String[] linhas = stringBuffer.toString().split(";");
            
            return linhas;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void exibirResultado(PreparedStatement consulta) {
        try {
            consulta.execute();
            String result = consulta.getResultSet().toString();
            System.out.println(result);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
