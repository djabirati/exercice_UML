public class DatabaseConnection {
    private static DatabaseConnection instance;
    private DatabaseConnection() {
        System.out.println("Connexion à la base de données établie.");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void connect() {
        System.out.println("Action de connexion effectuée.");
    }


}
