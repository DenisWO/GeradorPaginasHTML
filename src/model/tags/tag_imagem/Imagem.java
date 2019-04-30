package model.tags.tag_imagem;

import model.tags.elemento_padrao.Elemento;

import java.util.ArrayList;

public class Imagem implements Elemento {
    private String nomeTag;
    private String abreTag;
    private String fechaTag;
    private ArrayList<Elemento> elementos;
    private String resultado;
    private String parametros;

    public Imagem(String nome) {
        this.nomeTag = nome;
        this.abreTag = "<" + this.nomeTag + ">";
        this.fechaTag = "</" + this.nomeTag + ">";
        this.elementos = new ArrayList<>();
        this.parametros = " src=";
    }
    public String geraResultadoTexto(){
        String resultado = "";
        for(Elemento e : this.elementos){
            resultado += e.geraResultadoTexto();
        }

        return resultado;
    }

    public String getNomeTag() {
        return nomeTag;
    }

    public void setNomeTag(String nomeTag) {
        this.nomeTag = nomeTag;
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

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }
}
