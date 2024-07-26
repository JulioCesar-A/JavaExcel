package dao;

import java.io.File;
import java.util.List;
import mainAux.Planilha;

public interface PlanilhaDAO {
    File criarPlanilha (String nomeArq);

    void preencherPlanilha (String conteudo);

    void deletarPlanilha (Planilha planilha);

    List<Planilha> buscarTodas();
}