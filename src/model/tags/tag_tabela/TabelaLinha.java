package model.tags.tag_tabela;

import model.tags.elemento_padrao.Elemento;
import model.tags.elemento_padrao.TabelaPadrao;

import java.util.ArrayList;

public class TabelaLinha extends TabelaPadrao {
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
        return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
    }

    @Override
    public String geraResultado(Elemento elemento) throws Exception {
        if(elemento instanceof TabelaCabecalho || elemento instanceof TabelaDetalhe){
            this.setConteudo(elemento.geraResultado());
            return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
        }
        throw new Exception("Impossível inserir elementos que não façam parte da tabela!");
    }
}
