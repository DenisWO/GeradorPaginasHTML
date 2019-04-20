package control;

import model.fabrica.FabricaAbstrata;
import view.Menu;
import view.pagina.Pagina;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*Uma Pagina é instanciada no main, e em seu construtor, são instanciados os elemenntos que fazem
        * parte da pagina*/
        Pagina pagina = Pagina.getPagina();

        /*A FabricaAbstrata implementa o padrão Abstract Factory, onde temos a instancia de uma fábrica
        * que possui dentro de si outras fábricas
        *
        * Essa fábrica é responsável por gereniar os elementos HTML e de fazer as devidas junções dos
        * elementos para melhor funcionamento
        *
        * Ex: Adicionar uma Div quando o usuário solicitar um parágrafo*/
        FabricaAbstrata fabricaAbstrata = new FabricaAbstrata();

        /*Teste inicial da implementacao, utilizando a pagina e a fabrica abstrata*/
        pagina.setConteudo(fabricaAbstrata.getEstruturaHtml());
        pagina.setCabecalho(fabricaAbstrata.getConteudoH1("Cabecalho"));
        pagina.setCorpo(fabricaAbstrata.getConteudoP("Paragrafo do corpo"));
        pagina.setRodape(fabricaAbstrata.getConteudoP("Rodape"));

        if(salvarArquivo(pagina.getConteudo())){
            System.out.println("Arquivo salvo com sucesso!");
        }
        else{
            System.out.println("Erro ao salvar o arquivo!");
        }

    }
    public static boolean salvarArquivo(String texto){
        /*Salvando o arquivo no final da iteração com o usuário*/
        File file = new File("./files/saida.html");
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(texto);
            fileWriter.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}
