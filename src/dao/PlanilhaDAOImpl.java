package dao;

import java.io.File;
import java.io.IOException;

import mainAux.*;

public class PlanilhaDAOImpl implements PlanilhaDAO {
    
    public File criarPlanilha (String nomeArq)  {

        File fDiretorio = new File(System.getProperty("user.dir").concat("\\sheets"));

        
        if (verificarDiretorio(fDiretorio) == true) {
            
            System.out.println("Prosseguindo...");
            
        } else {
            
            criarDiretorio(fDiretorio);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        File fArquivo = new File(fDiretorio.getPath() + "\\" + nomeArq);


        if (verificarArquivo(fArquivo) == true) {
            
            System.out.println("Uma planilha com esse nome já existe, tente outro nome");
            fArquivo = null;

        } else {

            System.out.println("Criando o arquivo " + nomeArq);

        }
        return fArquivo;
    }
    
    private boolean verificarDiretorio (File diretorio) {
        System.out.println("Verificando informações sobre o diretório 'sheets'...");
        if (diretorio.exists()) {
            System.out.println("Diretório já existe");
            System.out.println();
            return true;
        } else {
            System.out.println("Diretório não existe, tentaremos criá-lo agora...");
            System.out.println();
            return false;
        }
    }

    private void criarDiretorio(File diretorio){
        if (diretorio.mkdir()){
            System.out.println("Diretório criado com sucesso");
            System.out.println();
            System.out.println("Prosseguindo...");
        } else {
            System.out.println("Diretório não foi criado");
        }
    }
    
    private boolean verificarArquivo (File arquivo) {
        if (arquivo.exists()) {
            return true;
        } else {
            return false;
        }
    }
    
    

}
