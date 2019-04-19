package model.tags.tag_texto;

import model.tags.elemento_padrao.Elemento;

public class P extends Elemento {
    private String resultado;
    public P(String nome) {
        super(nome);
        this.geraResultado("");
    }

    @Override
    public String geraResultado(String conteudo) {
        this.setConteudo(conteudo);
        this.resultado = this.getAbreTag() + this.getConteudo() + this.getFechaTag();
        return this.resultado;
    }
}
