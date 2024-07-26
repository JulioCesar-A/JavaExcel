package mainAux;

public abstract class FuncAux {
    
    public static void mensagemBemVindo() {
        System.out.println("Bem-vindos (as) ao sistema de criação e preenchimento de planilhas");
        System.out.println();
        System.out.println("Recomendamos que leia a README para melhor experiência e entendimento sobre o sistema");
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void menuInicial() {
        System.out.println("Selecione uma das opções");
        System.out.println(" ------------------------");
        System.out.println("| 1. Criar arquivo");
        System.out.println("| 2. Preencher planilha");
        System.out.println("| 3. Listar planilhas");
        System.out.println("| 4. Excluir planilha");
        System.out.println("| 0. Sair");
        System.out.println(" ------------------------");
        System.out.println();
        System.out.print("-> ");
    }

    public static void mensagemRetorno(){
        System.out.println("Retornando para o menu inicial...");
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static boolean encerrarPrograma() {
        System.out.println("Encerrando programa...");
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return false;
    }
}
