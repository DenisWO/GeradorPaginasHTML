package model.tags.tag_estrutura;

import model.tags.elemento_padrao.EstruturaPadrao;

public class Body extends EstruturaPadrao {

    public Body(String nome) {
        super(nome);
        this.geraResultado("");
    }

    @Override
    public void setConteudo(String conteudo) {
        super.setConteudo(this.getConteudo() + conteudo);
    }


}
