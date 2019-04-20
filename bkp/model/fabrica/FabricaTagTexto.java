package model.fabrica;

import model.tags.tag_texto.H1;
import model.tags.tag_texto.P;

public class FabricaTagTexto {
    /*Fábrica responsável pelas tags referentes a texto*/

    private static H1 h1;
    private static P p;

    public FabricaTagTexto(){
        this.h1 = new H1("h1");
        this.p = new P("p");
    }

    public static String getH1(String conteudo){
        return h1.geraResultado(conteudo);
    }

    public static String getP(String conteudo){
        return p.geraResultado(conteudo);
    }
}
