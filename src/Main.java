import java.util.Scanner;
import dao.*;
import auxs.FuncAux;
import classes.Planilha;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        
        
        String nomeArq;

        Planilha planilha = null;  
        boolean continuar = true;
        
        int opcao;

        FuncAux.mensagemBemVindo();

        PlanilhaDAO dao = new PlanilhaDAOImpl();

        while(continuar) {

            FuncAux.menuInicial();


            opcao = inputUser.nextInt();
            inputUser.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Opção Criar arquivo selecionada!");
                    System.out.println();

                    System.out.println("Informe o nome (sem a extensão) do arquivo a ser criado");
                    System.out.print("-> ");
                    nomeArq = inputUser.nextLine().concat(".csv");
                    planilha = new Planilha(dao.criarPlanilha(nomeArq));

                    FuncAux.mensagemRetorno();

                    break;
                case 2:
                    System.out.println("Opção Preencher planilha selecionada!");
                    
                    
                    break;
                case 3:
                    System.out.println("Opção Listar planilha selecionada!");

                    break;
                case 4:
                    System.out.println("Opção Excluir planilha selecionada!");    

                    dao.deletarPlanilha(planilha);
                    break;
            
                case 0:
                    continuar = FuncAux.encerrarPrograma();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }

        inputUser.close();
    }
}
