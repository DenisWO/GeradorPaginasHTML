package view.pagina;

import model.tags.elemento_padrao.Elemento;

import java.util.ArrayList;

public class Corpo {
    /*Implementacao do Decorator*/
    private ArrayList<Elemento> elementos;
    private static Corpo corpo;

    private Corpo(){
        this.elementos = new ArrayList<>();
    }

    public static Corpo getCorpo(){
        if(corpo == null){
            corpo = new Corpo();
        }
        return corpo;
    }
    public void setConteudo(Elemento elemento){
        this.elementos.add(elemento);
    }
    public ArrayList<Elemento> getConteudo(){
        return this.elementos;
    }
}
