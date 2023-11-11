package src.classes;

public class SQLDataBase {
    private String server;
    private String user;
    private String password;

    public SQLDataBase(String server, String user, String password) {
        this.server = server;
        this.user = user;
        this.password = password;
    }

    public void InsertDataIntoTable(String[][] dados) {
        System.out.println("Inserindo dados no BD SQL...");
        for (int i = 0; i < dados.length; i++) {
            System.out.println("Linha " + i + ":");
            for (int j = 0; j < dados[i].length; j++) {
                System.out.println("Coluna " + j + ": " + dados[i][j]);
            }
        }
    }
}



