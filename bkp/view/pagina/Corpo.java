package view.pagina;

public class Corpo {
    private String conteudo;
    private static Corpo corpo;

    private Corpo(){
        this.conteudo = "";
    }
    public static Corpo getCorpo(){
        if(corpo == null){
            corpo = new Corpo();
        }
        return corpo;
    }
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }
    public String getConteudo(){
        return this.conteudo;
    }
}
