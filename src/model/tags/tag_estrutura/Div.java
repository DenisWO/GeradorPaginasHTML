package model.tags.tag_estrutura;

import model.tags.elemento_padrao.EstruturaPadrao;

public class Div extends EstruturaPadrao {
    private String resultado;

    public Div(String nome) {
        super(nome);
        this.geraResultado();
    }
}
