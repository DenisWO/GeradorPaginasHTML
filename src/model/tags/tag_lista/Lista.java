package model.tags.tag_lista;

import model.tags.elemento_padrao.Elemento;

import java.util.ArrayList;

public class Lista extends Elemento {
    ArrayList<ItemLista> itens;

    public Lista(String nome) {
        super(nome);
        this.itens = new ArrayList<>();
        this.geraResultado();
    }
    @Override
    public String geraResultado(){
        this.setConteudo();
        return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
    }
    public void setConteudo(){
        for(ItemLista li : itens){
            super.setConteudo(this.getConteudo() + li.getConteudo());
        }
    }
    public void adicionaItens(ItemLista item){
        this.itens.add(item);
    }

}
