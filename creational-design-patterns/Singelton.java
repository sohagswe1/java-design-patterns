class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Database Connected");
    }

    public static DatabaseConnection getInstance() {

        if (instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("Using Singleton Object");
    }
}

public class Singelton {

    public static void main(String[] args) {

        DatabaseConnection obj1 = DatabaseConnection.getInstance();

        DatabaseConnection obj2 = DatabaseConnection.getInstance();

        obj1.showMessage();

        if (obj1 == obj2) {
            System.out.println("Same Object");
        } else {
            System.out.println("Different Object");
        }
    }
}
