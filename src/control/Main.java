package control;

import model.fabrica.FabricaAbstrata;
import model.tags.tag_texto.H1;
import model.tags.tag_texto.TextoSimples;
import view.Menu;
import view.pagina.Pagina;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        Pagina pagina = Pagina.getPagina();

        FabricaAbstrata fabricaAbstrata = new FabricaAbstrata();

        /*Teste inicial da implementacao, utilizando a pagina e a fabrica abstrata*/
        pagina.setConteudo(fabricaAbstrata.getEstruturaHtml());

        pagina.setCabecalho(fabricaAbstrata.getConteudoH1(new TextoSimples("Cabecalho")));
        pagina.setCabecalho(fabricaAbstrata.getConteudoP(new TextoSimples("Paragrafo no cabecalho")));

        pagina.setCorpo(fabricaAbstrata.getConteudoH1(new TextoSimples("Corpo")));
        pagina.setCorpo(fabricaAbstrata.getConteudoP(new TextoSimples("Paragrafo do corpo")));

        pagina.setRodape(fabricaAbstrata.getConteudoH1(new TextoSimples("Rodape")));
        pagina.setRodape(fabricaAbstrata.getConteudoP(new TextoSimples("Paragrafo do rodape")));

        if(FileController.salvarArquivo(pagina.getConteudo())){
            System.out.println("Arquivo salvo com sucesso!");
        }
        else{
            System.out.println("Erro ao salvar o arquivo!");
        }

    }
}
