package model.tags.tag_texto;

import model.tags.elemento_padrao.Elemento;

public class H1 extends Elemento {
    private String resultado;

    public H1(String nome) {
        super(nome);
        this.geraResultado("");
    }


}
