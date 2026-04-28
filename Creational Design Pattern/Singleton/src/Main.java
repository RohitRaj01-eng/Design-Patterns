void main() {
    DBConnection.init("mysql");
    DBConnection dbConnection=DBConnection.getDbConnection();
    dbConnection.updateDB();
    dbConnection.setDummyDbName("mera-sql");
    System.out.println(dbConnection.getDbName());
    System.out.println(dbConnection.getDummyDbName());

    DBConnection dbConnection1=DBConnection.getDbConnection();
    dbConnection1.updateDB();
    dbConnection.setDummyDbName("sbka-sql");
    System.out.println(dbConnection1.getDbName());
    System.out.println(dbConnection1.getDummyDbName());
    System.out.println(dbConnection.getDbName());
    System.out.println(dbConnection.getDummyDbName());

    DBConnection.init("sql-lite"); // error
}
