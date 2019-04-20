package model.tags.tag_estrutura;

import model.tags.elemento_padrao.EstruturaPadrao;

public class Head extends EstruturaPadrao {
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
