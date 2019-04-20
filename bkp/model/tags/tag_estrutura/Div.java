package model.tags.tag_estrutura;

import model.tags.elemento_padrao.Elemento;

public class Div extends Elemento {
    private String resultado;

    public Div(String nome) {
        super(nome);
        this.geraResultado("");
    }
    public void setConteudo(String conteudo){
        super.setConteudo(conteudo);
    }
}
