public class DBConnection {
    private final String dbName;
    private String dummyDbName;
    private static String configuredDbName;
    private DBConnection(String dbName){
        this.dbName=dbName;
    }

    public static void init(String dbName){
        if(configuredDbName!=null)throw new IllegalStateException("Already initialised");
        configuredDbName=dbName;
    }

    private static class Holder{
        private static final DBConnection INSTANCE=new DBConnection(configuredDbName);
    }

    public static DBConnection getInstance(){
        if(configuredDbName==null)throw new IllegalStateException("Not initialised yet.");
        return Holder.INSTANCE;
    }

    public String getDummyDbName() {
        return dummyDbName;
    }

    public void setDummyDbName(String dummyDbName) {
        this.dummyDbName = dummyDbName;
    }

    public void updateDb(){
        System.out.println("DB updated");
    }

    public String getDbName() {
        return dbName;
    }
}
