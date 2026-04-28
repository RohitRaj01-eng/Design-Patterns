public class DBConnection {
    private String dummyDbName;
    private DBConnection(){}
    private class Holder{
        private static final DBConnection INSTANCE=new DBConnection();
    }

    public static DBConnection getInstance(){
        return Holder.INSTANCE;
    }

    public String getDummyDbName() {
        return dummyDbName;
    }

    public void setDummyDbName(String dummyDbName) {
        this.dummyDbName = dummyDbName;
    }

    public void updateDb(){
        System.out.println("DB updated.");
    }
}
