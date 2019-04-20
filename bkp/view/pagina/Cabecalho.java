package view.pagina;

public class Cabecalho {
    private String conteudo;
    private static Cabecalho cabecalho;

    private Cabecalho(){
        this.conteudo = "";
    }

    public static Cabecalho getCabecalho(){
        if(cabecalho == null){
            cabecalho = new Cabecalho();
        }
        return cabecalho;
    }
    private void setCabecalho(String conteudo){
        this.conteudo = conteudo;
    }
    public String getConteudo(){
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
