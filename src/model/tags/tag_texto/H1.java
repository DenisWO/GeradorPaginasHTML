package model.tags.tag_texto;

import model.tags.elemento_padrao.TextoPadrao;

public class H1 extends TextoPadrao {
    private String resultado;

    public H1(String nome) {
        super(nome);
        this.geraResultado("");
    }


}
