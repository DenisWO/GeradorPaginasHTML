package model.fabrica;

import model.tags.elemento_padrao.Elemento;
import model.tags.tag_estrutura.Body;
import model.tags.tag_estrutura.Div;
import model.tags.tag_estrutura.HTML;
import model.tags.tag_estrutura.Head;

public class FabricaEstrutura {
    /*Fabrica responsável pela estrutura geral da pagina,
    * adicionando as tags de html, body, head e divs, conforme a iteração com o
    * usuário ocorre*/

    private HTML html;
    private Body body;
    private Head head;

    public String getEstruturaHtml(){
        this.html = new HTML("html");
        this.body = new Body("body");
        this.head = new Head("head");
        html.setConteudo(head.geraResultado());
        html.setConteudo(body.geraResultado());

        return html.geraResultado("") + "\n";
    }

    public String getEstruturaDiv(Object object){
        Div div = new Div("div");

        return div.geraResultado(object);
    }

}
