package view.pagina;

import model.tags.elemento_padrao.Elemento;

import java.util.ArrayList;

public class Rodape {
    /*Implementacao do Decorator*/
    private ArrayList<Elemento> elementos;
    private static Rodape rodape;

    private Rodape(){
        this.elementos = new ArrayList<>();
    }

    public static Rodape getRodape(){
        if(rodape ==null){
          rodape = new Rodape();
        }

        return rodape;
    }
    public void setConteudo(Elemento elemento){
        this.elementos.add(elemento);
    }
    public ArrayList<Elemento> getConteudo(){
        return this.elementos;
    }
}
