package model.tags.elemento_padrao;

public interface Elemento {
    /*Interface geral que deve ser implementada em todos os elementos usados*/
    public String geraResultado() throws Exception;
    public String geraResultado(String conteudo);
    public String geraResultado(Elemento elemento) throws Exception;
    public String geraResultado(Object object);
}
