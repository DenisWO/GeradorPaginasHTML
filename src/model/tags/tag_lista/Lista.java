package model.tags.tag_lista;

import model.tags.elemento_padrao.Elemento;
import model.tags.elemento_padrao.ListaPadrao;

import java.util.ArrayList;

public class Lista extends ListaPadrao {
    private ArrayList<ItemLista> itens;

    public Lista(String nome) {
        super(nome);
        this.itens = new ArrayList<>();
    }
    public void adicionaItens(ItemLista item){
        this.itens.add(item);
    }

    @Override
    public String geraResultadoTexto() {
        String resultado = "";
        for(ItemLista i : this.itens){
            resultado += i.geraResultadoTexto();
        }
        return resultado;
    }

    public void setConteudo(ItemLista itemLista) {
        for(ItemLista li : itens){
            super.setConteudo(li);
        }
    }
}
