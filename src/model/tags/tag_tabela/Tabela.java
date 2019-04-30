package model.tags.tag_tabela;

import model.tags.elemento_padrao.TabelaPadrao;

import java.util.ArrayList;

public class Tabela extends TabelaPadrao {

    private ArrayList<TabelaLinha> linhas;

    public Tabela(String nome) {
        super(nome);
        this.linhas = new ArrayList<>();
    }

    public void setConteudo(TabelaLinha tabelaLinha){
        super.setConteudo(tabelaLinha);
    }


    public void adicionaTabelaLinha(ArrayList<TabelaLinha> tabelaLinhas) {
        for(TabelaLinha tr : tabelaLinhas){
            this.setConteudo(tr);
        }
    }


}
