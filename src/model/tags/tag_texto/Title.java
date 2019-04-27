package model.tags.tag_texto;

import model.tags.elemento_padrao.TextoPadrao;

public class Title extends TextoPadrao {
    private String resultado;
    public Title(String nome) throws Exception {
        super(nome);
        this.geraResultado();
    }
    public String geraResultado(String conteudo) {
        this.setConteudo(conteudo);
        this.resultado = this.getAbreTag() + this.getConteudo() + this.getFechaTag();
        return this.resultado;
    }
}
