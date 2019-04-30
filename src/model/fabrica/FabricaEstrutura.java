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

    public HTML getEstruturaHtml(){
        this.html = new HTML("html");

        return html;
    }

    public Elemento getEstruturaDiv(Elemento elemento){
        Div div = new Div("div");
        div.setConteudo(elemento);

        return div;
    }



}
