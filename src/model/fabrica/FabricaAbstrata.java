package model.fabrica;

import model.tags.elemento_padrao.Elemento;
import model.tags.tag_estrutura.HTML;

public class FabricaAbstrata {
    /*Implementacao da Fachada*/
    private FabricaEstrutura fabricaEstrutura;
    private FabricaLista fabricaLista;
    private FabricaTabela fabricaTabela;
    private FabricaTagTexto fabricaTagTexto;
    private FabricaImagens fabricaImagens;

    public FabricaAbstrata() throws Exception {
        this.fabricaEstrutura = new FabricaEstrutura();
        this.fabricaImagens = new FabricaImagens();
        this.fabricaLista = new FabricaLista();
        this.fabricaTabela = new FabricaTabela();
        this.fabricaTagTexto = new FabricaTagTexto();
    }

    public HTML getEstruturaHtml(){
        return new FabricaEstrutura().getEstruturaHtml();
    }

    public Elemento getConteudoH1(Elemento conteudo){
        try{
            return this.fabricaEstrutura.getEstruturaDiv(this.fabricaTagTexto.getH1(conteudo));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /*Todos os retornos vem acompanhando de divs, para organização*/
    public Elemento getConteudoP(Elemento conteudo){
        try{
            return this.fabricaEstrutura.getEstruturaDiv(this.fabricaTagTexto.getP(conteudo));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Elemento getConteudoImagem(Elemento conteudo) throws Exception {
        try{
            return this.fabricaEstrutura.getEstruturaDiv(this.fabricaImagens.getImagem(conteudo));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
//    public Elemento getConteudoLista(Elemento elemento){
//        try{
//            return this.fabricaEstrutura.getEstruturaDiv(this.fabricaLista.getLista(elemento));
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//            return null;
//        }
//    }
//
//    public String getConteudoTabela(){
//        try{
//            return this.fabricaEstrutura.getEstruturaDiv(this.fabricaTabela.getTabela());
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//            return null;
//        }
//    }
}
