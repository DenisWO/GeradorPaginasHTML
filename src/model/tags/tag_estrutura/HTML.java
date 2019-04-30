package model.tags.tag_estrutura;

import model.tags.elemento_padrao.Elemento;
import model.tags.elemento_padrao.EstruturaPadrao;

public class HTML extends EstruturaPadrao {
    private Head head;
    private Body body;

    public HTML(String nome){
        super(nome);
        this.head = new Head("head");
        this.body = new Body("body");
        this.setConteudo(this.head);
        this.setConteudo(this.body);
    }
    public void setConteudo(Head head){
        super.setConteudo(head);
    }
    public void setConteudo(Body body){
        super.setConteudo(body);
    }

    public Head getHead() {
        return head;
    }

    public Body getBody() {
        return body;
    }


}
