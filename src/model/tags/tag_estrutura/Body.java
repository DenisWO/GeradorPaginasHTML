package model.tags.tag_estrutura;

import model.tags.elemento_padrao.Elemento;

public class Body extends Elemento {

    public Body(String nome) {
        super(nome);
        this.geraResultado("");
    }

    @Override
    public void setConteudo(String conteudo) {
        super.setConteudo(this.getConteudo() + conteudo);
    }

}
