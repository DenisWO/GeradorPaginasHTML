package model.fabrica;

import model.tags.tag_lista.ItemLista;
import model.tags.tag_lista.Lista;

public class FabricaLista {
    /*Fábrica responsável pelos elementos de lista, gerenciando os itens incluídos nela*/
    private Lista lista;
    private ItemLista itemLista;

    public FabricaLista() throws Exception {
        this.lista = new Lista("ul");
        this.itemLista = new ItemLista("li");
    }
    public ItemLista getItemLista(String conteudo){
        itemLista.setConteudo(conteudo);
        return itemLista;
    }
    public String getLista(){
        return lista.geraResultado();
    }
    public void setLista(ItemLista it){
        lista.adicionaItens(it);
    }
}
