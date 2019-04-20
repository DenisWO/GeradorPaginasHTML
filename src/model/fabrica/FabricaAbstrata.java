package model.fabrica;

public class FabricaAbstrata {
    /*Essa fabrica é responsável pela gerência de cada fábrica específica, que por sua vez é
    * responsável pela gerência dos tipos de elementos que pertecem a ela*/

    public String getConteudoH1(String conteudo){
        return new FabricaEstrutura().getEstruturaDiv(new FabricaTagTexto().getH1(conteudo)) + "\n";
    }
    public String getConteudoP(String conteudo){
        return new FabricaEstrutura().getEstruturaDiv(new FabricaTagTexto().getP(conteudo)) + "\n";
    }
    public String getEstruturaHtml(){
        return new FabricaEstrutura().getEstruturaHtml();
    }
    public String getConteudoImagem(String conteudo){
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
