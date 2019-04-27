package control;

import model.fabrica.FabricaAbstrata;
import view.Menu;
import view.pagina.Pagina;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        /*Uma Pagina é instanciada no main, e em seu construtor, são instanciados os elemenntos que fazem
        * parte da pagina*/
        Pagina pagina = Pagina.getPagina();

        /*A FabricaAbstrata implementa o padrão Abstract Factory, onde temos a instancia de uma fábrica
        * que possui dentro de si outras fábricas
        */
        FabricaAbstrata fabricaAbstrata = new FabricaAbstrata();

        /*Teste inicial da implementacao, utilizando a pagina e a fabrica abstrata*/
        pagina.setConteudo(fabricaAbstrata.getEstruturaHtml());
        System.out.println(pagina.getConteudo() + "\n");

        pagina.setCabecalho(fabricaAbstrata.getConteudoH1("Cabecalho"));
        pagina.setCabecalho(fabricaAbstrata.getConteudoP("Paragrafo no cabecalho"));
        System.out.println(pagina.getCabecalho() + "\n");

        pagina.setCorpo(fabricaAbstrata.getConteudoH1("Corpo"));
        pagina.setCorpo(fabricaAbstrata.getConteudoP("Paragrafo do corpo"));
        System.out.println(pagina.getCorpo() + "\n");

        pagina.setRodape(fabricaAbstrata.getConteudoH1("Rodape"));
        pagina.setRodape(fabricaAbstrata.getConteudoP("Paragrafo do rodape"));
        System.out.println(pagina.getRodape() + "\n");

        if(FileController.salvarArquivo(pagina.getConteudo())){
            System.out.println("Arquivo salvo com sucesso!");
        }
        else{
            System.out.println("Erro ao salvar o arquivo!");
        }

    }
}
