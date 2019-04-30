package view.pagina;

import model.tags.elemento_padrao.Elemento;

import javax.swing.text.AbstractDocument;
import java.util.ArrayList;

public class Cabecalho {
    /*Implementação do Decorator*/
    private ArrayList<Elemento> elementos;
    private static Cabecalho cabecalho;

    private Cabecalho(){
        this.elementos = new ArrayList<>();
    }

    public static Cabecalho getCabecalho(){
        if(cabecalho == null){
            cabecalho = new Cabecalho();
        }
        return cabecalho;
    }
    public ArrayList<Elemento> getConteudo(){
        return this.elementos;
    }

    public void setConteudo(Elemento elemento) {
        this.elementos.add(elemento);
    }
}
