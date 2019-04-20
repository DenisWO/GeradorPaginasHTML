package view.pagina;

import java.util.ArrayList;

public class Rodape {
    private ArrayList<String> conteudo;
    private static Rodape rodape;

    private Rodape(){
        this.conteudo = new ArrayList<>();
        this.setConteudo("<!--Inicio do rodape-->");
    }

    public static Rodape getRodape(){
        if(rodape ==null){
          rodape = new Rodape();
        }

        return rodape;
    }
    public void setConteudo(String conteudo){
        this.conteudo.add(conteudo);
    }
    public String getConteudo(){

        String resultado = "";
        for(String content : this.conteudo){
            resultado += content;
        }
        return resultado + "<!--Fim do rodape-->";
    }
}
