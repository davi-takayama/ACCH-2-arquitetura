package src.classes;

import java.util.List;

public class ExcelToSQLAdapter extends ExcelDataSource{
    private final SQLDataBase sqlDataBase;

    public ExcelToSQLAdapter(SQLDataBase sqlDataBase) {
        this.sqlDataBase = sqlDataBase;
    }

    @Override
    public List<Row> lerDadosExcel(String arquivo, int inicio, int fim) {
        List<Row> linhas = super.lerDadosExcel(arquivo, inicio, fim);
        String[][] dados = new String[linhas.size()][];
        for (int i = 0; i < linhas.size(); i++) {
            dados[i] = linhas.get(i).columns.toArray(new String[0]);
        }
        sqlDataBase.InsertDataIntoTable(dados);
        return linhas;
    }
}





