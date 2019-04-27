package model.fabrica;

import model.tags.elemento_padrao.Elemento;
import model.tags.tag_imagem.Imagem;

public class FabricaImagens {
    /*Fabrica responsável pela gerencia de imagens*/
    private Imagem imagem;

    public FabricaImagens(){
        this.imagem = new Imagem("img");
    }
    public String getImagem(Object conteudo){
        try{
            return this.imagem.geraResultado(conteudo);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
