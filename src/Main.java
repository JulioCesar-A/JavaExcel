import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        
        String diretorio = System.getProperty("user.dir");
        String nomeArq, caminho;

        
        
        int opcao;
        
        
        boolean continuar = true;
        while(continuar) {

            FuncAux.menuIni();


            opcao = inputUser.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Opção Criar arquivo selecionada!");


                    break;
                case 2:
                    System.out.println("Opção Preencher planilha selecionada!");
                    
                    
                    break;
                case 3:
                    System.out.println("Opção Excluir planilha selecionada!");    

                    
                    break;
            
                case 0:
                    System.out.println("Terminando a execução...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }

        inputUser.close();
    }
}
