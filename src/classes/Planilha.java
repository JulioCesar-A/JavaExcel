package classes;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class Planilha {

    private String nomeArq;
    private File caminhoArq;
    private List <String> conteudo;

    public Planilha(File arquivo) {
        this.nomeArq = arquivo.getName();
        this.caminhoArq = arquivo;
        this.conteudo = new ArrayList<String>();
    }

    public String getNomeArq() {
        return nomeArq;
    }

    public void setNomeArq(String nomeArq) {
        this.nomeArq = nomeArq;
    }

    public File getCaminhoArq() {
        return caminhoArq;
    }

    public void setCaminhoArq(File caminhoArq) {
        this.caminhoArq = caminhoArq;
    }

    public List<String> getConteudo() {
        return conteudo;
    }

    public void setConteudo(List <String> conteudo) {
        this.conteudo = conteudo;
    }    
}
