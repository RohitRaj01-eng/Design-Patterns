public class DBConnection {
    public void query(String query){
        System.out.println("Running: " + query);
    }

    void reset(){
        System.out.println("Resetting the DB connection");
    }
}
