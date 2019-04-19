package model.tags.tag_estrutura;

import model.tags.elemento_padrao.Elemento;

public class Head extends Elemento {
    private String resultado;

    public Head(String nome) {
        super(nome);
        this.geraResultado("");
    }
    public String getResultado(String conteudo) {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
