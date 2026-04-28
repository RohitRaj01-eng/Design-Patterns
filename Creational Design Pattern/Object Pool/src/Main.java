void main() {
    DBConnectionPool dbConnectionPool=new DBConnectionPool(2);
    DBConnection dbConnection1=dbConnectionPool.borrow();
    dbConnection1.query("select * from users;");
    DBConnection dbConnection2=dbConnectionPool.borrow();
    dbConnection2.query("select email from user_profile;");
    dbConnectionPool.release(dbConnection2);
    DBConnection dbConnection3=dbConnectionPool.borrow();
    dbConnection3.query("drop table user;");
}
