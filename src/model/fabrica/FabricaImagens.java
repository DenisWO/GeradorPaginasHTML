package model.fabrica;

import model.tags.tag_imagem.Imagem;

public class FabricaImagens {
    /*Fabrica responsável pela gerencia de imagens*/
    private Imagem imagem;

    public FabricaImagens(){
        this.imagem = new Imagem("img");
    }
    public String getImagem(String conteudo){
        return imagem.geraResultado(conteudo);
    }
}
