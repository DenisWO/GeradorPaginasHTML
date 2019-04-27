package model.tags.elemento_padrao;

import java.util.ArrayList;

public abstract class TextoPadrao implements Elemento {
    /*Classe padrão de tags de texto.
     * Implementação do Composite*/
    private String abreTag;
    private String fechaTag;
    private ArrayList<String> conteudo;
    private String nomeTag;
    private String resultado;

    public TextoPadrao(String nome){
        this.nomeTag = nome;
        this.abreTag = "<" + this.nomeTag + ">";
        this.fechaTag = "</" + this.nomeTag + ">";
        this.conteudo = new ArrayList<>();
    }
    @Override
    public String geraResultado() throws Exception {
        return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
    }

    @Override
    public String geraResultado(String conteudo) {
        this.setConteudo(conteudo);
        return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
    }

    @Override
    public String geraResultado(Elemento elemento) throws Exception {
        this.setConteudo(elemento.geraResultado());
        return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
    }

    @Override
    public String geraResultado(Object object){
        try{
            if(object instanceof String){
                return this.geraResultado((String) object);
            }
            else if(object instanceof Elemento){
                return this.geraResultado((Elemento) object);
            }
            else if(object == null){
                return this.geraResultado();
            }
            else{
                throw new Exception("Erro na inserção de conteúdo do campo!");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
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
        for(String c: this.conteudo){
            resultado += c;
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
