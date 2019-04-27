package model.tags.tag_lista;

import model.tags.elemento_padrao.Elemento;
import model.tags.elemento_padrao.ListaPadrao;

import java.util.ArrayList;

public class Lista extends ListaPadrao {
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
    public String geraResultado(Elemento elemento) throws Exception {
        if(elemento instanceof ItemLista){
            this.setConteudo(elemento.geraResultado());
            return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
        }

        throw new Exception("Outro tipo de elemento não pode ser inserido na lista!");
    }
    public String geraResultado(Object[] objects){
        for(Object object : objects){
            if(object instanceof ItemLista){
                this.adicionaItens((ItemLista) object);
            }
        }
        return this.geraResultado();
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
