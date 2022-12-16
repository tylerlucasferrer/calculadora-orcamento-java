/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.orcamento.calculadora;

import database.DatabaseConnector;
import database.CriarTabela;
import database.Orcamento;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class CalculadoraOrcamento {

    public static int MenuData() {
        int selection;
        Scanner sc = new Scanner(System.in);
        selection = sc.nextInt();
        return selection;
    }

    public static void main(String[] args) throws SQLException {

        System.out.println("Escolha uma Opcao:");
        
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "1" + "   | " + "Telas com entradas e saidas de dados" + " |     " + "1" + "      |         " + "8" + "          |");
        
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "2" + "   | " + "Telas com entradas e saidas de dados" + " |     " + "2" + "      |         " + "12" + "          |");
        System.out.println("------------------------------------------------------------------------------------------------------");

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "3" + "   | " + "Telas com entradas e saidas de dados" + " |     " + "3" + "      |         " + "16" + "          |");

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "4" + "   | " + "Telas com consultas de informacoes de dados" + " |     " + "1" + "      |         " + "4" + "          |");

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "5" + "   | " + "Telas com consultas de informacoes de dados" + " |     " + "2" + "      |         " + "6" + "          |");

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "6" + "   | " + "Telas com consultas de informacoes de dados" + " |     " + "3" + "      |         " + "8" + "          |");

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "7" + "   | " + "Gravacao de dados" + " |     " + "1" + "      |         " + "16" + "          |");
    
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "8" + "   | " + "Gravacao de dados" + " |     " + "2" + "      |         " + "24" + "          |");
  
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "9" + "   | " + " Gravacao de dados" + " |     " + "3" + "      |         " + "36" + "          |");

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "10" + "   | " + " Algoritmos com processamentos" + " |     " + "1" + "      |         " + "16" + "          |");

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "11" + "   | " + " Algoritmos com processamentos" + " |     " + "2" + "      |         " + "24" + "          |");

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "12" + "   | " + "Algoritmos com processamentos" + " |     " + "3" + "      |         " + "36" + "          |");
        System.out.println("------------------------------------------------------------------------------------------------------"); 
        
        int opcao = 0;
        boolean continuar = true;
        do{
            opcao = MenuData();
            switch(opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
            }
            System.out.println("Deseja continuar? (s/n)");
            String opcaoContinuar = sc.next();
            if(opcaoContinuar.equals("n")){
                continuar = false;
            }
       } while(continuar);

        DatabaseConnector database = new DatabaseConnector();
        CriarTabela criarTabela = new CriarTabela(database);

        criarTabela.createTable();

        Desenvolvedor desenvolvedor = new Desenvolvedor();

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, insira os dados do orçamento:");
        System.out.println("Nome do desenvolvedor:");
        desenvolvedor.setNome(sc.next());
        System.out.println("Disponibilidade diaria do desenvolvedor em horas:");
        desenvolvedor.setHorasDisponiveisDia(sc.nextInt());
        System.out.println("Valor mensal desejado pelo desenvolvedor:");
        desenvolvedor.setValorMensalDesejado(sc.nextFloat());

        Orcamento orcamento = new Orcamento(database);

        /*orcamento.setTitulo(titulo);
        orcamento.setDesenvolvedor("");
        orcamento.setHorasTotais(1);
        orcamento.setCustoFinal((float) 1.2);
        
        for (boolean endLoop = false; !endLoop;) {

        }
        */

        orcamento.inserirOrcamento(
                orcamento.getTitulo(),
                orcamento.getDesenvolvedor(),
                orcamento.getHorasTotais(),
                orcamento.getCustoFinal());

    }

}
