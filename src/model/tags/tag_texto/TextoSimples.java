package model.tags.tag_texto;

import model.tags.elemento_padrao.Elemento;
import model.tags.elemento_padrao.TextoPadrao;

public class TextoSimples extends TextoPadrao {
    private String texto;

    public TextoSimples(String texto) {
        super("");
        super.setAbreTag("");
        super.setFechaTag("");
        this.setTexto(texto);
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String geraResultadoTexto(){
        return this.getTexto();
    }
}
