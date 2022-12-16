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

    private String titulo;
    private String desenvolvedor;
    private int horasTotais;
    private float custoFinal;

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public void inserirOrcamento(String titulo, String desenvolvedor, int horasTotais, float custoFinal) throws SQLException {
        boolean conectou = false;

        final String[] sql = database.readFile("InserirOrcamento.sql");
        String textoSql = "";
        conectou = database.conectar();

        for (String sql1 : sql) {
            textoSql = textoSql + "\n" + sql1;
        }

        PreparedStatement consulta = database.prepararConsulta(textoSql);

        try {
            consulta.setString(1, titulo);
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

}
