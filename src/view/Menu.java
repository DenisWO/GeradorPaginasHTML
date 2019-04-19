package view;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private String campo;

    public void menu(){
        int opcao = 1;
        while(opcao != 0){
            System.out.println("Selecione onde deseja inserir um elemento: \n1 - Cabecalho\n2 - Menu Lateral\n3 - Corpo\n4 - Rodape\n0 - Sair");
            opcao = scanner.nextInt();

            if(opcao == 1){
                campo = "cabecalho";
                this.menuEscolheElemento();
            }
            else if(opcao == 2){
                campo = "menu lateral";
                this.menuEscolheElemento();
            }
            else if(opcao == 3){
                campo = "corpo";
                this.menuEscolheElemento();
            }
            else if(opcao == 4){
                campo = "rodape";
                this.menuEscolheElemento();
            }

        }
    }
    public void menuEscolheElemento(){
        int opcao = 1;
        while(opcao != 0){
            System.out.println("O que deseja colocar no " + campo + "?");
            System.out.println("\n1 - Texto\n2 - Imagem\n3 - Lista\n4 - Tabela\n0 - Sair");
            opcao = scanner.nextInt();

            if(opcao == 1){
                campo = "texto";
                this.menuTagTexto();
            }
            else if(opcao == 2){
                campo = "imagem";
                this.menuTagImagem();
            }
            else if(opcao == 3){
                campo = "lista";
                this.menuTagLista();
            }
            else if(opcao == 4){
                campo = "tabela";
                this.menuTagTabela();
            }
        }
    }
    public void menuTagTexto(){
        int opcao = 1;
        while(opcao != 0){
            System.out.println("Qual elemento de texto deseja adicionar?");
            System.out.println("\n1 - Paragrafo\n2 - Titulo\n0 - Sair");
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("Voce escolheu o paragrafo!");
            }
            else if(opcao == 2){
                System.out.println("Voce escolheu o titulo");
            }
        }
    }
    public void menuTagImagem(){
        int opcao = 1;
        while(opcao != 0){
            System.out.println("Qual imagem deseja adicionar?");
            System.out.println("\n1 - Imagem 1\n2 - Imagem 2");
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("Voce escolheu a imagem 1");
            }
            else if(opcao == 2){
                System.out.println("Voce escolheu a imagem 2");
            }
        }
    }
    public void menuTagLista(){
        int opcao = 1;
        while(opcao != 0){
            System.out.println("Qual lista deseja adicionar?");
            System.out.println("\n1- Lista 1\n2 - Lista 2");
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("Voce escolheu a lista 1");
            }
            else if(opcao == 2){
                System.out.println("Voce escolheu a lista 2");
            }
        }
    }
    public void menuTagTabela(){
        int opcao = 1;
        while(opcao != 0){
            System.out.println("Qual tabela deseja adicionar?");
            System.out.println("\n1- Tabela 1\n2 - Tabela 2");
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("Voce escolheu a tabela 1");
            }
            else if(opcao == 2){
                System.out.println("Voce escolheu a tabela 2");
            }
        }
    }

}
