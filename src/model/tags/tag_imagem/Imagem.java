package model.tags.tag_imagem;

import model.tags.elemento_padrao.Elemento;

public class Imagem implements Elemento {
    private String nomeTag;
    private String abreTag;
    private String fechaTag;
    private String conteudo;
    private String resultado;
    private String parametros;

    public Imagem(String nome) {
        this.nomeTag = nome;
        this.abreTag = "<" + this.nomeTag + ">";
        this.fechaTag = "</" + this.nomeTag + ">";
        this.conteudo = "";
        this.geraResultado("");
        this.parametros = " src=";
    }

    @Override
    public String geraResultado() throws Exception {
        if(this.getConteudo().equals("")){
            throw new Exception("Tag de imagem não pode ser vazia!");
        }
        return this.getAbreTag() + this.getConteudo() + this.getFechaTag();
    }

    @Override
    public String geraResultado(String conteudo) {
        this.setFechaTag("/>");
        this.setConteudo(this.parametros + conteudo);
        this.resultado = this.getAbreTag() + this.getConteudo() + this.getFechaTag();
        return this.resultado;
    }

    @Override
    public String geraResultado(Elemento elemento) throws Exception{
        throw new Exception("Tag de imagem não pode ter elementos dentro!");
    }

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
                throw new Exception("Erro no tipo de objeto!");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
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

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
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
