package model.tags.elemento_padrao;

public abstract class TabelaPadrao implements Elemento{
    private String abreTag;
    private String fechaTag;
    private String conteudo;
    private String nomeTag;
    private String resultado;

    public TabelaPadrao(String nome){
        this.nomeTag = nome;
        this.abreTag = "<" + this.nomeTag + ">";
        this.fechaTag = "</" + this.nomeTag + ">";
        this.conteudo = "";
    }

    public String geraResultado(String conteudo){
        this.setConteudo(conteudo);
        return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
    }

    public String geraResultado(){
        return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
    }

    public String geraResultado(Elemento elemento) throws Exception {
        this.setConteudo(elemento.geraResultado());
        return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
    }

    public String getAbreTag() {
        return abreTag;
    }

    public void setAbreTag(String abreTag) {
        this.abreTag = abreTag;
    }

    public String getFechaTag() {
        return fechaTag;
    }

    public void setFechaTag(String fechaTag) {
        this.fechaTag = fechaTag;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getNomeTag() {
        return nomeTag;
    }

    public void setNomeTag(String nomeTag) {
        this.nomeTag = nomeTag;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
