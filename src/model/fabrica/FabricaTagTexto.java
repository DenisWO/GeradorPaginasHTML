package model.fabrica;

import model.tags.elemento_padrao.Elemento;
import model.tags.tag_texto.H1;
import model.tags.tag_texto.P;

public class FabricaTagTexto {
    /*Fábrica responsável pelas tags referentes a texto*/

    public Elemento getH1(Elemento elemento) throws Exception {
        H1 h1 = new H1("h1");
        h1.setConteudo(elemento);
        return h1;
    }
    public Elemento getP(Elemento elemento) throws Exception {
        P p = new P("p");
        p.setConteudo(elemento);
        return p;
    }

}
