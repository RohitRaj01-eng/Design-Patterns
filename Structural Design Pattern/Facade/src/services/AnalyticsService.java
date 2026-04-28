package services;

import entities.*;

public class AnalyticsService {
    public void track(User user){
        System.out.println("Analytics created for " + user.getUsername());
    }

}
