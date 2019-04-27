package model.tags.tag_estrutura;

import model.tags.elemento_padrao.Elemento;
import model.tags.elemento_padrao.EstruturaPadrao;
import model.tags.tag_texto.Title;

public class Head extends EstruturaPadrao {

    public Head(String nome) {
        super(nome);
        this.geraResultado();
    }

    @Override
    public String geraResultado(Elemento elemento) throws Exception {
        if(elemento instanceof Title){
            return super.geraResultado(elemento);
        }

        return null;
    }
}
