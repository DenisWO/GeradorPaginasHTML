package model.tags.tag_estrutura;

import model.tags.elemento_padrao.Elemento;

public class HTML extends Elemento {

    public HTML(String nome){
        super(nome);
        this.geraResultado("");
    }

    @Override
    public void setConteudo(String conteudo) {
        super.setConteudo(this.getConteudo() + conteudo);
    }
}
