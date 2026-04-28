void main() {
    DBConnection dbConnection=DBConnection.getInstance();
    dbConnection.updateDb();
    System.out.println(dbConnection.getDummyDbName());
    dbConnection.setDummyDbName("mysql");
    System.out.println(dbConnection.getDummyDbName());

    DBConnection dbConnection1=DBConnection.getInstance();
    dbConnection1.updateDb();
    dbConnection1.setDummyDbName("mera-sql");
    System.out.println(dbConnection1.getDummyDbName());
    System.out.println(dbConnection.getDummyDbName());
}
