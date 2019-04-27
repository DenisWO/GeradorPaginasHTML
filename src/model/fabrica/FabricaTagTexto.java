package model.fabrica;

import model.tags.elemento_padrao.Elemento;
import model.tags.tag_texto.H1;
import model.tags.tag_texto.P;

public class FabricaTagTexto {
    /*Fábrica responsável pelas tags referentes a texto*/

    private H1 h1;
    private P p;

    public FabricaTagTexto() throws Exception {
        this.h1 = new H1("h1");
        this.p = new P("p");
    }

    public String getH1(String conteudo){
        return h1.geraResultado(conteudo);
    }
    public String getH1(Elemento elemento) throws Exception {
        return h1.geraResultado(elemento);
    }

    public String getP(String conteudo){
        return p.geraResultado(conteudo);
    }
    public String getP(Elemento elemento) throws Exception {
        return p.geraResultado(elemento);
    }
}
