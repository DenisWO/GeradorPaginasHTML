package view.pagina;

import java.util.ArrayList;

public class Cabecalho {
    /*Implementação do Decorator*/
    private ArrayList<String> conteudo;
    private static Cabecalho cabecalho;

    private Cabecalho(){
        this.conteudo = new ArrayList<>();
        this.setConteudo("<!--Inicio do cabecalho-->");
    }

    public static Cabecalho getCabecalho(){
        if(cabecalho == null){
            cabecalho = new Cabecalho();
        }
        return cabecalho;
    }
    public String getConteudo(){

        String resultado = "";
        for(String content : this.conteudo){
            resultado += content;
        }
        return resultado + "<!--Fim do cabecalho-->";
    }

    public void setConteudo(String conteudo) {
        this.conteudo.add(conteudo);
    }
}
