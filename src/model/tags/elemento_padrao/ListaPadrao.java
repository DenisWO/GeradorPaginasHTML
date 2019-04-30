package model.tags.elemento_padrao;

import java.util.ArrayList;

public abstract class ListaPadrao implements Elemento {
    /*Classe padrão de tags de lista.
     * Implementação do Composite*/
    private String abreTag;
    private String fechaTag;
    private ArrayList<Elemento> elementos;
    private String nomeTag;
    private String resultado;

    public ListaPadrao(String nome){
        this.nomeTag = nome;
        this.abreTag = "<" + this.nomeTag + ">";
        this.fechaTag = "</" + this.nomeTag + ">";
        this.elementos = new ArrayList<>();
    }
    public String geraResultadoTexto(){
        String resultado = this.getAbreTag();
        for(Elemento e : this.elementos){
            resultado += e.geraResultadoTexto();
        }

        return resultado + this.getFechaTag();
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

    public ArrayList<Elemento> getConteudo() {
        return this.elementos;
    }

    public void setConteudo(Elemento elemento) {
        this.elementos.add(elemento);
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
