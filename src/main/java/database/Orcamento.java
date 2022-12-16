/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Orcamento {

    private final DatabaseConnector database;

    /**
     *
     * @param conector
     */
    public Orcamento(DatabaseConnector conector) {
        this.database = conector;
    }

    private String itensDeSistema;
    private String desenvolvedor;
    private int horasTotais;
    private float custoFinal;

    /**
     * @return the itensDeSistema
     */
    public String getItensDeSistema() {
        return itensDeSistema;
    }

    /**
     * @param itensDeSistema the itensDeSistema to set
     */
    public void setItensDeSistema(String itensDeSistema) {
        this.itensDeSistema = itensDeSistema;
    }

    /**
     * @return the desenvolvedor
     */
    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    /**
     * @param desenvolvedor the desenvolvedor to set
     */
    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    /**
     * @return the horasTotais
     */
    public int getHorasTotais() {
        return horasTotais;
    }

    /**
     * @param horasTotais the horasTotais to set
     */
    public void setHorasTotais(int horasTotais) {
        this.horasTotais = horasTotais;
    }

    /**
     * @return the custoFinal
     */
    public float getCustoFinal() {
        return custoFinal;
    }

    /**
     * @param custoFinal the custoFinal to set
     */
    public void setCustoFinal(float custoFinal) {
        this.custoFinal = custoFinal;
    }

    public void calcularCustoFinal(float horasTrabalhadasMes) {
        float valorTotalDesenvolvedor = horasTrabalhadasMes * horasTotais;
        setCustoFinal((float) (valorTotalDesenvolvedor + (valorTotalDesenvolvedor * 0.3)) );
    }

    public void inserirOrcamento(String itensDeSistema, String desenvolvedor, int horasTotais, float custoFinal) throws SQLException {
        boolean conectou = false;

        final String[] sql = database.readFile("InserirOrcamento.sql");
        String textoSql = "";
        conectou = database.conectar();

        for (String sql1 : sql) {
            textoSql = textoSql + "\n" + sql1;
        }

        PreparedStatement consulta = database.prepararConsulta(textoSql);

        try {
            consulta.setString(1, itensDeSistema);
            consulta.setString(2, desenvolvedor);
            consulta.setInt(3, horasTotais);
            consulta.setFloat(4, custoFinal);

            int response = consulta.executeUpdate();

            if (response == 1) {
                System.out.println("Orçamento registrado!");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (consulta != null) {
                try {
                    consulta.close();
                } catch (SQLException ex){
                    System.err.println(ex.getMessage());
                }
            }
            if (conectou) {
                database.desconectar();
            }
        }
    }

    public void listarOrcamentos() throws SQLException {
        boolean conectou = false;

        final String[] sql = database.readFile("ConsultarOrcamentos.sql");
        String textoSql = "";
        conectou = database.conectar();

        for (String sql1 : sql) {
            textoSql = textoSql + "\n" + sql1;
        }

        PreparedStatement consulta = database.prepararConsulta(textoSql);

        try {
            consulta.execute();
            database.exibirResultado(consulta);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (consulta != null) {
                try {
                    consulta.close();
                } catch (SQLException ex){
                    System.err.println(ex.getMessage());
                }
            }
            if (conectou) {
                database.desconectar();
            }
        }
    }

}
