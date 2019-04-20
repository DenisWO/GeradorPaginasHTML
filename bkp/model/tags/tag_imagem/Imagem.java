package model.tags.tag_imagem;

import model.tags.elemento_padrao.Elemento;

public class Imagem extends Elemento {
    private String resultado;
    private String parametros;

    public Imagem(String nome) {
        super(nome);
        this.geraResultado("");
        this.parametros = " src=";
    }

    @Override
    public String geraResultado(String conteudo) {
        this.setFechaTag("/>");
        this.setConteudo(this.parametros + conteudo);
        this.resultado = this.getAbreTag() + this.getConteudo() + this.getFechaTag();
        return this.resultado;
    }
}
