package model.tags.tag_tabela;

import model.tags.elemento_padrao.Elemento;

import java.util.ArrayList;

public class Tabela extends Elemento {

    ArrayList<TabelaLinha> linhas;

    public Tabela(String nome) {
        super(nome);
        this.linhas = new ArrayList<>();
    }

    public void setConteudo(){
        for(TabelaLinha tr: linhas){
            setConteudo(this.getConteudo() + tr.getConteudo());
        }
    }

    public void adicionaTabelaLinha(TabelaLinha tr) {
        this.linhas.add(tr);
    }
}
