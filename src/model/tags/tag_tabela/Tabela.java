package model.tags.tag_tabela;

import model.tags.elemento_padrao.Elemento;
import model.tags.elemento_padrao.TabelaPadrao;

import java.util.ArrayList;

public class Tabela extends TabelaPadrao {

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

    public String geraResultado(Elemento elemento) throws Exception {
        /*Verifica se o elemento enviado é um objeto de TabelaLinha*/
        if(elemento instanceof TabelaLinha){
            this.setConteudo(elemento.geraResultado());
            return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
        }

        throw new Exception("Impossível inserir elementos que não sejam parte da tabela!");
    }
}
