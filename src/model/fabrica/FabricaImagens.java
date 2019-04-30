package model.fabrica;

import model.tags.elemento_padrao.Elemento;
import model.tags.tag_imagem.Imagem;

public class FabricaImagens {
    /*Fabrica responsável pela gerencia de imagens*/
    private Imagem imagem;

    public FabricaImagens(){
        this.imagem = new Imagem("img");
    }
    public Elemento getImagem(Elemento elemento){
        try{
            return this.imagem;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
