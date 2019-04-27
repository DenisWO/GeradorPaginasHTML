package model.tags.elemento_padrao;

import java.util.ArrayList;

public abstract class ListaPadrao implements Elemento {
    /*Classe padrão de tags de lista.
     * Implementação do Composite*/
    private String abreTag;
    private String fechaTag;
    private ArrayList<String> conteudo;
    private String nomeTag;
    private String resultado;

    public ListaPadrao(String nome){
        this.nomeTag = nome;
        this.abreTag = "<" + this.nomeTag + ">";
        this.fechaTag = "</" + this.nomeTag + ">";
        this.conteudo = new ArrayList<>();
    }
    @Override
    public String geraResultado(String conteudo){
        this.setConteudo(conteudo);
        return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
    }

    public String geraResultado(){
        return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
    }

    public String geraResultado(Elemento elemento) throws Exception {
        throw new Exception("Elemento de lista não aceita colocar elementos internos!");
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
        String resultado = "";
        for(String content : this.conteudo){
            resultado += content;
        }
        return resultado;
    }

    public void setConteudo(String conteudo) {
        this.conteudo.add(conteudo);
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
