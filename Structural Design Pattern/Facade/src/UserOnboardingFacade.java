import services.*;
import entities.*;

public class UserOnboardingFacade {
    private final UserService userService;
    private final EmailService emailService;
    private final AnalyticsService analyticsService;


    public UserOnboardingFacade(UserService userService, EmailService emailService, AnalyticsService analyticsService) {
        this.userService = userService;
        this.emailService = emailService;
        this.analyticsService = analyticsService;
    }

    public SignupResponse onboard(SignupRequest request){
        validateRequest(request);
        User user= userService.createUser(request.username(),request.email());
        System.out.println("User added");
        emailService.sendEmail(user.getUsername(),user.getEmail());
        analyticsService.track(user);
        System.out.println("User created successfully!!!");
        return new SignupResponse(user,true);
    }

    private void validateRequest(SignupRequest request){
        String username= request.username();
        String email= request.email();
        if(username==null || username.isBlank())throw new IllegalArgumentException("Username cannot be empty");
        if(email==null || email.isBlank())throw new IllegalArgumentException("email cannot be empty");
    }
}
