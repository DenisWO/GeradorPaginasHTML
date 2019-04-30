package model.tags.elemento_padrao;

import java.util.ArrayList;

public interface Elemento {
    /*Interface geral que deve ser implementada em todos os elementos usados*/
    public String geraResultadoTexto();
    public ArrayList<Elemento> getConteudo();
    public void setConteudo(Elemento elemento);
}
