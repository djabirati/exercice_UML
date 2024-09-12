public class Main {
    public static void main(String[] args) {

       DatabaseConnection connection1 = DatabaseConnection.getInstance();


        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.connect();
        if (connection1 == connection2) {
            System.out.println("Une seule connexion est utilisée.");
        } else {
            System.out.println("Deux connexions différentes ont été créées.");
        }

    }

}

