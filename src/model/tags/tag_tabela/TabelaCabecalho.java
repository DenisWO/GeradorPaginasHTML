package model.tags.tag_tabela;

import model.tags.elemento_padrao.Elemento;
import model.tags.elemento_padrao.TabelaPadrao;

public class TabelaCabecalho extends TabelaPadrao {

    public TabelaCabecalho(String nome) {
        super(nome);
        this.geraResultado();
    }
}
