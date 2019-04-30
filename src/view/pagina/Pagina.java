package view.pagina;

import model.tags.elemento_padrao.Elemento;
import model.tags.tag_estrutura.HTML;

import java.util.ArrayList;

public class Pagina {
    private HTML html;
    private Cabecalho cabecalho;
    private Corpo corpo;
    private Rodape rodape;
    private static Pagina pagina;

    private Pagina(){
        this.cabecalho = Cabecalho.getCabecalho();
        this.corpo = Corpo.getCorpo();
        this.rodape = Rodape.getRodape();
    }
    public static Pagina getPagina(){
        if(pagina == null){
            pagina = new Pagina();
        }
        return pagina;
    }
    public void setConteudo(HTML html){
        this.html = html;
    }
    public String getConteudo(){
        String resultado = this.html.getAbreTag();

        for(Elemento e:  this.cabecalho.getConteudo()){
            this.html.getBody().setConteudo(e);
        }
        for(Elemento e: this.corpo.getConteudo()){
            this.html.getBody().setConteudo(e);
        }
        for(Elemento e: this.rodape.getConteudo()){
            this.html.getBody().setConteudo(e);
        }
        for(Elemento elemento : this.html.getConteudo()){
            resultado += elemento.geraResultadoTexto();
        }

        return resultado + this.html.getFechaTag();
    }
    public void setCabecalho(Elemento elemento){
        this.cabecalho.setConteudo(elemento);
    }
    public ArrayList<Elemento> getCabecalho(){
        return this.cabecalho.getConteudo();
    }
    public void setCorpo(Elemento elemento){
        this.corpo.setConteudo(elemento);
    }

    public ArrayList<Elemento> getCorpo(){
        return this.corpo.getConteudo();
    }
    public void setRodape(Elemento elemento){
        this.rodape.setConteudo(elemento);
    }
    public ArrayList<Elemento> getRodape(){
        return this.rodape.getConteudo();
    }
}
