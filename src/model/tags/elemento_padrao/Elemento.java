package model.tags.elemento_padrao;

public interface Elemento {

    public String geraResultado() throws Exception;
    public String geraResultado(String conteudo);
    public String geraResultado(Elemento elemento) throws Exception;

//    /*Elemento padrão. Deve ser herdado por todos os elementos.
//    * Contém métodos padrões que todos elementos devem utilizar*/
//    private String abreTag;
//    private String fechaTag;
//    private String conteudo;
//    private String params;
//    private String nomeTag;
//    private String resultado;
//
//    public Elemento(String nome){
//        this.nomeTag = nome;
//        this.abreTag = "<" + this.nomeTag + ">";
//        this.fechaTag = "</" + this.nomeTag + ">";
//        this.params = "";
//        this.conteudo = "";
//    }
//
//    public String getAbreTag() {
//        return abreTag;
//    }
//
//    public void setAbreTag(String abreTag) {
//        this.abreTag = abreTag;
//    }
//
//    public String getFechaTag() {
//        return fechaTag;
//    }
//
//    public void setFechaTag(String fechaTag) {
//        this.fechaTag = fechaTag;
//    }
//
//    public String getConteudo() {
//        return conteudo;
//    }
//
//    public void setConteudo(String conteudo) {
//        this.conteudo = conteudo;
//    }
//
//    public String getParams() {
//        return params;
//    }
//
//    public void setParams(String params) {
//        this.params = params;
//    }
//
//    public String getNomeTag() {
//        return nomeTag;
//    }
//
//    public void setNomeTag(String nomeTag) {
//        this.nomeTag = nomeTag;
//    }
//
//    public String geraResultado(String conteudo){
//        this.setConteudo(conteudo);
//        return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
//    }
//    public String geraResultado(){
//        return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
//    }
}
