/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.orcamento.calculadora;

/**
 *
 * @author r.prado.dos.santos
 */
public class Desenvolvedor {
    private String nome;
    private int horasDisponiveisDia;
    private float valorMensalDesejado;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the horasDisponiveisDia
     */
    public int getHorasDisponiveisDia() {
        return horasDisponiveisDia;
    }

    /**
     * @param horasDisponiveisDia the horasDisponiveisDia to set
     */
    public void setHorasDisponiveisDia(int horasDisponiveisDia) {
        this.horasDisponiveisDia = horasDisponiveisDia;
    }

    /**
     * @return the valorMensalDesejado
     */
    public float getValorMensalDesejado() {
        return valorMensalDesejado;
    }

    /**
     * @param valorMensalDesejado the valorMensalDesejado to set
     */
    public void setValorMensalDesejado(float valorMensalDesejado) {
        this.valorMensalDesejado = valorMensalDesejado;
    }
    
    public float horasTrabalhadasMes(){
        float valorHora = this.valorMensalDesejado / (20 * horasDisponiveisDia);
        
        return valorHora;
    }
}
