package src;

import src.classes.ExcelToSQLAdapter;
import src.classes.Row;
import src.classes.SQLDataBase;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SQLDataBase sqlDataBase = new SQLDataBase("localhost", "root", "root");
        ExcelToSQLAdapter adapter = new ExcelToSQLAdapter(sqlDataBase);

        List<Row> dados = adapter.lerDadosExcel("arquivo.xls", 4, 4);

        System.out.println("Dados lidos do excel: ");
        for (Row dado : dados) {
            for (String s : dado.columns) {
                System.out.print(s + "; ");
            }
            System.out.println();
        }
    }
}



