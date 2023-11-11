package src.classes;

import java.util.ArrayList;
import java.util.List;

public class ExcelDataSource {
    public List<Row> lerDadosExcel(String arquivo, int inicio, int fim) {
        List<Row> linhas = new ArrayList<>();
        System.out.println("Lendo dados excel do arquivo... " + arquivo);
        for (int i = 0; i < inicio; i++) {
            List<String> colunas = new ArrayList<>();
            for (int j = 0; j < fim; j++) {
                colunas.add(String.format("(L%d-C%d)", i, j));
            }
            linhas.add(new Row(colunas));
        }
        return linhas;
    }

}




