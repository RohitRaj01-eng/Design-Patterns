package services;
import entities.*;

public class UserService {

    public User createUser(String username,String email){
        return new User(username,email);
    }
}
