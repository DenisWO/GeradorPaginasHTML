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

    public String getH1(Object object){
        return this.h1.geraResultado(object);
    }
    public String getP(Object object){
        return this.p.geraResultado(object);
    }

}
