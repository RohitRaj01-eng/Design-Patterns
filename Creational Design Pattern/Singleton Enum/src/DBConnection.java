public enum DBConnection {
    INSTANCE;

    private String dummyDbName;

    public String getDummyDbName() {
        return dummyDbName;
    }

    public void setDummyDbName(String dummyDbName) {
        this.dummyDbName = dummyDbName;
    }

    public void updateDb(){
        System.out.println("DB updated");
    }
}
