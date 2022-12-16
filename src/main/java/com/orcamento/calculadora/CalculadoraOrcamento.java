/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.orcamento.calculadora;

import database.DatabaseConnector;
import database.CriarTabela;
import database.Orcamento;
import java.sql.SQLException;
import java.util.Scanner;

public class CalculadoraOrcamento {

    public static int MenuData() {
        int selection;
        Scanner sc = new Scanner(System.in);
        selection = sc.nextInt();
        return selection;
    }

    public Object[] getArray(int size) {
        Object[] genericArray = new Object[size];
        return genericArray;
    }

    public static void main(String[] args) throws SQLException {
        DatabaseConnector database = new DatabaseConnector();
        CriarTabela criarTabela = new CriarTabela(database);

        criarTabela.createTable();
        Desenvolvedor desenvolvedor = new Desenvolvedor();

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, insira os dados do orçamento:");
        System.out.println("Nome do desenvolvedor:");
        desenvolvedor.setNome(sc.nextLine());
        System.out.println("Disponibilidade diaria do desenvolvedor em horas:");
        desenvolvedor.setHorasDisponiveisDia(sc.nextInt());
        System.out.println("Valor mensal desejado pelo desenvolvedor:");
        desenvolvedor.setValorMensalDesejado(sc.nextFloat());

        System.out.println("Escolha os itens de sistema que deseja incluir no orçamento:");
        
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "1" + "   | " + "Telas com entradas e saidas de dados                   " + " |     " + "1" + "        |         " + "8" + "          |");
        ItemDeSistema item1 = new ItemDeSistema(1, "Telas com entradas e saidas de dados", 1, 8);
        
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "2" + "   | " + "Telas com entradas e saidas de dados                   " + " |     " + "2" + "        |         " + "12" + "          |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        ItemDeSistema item2 = new ItemDeSistema(2, "Telas com entradas e saidas de dados", 2, 12);

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "3" + "   | " + "Telas com entradas e saidas de dados                   " + " |     " + "3" + "        |         " + "16" + "          |");
        ItemDeSistema item3 = new ItemDeSistema(3, "Telas com entradas e saidas de dados", 3, 16);

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "4" + "   | " + "Telas com consultas de informacoes de dados             " + " |     " + "1" + "      |         " + "4" + "          |");
        ItemDeSistema item4 = new ItemDeSistema(4, "Telas com consultas de informacoes de dados", 1, 4);

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "5" + "   | " + "Telas com consultas de informacoes de dados             " + " |     " + "2" + "      |         " + "6" + "          |");
        ItemDeSistema item5 = new ItemDeSistema(5, "Telas com consultas de informacoes de dados", 2, 6);

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "6" + "   | " + "Telas com consultas de informacoes de dados             " + " |     " + "3" + "      |         " + "8" + "          |");
        ItemDeSistema item6 = new ItemDeSistema(6, "Telas com consultas de informacoes de dados", 3, 8);

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "7" + "   | " + "Gravacao de dados                                       " + " |     " + "1" + "      |         " + "16" + "          |");
        ItemDeSistema item7 = new ItemDeSistema(7, "Gravacao de dados", 1, 16);
    
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "8" + "   | " + "Gravacao de dados                                       " + " |     " + "2" + "      |         " + "24" + "          |");
        ItemDeSistema item8 = new ItemDeSistema(8, "Gravacao de dados", 2, 24);
  
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "9" + "   | " + " Gravacao de dados                                      " + " |     " + "3" + "      |         " + "36" + "          |");
        ItemDeSistema item9 = new ItemDeSistema(9, "Gravacao de dados", 3, 36);

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "10" + "   | " + " Algoritmos com processamentos                        " + " |     " + "1" + "      |         " + "16" + "          |");
        ItemDeSistema item10 = new ItemDeSistema(10, "Algoritmos com processamentos", 1, 16);

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "11" + "   | " + " Algoritmos com processamentos                        " + " |     " + "2" + "      |         " + "24" + "          |");
        ItemDeSistema item11 = new ItemDeSistema(11, "Algoritmos com processamentos", 2, 24);

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("| Opcao | Tipo de Item de sistema                                 | Dificuldade | Quantidade de horas |");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("|   " + "12" + "   | " + "Algoritmos com processamentos                         " + " |     " + "3" + "      |         " + "36" + "          |");
        System.out.println("------------------------------------------------------------------------------------------------------"); 
        ItemDeSistema item12 = new ItemDeSistema(12, "Algoritmos com processamentos", 3, 36);
        
        String itensDeSistema = "";
        int horasTotais = 0;

        int quantEscolhas = 0;
        int opcao = 0;
        boolean continuar = true;
        do{
            if(quantEscolhas == 0) {
                quantEscolhas = 1;
                System.out.print("Item: ");
            } else if (quantEscolhas > 0) {
                System.out.print("Escolha outro item: ");
            }
            opcao = MenuData();
            switch(opcao){
                case 1:
                    itensDeSistema += item1.getTipo() + " - " + item1.getTempoEmpregado() + " horas; \n";
                    horasTotais += item1.getTempoEmpregado();
                    break;
                case 2:
                    itensDeSistema += item2.getTipo() + " - " + item2.getTempoEmpregado() + " horas; \n";
                    horasTotais += item2.getTempoEmpregado();
                    break;
                case 3:
                    itensDeSistema += item3.getTipo() + " - " + item3.getTempoEmpregado() + " horas; \n";
                    horasTotais += item3.getTempoEmpregado();
                    break;
                case 4:
                    itensDeSistema += item4.getTipo() + " - " + item4.getTempoEmpregado() + " horas; \n";
                    horasTotais += item4.getTempoEmpregado();
                    break;
                case 5:
                    itensDeSistema += item5.getTipo() + " - " + item5.getTempoEmpregado() + " horas; \n";
                    horasTotais += item5.getTempoEmpregado();
                    break;
                case 6:
                    itensDeSistema += item6.getTipo() + " - " + item6.getTempoEmpregado() + " horas; \n";
                    horasTotais += item6.getTempoEmpregado();
                    break;
                case 7:
                    itensDeSistema += item7.getTipo() + " - " + item7.getTempoEmpregado() + " horas; \n";
                    horasTotais += item7.getTempoEmpregado();
                    break;
                case 8:
                    itensDeSistema += item8.getTipo() + " - " + item8.getTempoEmpregado() + " horas; \n";
                    horasTotais += item8.getTempoEmpregado();
                    break;
                case 9:
                    itensDeSistema += item9.getTipo() + " - " + item9.getTempoEmpregado() + " horas; \n";
                    horasTotais += item9.getTempoEmpregado();
                    break;
                case 10:
                    itensDeSistema += item10.getTipo() + " - " + item10.getTempoEmpregado() + " horas; \n";
                    horasTotais += item10.getTempoEmpregado();
                    break;
                case 11:
                    itensDeSistema += item11.getTipo() + " - " + item11.getTempoEmpregado() + " horas; \n";
                    horasTotais += item11.getTempoEmpregado();
                    break;
                case 12:
                    itensDeSistema += item12.getTipo() + " - " + item12.getTempoEmpregado() + " horas; \n";
                    horasTotais += item12.getTempoEmpregado();
                    break;
            }
            
            System.out.println("Deseja continuar? (s/n)");
            String opcaoContinuar = sc.next();
            if(opcaoContinuar.equals("n")){
                continuar = false;
            }
       } while(continuar);

        Orcamento orcamento = new Orcamento(database);

        orcamento.setItensDeSistema(itensDeSistema);
        orcamento.setDesenvolvedor(desenvolvedor.getNome());
        orcamento.setHorasTotais(horasTotais);
        orcamento.calcularCustoFinal(desenvolvedor.horasTrabalhadasMes());
        

        orcamento.inserirOrcamento(
                orcamento.getItensDeSistema(),
                orcamento.getDesenvolvedor(),
                orcamento.getHorasTotais(),
                orcamento.getCustoFinal());
                
        orcamento.listarOrcamentos();
    }

}
