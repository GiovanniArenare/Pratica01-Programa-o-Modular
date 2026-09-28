/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oficina;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1649081
 */
public class Oficina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        ArrayList<Mecanico> mecanicos = new ArrayList<>();
        ArrayList<Box> boxes = new ArrayList<>();
        ArrayList<OrdemServico> ordens = new ArrayList<>();
        
        int opcao;
        do{
            System.out.println("1 - Cadastrar Ordem de Servico");
            System.out.println("2 - Associar mecanico a um box");
            System.out.println("3 - tribuir ordem de servico a um box");
            System.out.println("4 - Exibir ordens de um box");
            System.out.println("5 - tatal de ordens finalizadas por box");
            System.out.println("6 - Buscar ordens por status");
            System.out.println("7 - Exibir detalhes de uma Ordem");
            System.out.println("8 - Finalizar Ordem");
            System.out.println("0 - Sair");
            opcao = imput.nextInt();
            switch (opcao) {
                case 1:
                    
                default:
                    System.out.println("Opcao Invalida");
            }
            
        }while (opcao!= 0);
    }
    
}
