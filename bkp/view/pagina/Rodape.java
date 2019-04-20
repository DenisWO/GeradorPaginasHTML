package view.pagina;

public class Rodape {
    private String conteudo;
    private static Rodape rodape;

    private Rodape(){
        this.conteudo = "";
    }

    public static Rodape getRodape(){
        if(rodape ==null){
          rodape = new Rodape();
        }

        return rodape;
    }
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }
    public String getConteudo(){
        return this.conteudo;
    }
}
