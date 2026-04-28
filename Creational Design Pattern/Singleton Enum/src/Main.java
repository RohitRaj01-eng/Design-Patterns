//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    DBConnection dbConnection=DBConnection.INSTANCE;
    dbConnection.updateDb();
    System.out.println(dbConnection.getDummyDbName());
    dbConnection.setDummyDbName("mysql");
    System.out.println(dbConnection.getDummyDbName());

    DBConnection dbConnection1=DBConnection.INSTANCE;
    dbConnection1.updateDb();
    System.out.println(dbConnection1.getDummyDbName());
    dbConnection1.setDummyDbName("mera-sql");
    System.out.println(dbConnection1.getDummyDbName());
    System.out.println(dbConnection.getDummyDbName());
}
