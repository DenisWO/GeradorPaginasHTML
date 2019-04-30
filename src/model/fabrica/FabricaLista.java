package model.fabrica;

import model.tags.elemento_padrao.Elemento;
import model.tags.tag_lista.ItemLista;
import model.tags.tag_lista.Lista;

import java.util.ArrayList;

public class FabricaLista {
    /*Fábrica responsável pelos elementos de lista, gerenciando os itens incluídos nela*/
    private Lista lista;

    public FabricaLista() throws Exception {
        this.lista = new Lista("ul");
    }

    public Elemento getLista(Elemento elemento){
        return this.lista;
    }
    public void setLista(ItemLista it){
        lista.adicionaItens(it);
    }
}
