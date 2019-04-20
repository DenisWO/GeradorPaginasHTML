package model.tags.tag_estrutura;

import model.tags.elemento_padrao.EstruturaPadrao;

public class HTML extends EstruturaPadrao {

    public HTML(String nome){
        super(nome);
        this.geraResultado("");
    }

    @Override
    public void setConteudo(String conteudo) {
        super.setConteudo(this.getConteudo() + conteudo);
    }
}
