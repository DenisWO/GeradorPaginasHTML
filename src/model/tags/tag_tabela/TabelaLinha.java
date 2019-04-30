package model.tags.tag_tabela;

import model.tags.elemento_padrao.TabelaPadrao;

import java.util.ArrayList;

public class TabelaLinha extends TabelaPadrao {
    private ArrayList<TabelaDetalhe> detalhes;
    private ArrayList<TabelaCabecalho> cabecalhos;

    public TabelaLinha(String nome) {
        super(nome);
        this.detalhes = new ArrayList<>();
        this.cabecalhos = new ArrayList<>();
    }
    public void setConteudo(TabelaDetalhe td){
        super.setConteudo(td);
    }
    public void setConteudo(TabelaCabecalho th){
        super.setConteudo(th);
    }
    public void adicionaItensCabecalho(ArrayList<TabelaCabecalho> tabelaCabecalhos){
        for(TabelaCabecalho th : tabelaCabecalhos){
            this.setConteudo(th);
        }
    }

    public void adicionaItensDetalhe(ArrayList<TabelaDetalhe> tabelaDetalhes){
        for(TabelaDetalhe td : tabelaDetalhes){
            this.setConteudo(td);
        }
    }
}
