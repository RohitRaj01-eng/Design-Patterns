package services;

public class EmailService {

    public void sendEmail(String username, String email){

        if(email==null || email.isBlank())throw new IllegalStateException("Email is not available");
        System.out.println("Email sent to " +  username);
    }
}
