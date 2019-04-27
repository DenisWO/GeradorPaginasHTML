package model.fabrica;

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

    public String getEstruturaHtml(){
        return new FabricaEstrutura().getEstruturaHtml();
    }

    public String getConteudoH1(Object conteudo){
        try{
            return this.fabricaEstrutura.getEstruturaDiv(this.fabricaTagTexto.getH1(conteudo));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /*Todos os retornos vem acompanhando de divs, para organização*/
    public String getConteudoP(Object conteudo){
        try{
            return this.fabricaEstrutura.getEstruturaDiv(this.fabricaTagTexto.getP(conteudo));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String getConteudoImagem(Object conteudo) throws Exception {
        try{
            return this.fabricaEstrutura.getEstruturaDiv(this.fabricaImagens.getImagem(conteudo));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    public String getConteudoLista(Object[] objects){
        try{
            return this.fabricaEstrutura.getEstruturaDiv(this.fabricaLista.getLista(objects));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String getConteudoTabela(){
        try{
            return this.fabricaEstrutura.getEstruturaDiv(this.fabricaTabela.getTabela());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
