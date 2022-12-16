/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.orcamento.calculadora;

import database.DatabaseConnector;
import database.CriarTabela;
import database.Orcamento;
import java.sql.SQLException;

public class CalculadoraOrcamento {

    

    public static void main(String[] args) throws SQLException {
        DatabaseConnector database = new DatabaseConnector();
        CriarTabela criarTabela = new CriarTabela(database);
        
        criarTabela.createTable();
        
        Orcamento orcamento =  new Orcamento(database);
        
        orcamento.setTitulo("");
        orcamento.setDesenvolvedor("");
        orcamento.setHorasTotais(1);
        orcamento.setCustoFinal((float) 1.2);
        
        orcamento.inserirOrcamento(
                orcamento.getTitulo(),
                orcamento.getDesenvolvedor(),
                orcamento.getHorasTotais(),
                orcamento.getCustoFinal()
        );
        
    }

}
