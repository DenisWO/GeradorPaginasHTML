package model.tags.tag_estrutura;

import model.tags.elemento_padrao.Elemento;
import model.tags.elemento_padrao.EstruturaPadrao;
import model.tags.tag_texto.Title;

public class Head extends EstruturaPadrao {

    public Head(String nome) {
        super(nome);
    }

    public void setConteudo(Title title){
        super.setConteudo(title);
    }
}
