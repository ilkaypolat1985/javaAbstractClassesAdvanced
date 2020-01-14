public class CustomerManager {
    private BaseDatabaseManager databaseManager;

    public void getCustomers(){
        databaseManager.getData();
    }

    public BaseDatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(BaseDatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }
}
