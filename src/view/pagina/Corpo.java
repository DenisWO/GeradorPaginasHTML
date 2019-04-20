package view.pagina;

import java.util.ArrayList;

public class Corpo {
    private ArrayList<String> conteudo;
    private static Corpo corpo;

    private Corpo(){
        this.conteudo = new ArrayList<>();
        this.setConteudo("<!--Inicio do corpo-->");
    }
    public static Corpo getCorpo(){
        if(corpo == null){
            corpo = new Corpo();
        }
        return corpo;
    }
    public void setConteudo(String conteudo){
        this.conteudo.add(conteudo);
    }
    public String getConteudo(){
        String resultado = "";
        for(String content : this.conteudo){
            resultado += content;
        }
        return resultado + "<!--Fim do corpo-->";
    }
}
