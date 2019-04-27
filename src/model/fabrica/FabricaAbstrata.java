package model.fabrica;

import model.tags.elemento_padrao.Elemento;

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

    public String getConteudoH1(String conteudo) throws Exception {
        return this.fabricaEstrutura.getEstruturaDiv(this.fabricaTagTexto.getH1(conteudo));
    }
    public String getConteudoH1(Elemento elemento) throws Exception {
        return this.fabricaEstrutura.getEstruturaDiv(this.fabricaTagTexto.getH1(elemento));
    }
    public String getConteudoP(String conteudo) throws Exception {
        return this.fabricaEstrutura.getEstruturaDiv(this.fabricaTagTexto.getP(conteudo));
    }
    public String getEstruturaHtml(){
        return new FabricaEstrutura().getEstruturaHtml();
    }
    public String getConteudoImagem(String conteudo) throws Exception {
        return new FabricaEstrutura().getEstruturaDiv(new FabricaImagens().getImagem(conteudo));
    }
    public String getConteudoLista() throws Exception {
        return new FabricaLista().getLista();
    }
    public void setConteudoLista(String conteudo) throws Exception {
        new FabricaLista().setLista(new FabricaLista().getItemLista(conteudo));
    }
    public String getConteudoTabela(){
        return new FabricaTabela().getTabela();
    }
    public void setConteudoTabela(String conteudo){
        new FabricaTabela().setTabela(new FabricaTabela().getTabelaLinha(conteudo));
    }




}
