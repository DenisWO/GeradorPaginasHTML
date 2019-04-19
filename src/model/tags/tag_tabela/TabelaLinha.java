package model.tags.tag_tabela;

import model.tags.elemento_padrao.Elemento;

import java.util.ArrayList;

public class TabelaLinha extends Elemento {
    ArrayList<TabelaDetalhe> detalhes;
    ArrayList<TabelaCabecalho> cabecalhos;

    public TabelaLinha(String nome) {
        super(nome);
        this.detalhes = new ArrayList<>();
        this.cabecalhos = new ArrayList<>();
        this.geraResultado();
    }
    public void setConteudo(){
        for(TabelaCabecalho th : cabecalhos){
            super.setConteudo(this.getConteudo() + th.getConteudo());
        }
    }
    public void adicionaItens(TabelaCabecalho th){
        this.cabecalhos.add(th);
    }

    @Override
    public String geraResultado(){


        return null;
    }
}
