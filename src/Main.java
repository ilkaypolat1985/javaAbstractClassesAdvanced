public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        // Change database manager
        customerManager.setDatabaseManager(new OracleDatabaseManager());
        customerManager.getCustomers();

        // Change database manager
        customerManager.setDatabaseManager(new SQLServerDatabaseManager());
        customerManager.getCustomers();
    }
}
