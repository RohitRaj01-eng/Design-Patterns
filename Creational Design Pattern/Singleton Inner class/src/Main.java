void main() {
    DBConnection.init("mysql");
    DBConnection dbConnection=DBConnection.getInstance();
    dbConnection.updateDb();
    System.out.println(dbConnection.getDummyDbName());
    dbConnection.setDummyDbName("mera-mysql");
    System.out.println(dbConnection.getDummyDbName());
    DBConnection dbConnection1=DBConnection.getInstance();
    dbConnection1.setDummyDbName("sbla-sql");
    System.out.println(dbConnection1.getDummyDbName());
    System.out.println(dbConnection.getDummyDbName());
    System.out.println(dbConnection.getDbName());
    DBConnection.init("sql-lite");  // error
}
