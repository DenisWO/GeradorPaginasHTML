package view.pagina;

public class Pagina {
    private String conteudo;
    private String inicioPagina;
    private String finalPagina;
    private Cabecalho cabecalho;
    private Corpo corpo;
    private Rodape rodape;
    private static Pagina pagina;

    private Pagina(){
        this.cabecalho = Cabecalho.getCabecalho();
        this.corpo = Corpo.getCorpo();
        this.rodape = Rodape.getRodape();
        this.conteudo = "";
        this.inicioPagina = "";
        this.finalPagina = "";
    }
    public static Pagina getPagina(){
        if(pagina == null){
            pagina = new Pagina();
        }
        return pagina;
    }
    public void setConteudo(String conteudo){
        String htmlPadrao = "<html><head></head><body></body></html>";
        if(this.conteudo.equals("") && htmlPadrao.equals(conteudo.trim())){
            this.inicioPagina = conteudo.trim().substring(0, 25);
            this.finalPagina = conteudo.trim().substring(25, 39);
        }
    }

    public String getConteudo(){
        this.conteudo = this.inicioPagina + this.cabecalho.getConteudo()
                + this.corpo.getConteudo() + this.rodape.getConteudo() + this.finalPagina;

        return this.conteudo;
    }
    public void setCabecalho(String conteudo){
        this.cabecalho.setConteudo(conteudo);
    }
    public void setCorpo(String conteudo){
        this.corpo.setConteudo(conteudo);
    }
    public void setRodape(String conteudo){
        this.rodape.setConteudo(conteudo);
    }
}
