package model.tags.tag_lista;

import model.tags.elemento_padrao.Elemento;
import model.tags.elemento_padrao.ListaPadrao;

public class ItemLista extends ListaPadrao {

    public ItemLista(String nome) throws Exception {
        super(nome);
        this.geraResultado();
    }


}
